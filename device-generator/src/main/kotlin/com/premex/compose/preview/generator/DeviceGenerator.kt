package com.premex.compose.preview.generator

import com.premex.compose.preview.generator.fetcher.DeviceFetcher
import com.premex.compose.preview.generator.generator.DevicesFileGenerator
import com.premex.compose.preview.generator.generator.ManufacturerExtensionGenerator
import kotlinx.coroutines.runBlocking
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.system.exitProcess

/**
 * Main entry point for the device specification generator.
 * 
 * This replaces the bash script functionality with Kotlin code and KotlinPoet for generating
 * device specification files.
 */
fun main(args: Array<String>) {
    try {
        runBlocking {
            val dryRun = args.contains("--dry-run")
            val generator = DeviceGenerator()
            
            if (dryRun) {
                generator.dryRun()
            } else {
                generator.generateDeviceFiles()
            }
            
            println("🎉 Device generation completed successfully!")
            println("Run 'git diff' to see the changes made.")
        }
        
    } catch (e: Exception) {
        println("[ERROR] Device generation failed: ${e.message}")
        e.printStackTrace()
        exitProcess(1)
    }
}

/**
 * Device generation orchestrator that coordinates fetching, processing and generating device files.
 */
class DeviceGenerator {
    private val deviceFetcher = DeviceFetcher()
    private val devicesFileGenerator = DevicesFileGenerator()
    private val manufacturerExtensionGenerator = ManufacturerExtensionGenerator()
    
    // Project paths
    private val projectRoot = findProjectRoot()
    private val librarySourcePath = projectRoot.resolve("library/src/main/kotlin")
    private val devicesFilePath = librarySourcePath
    private val extensionsPath = librarySourcePath.resolve("com/premex/compose/preview/devices")
    
    /**
     * Performs a dry run to show what would be generated without actually generating files.
     */
    suspend fun dryRun() {
        println("🔍 Performing dry run - no files will be modified...")
        
        val devices = deviceFetcher.fetchDeviceSpecs()
        val googleDevices = devices.filter { it.isGoogleDevice }
        val nonGoogleDevices = devices.filterNot { it.isGoogleDevice }
        val manufacturers = nonGoogleDevices.groupBy { it.toManufacturerClassName() }
        
        println("\n📊 Summary of what would be generated:")
        println("- Total devices: ${devices.size}")
        println("- Google devices (for main Devices.kt): ${googleDevices.size}")
        println("- Third-party devices: ${nonGoogleDevices.size}")
        println("- Manufacturer extensions: ${manufacturers.size}")
        
        println("\nManufacturer breakdown:")
        manufacturers.forEach { (manufacturer, devices) ->
            println("  - $manufacturer: ${devices.size} devices")
        }
        
        println("\nFiles that would be generated:")
        println("  - library/src/main/kotlin/com/premex/compose/preview/Devices.kt")
        manufacturers.keys.sorted().forEach { manufacturer ->
            println("  - library/src/main/kotlin/com/premex/compose/preview/devices/${manufacturer}Devices.kt")
        }
    }
    
    /**
     * Generates all device specification files.
     */
    suspend fun generateDeviceFiles() {
        println("🏭 Starting Android Compose Preview device generation...")
        
        // Fetch device specifications
        val devices = deviceFetcher.fetchDeviceSpecs()
        
        // Generate main Devices.kt file
        devicesFileGenerator.generateDevicesFile(devices, devicesFilePath)
        
        // Generate manufacturer extension files
        manufacturerExtensionGenerator.generateManufacturerExtensions(devices, librarySourcePath)
        
        // Validate the generation
        validateGeneration()
    }
    
    /**
     * Validates that the generated files can be compiled.
     */
    private fun validateGeneration() {
        println("[INFO] Validating generated files...")
        
        // Check if files exist
        val devicesFile = devicesFilePath.resolve("com/premex/compose/preview/Devices.kt").toFile()
        if (!devicesFile.exists()) {
            error("Main Devices.kt file was not generated")
        }
        
        val extensionsDir = extensionsPath.toFile()
        if (!extensionsDir.exists() || extensionsDir.listFiles()?.isEmpty() == true) {
            error("No manufacturer extension files were generated")
        }
        
        println("[INFO] ✅ Generated files validation passed")
        
        // Optionally run a build to verify compilation
        try {
            val projectDir = findProjectRoot().toFile()
            val process = ProcessBuilder("./gradlew", "build", "--quiet")
                .directory(projectDir)
                .inheritIO()
                .start()
                
            val exitCode = process.waitFor()
            if (exitCode == 0) {
                println("[INFO] ✅ Build successful - generated files compile correctly")
            } else {
                println("[WARN] Build failed - there may be compilation issues with generated files")
            }
        } catch (e: Exception) {
            println("[WARN] Could not run validation build: ${e.message}")
        }
    }
    
    /**
     * Finds the project root directory by looking for gradle files.
     */
    private fun findProjectRoot(): Path {
        var current = Paths.get("").toAbsolutePath()
        
        while (current != null) {
            if (current.resolve("settings.gradle.kts").toFile().exists() ||
                current.resolve("settings.gradle").toFile().exists()) {
                return current
            }
            current = current.parent
        }
        
        // Fallback - assume we're already at root
        return Paths.get("").toAbsolutePath()
    }
}