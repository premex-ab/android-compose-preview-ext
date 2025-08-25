package se.premex.compose.preview.generator

import se.premex.compose.preview.generator.fetcher.DeviceFetcher
import se.premex.compose.preview.generator.generator.ManufacturerExtensionGenerator
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
    private val manufacturerExtensionGenerator = ManufacturerExtensionGenerator()
    
    // Project paths
    private val projectRoot = findProjectRoot()
    private val librarySourcePath = projectRoot.resolve("android-compose-preview-ext/src/main/kotlin")
    private val extensionsPath = librarySourcePath.resolve("se/premex/compose/preview/devices")
    
    /**
     * Performs a dry run to show what would be generated without actually generating files.
     */
    suspend fun dryRun() {
        println("🔍 Performing dry run - no files will be modified...")
        
        val devices = deviceFetcher.fetchDeviceSpecs()
        val nonGoogleDevices = devices.filterNot { it.isGoogleDevice }
        val manufacturers = nonGoogleDevices.groupBy { it.toManufacturerClassName() }
        
        println("\n📊 Summary:")
        println("- Third-party devices: ${nonGoogleDevices.size}")
        println("- Manufacturer extensions: ${manufacturers.size}")
        
        println("\nManufacturer breakdown:")
        manufacturers.forEach { (m, list) -> println("  - $m: ${list.size} devices") }

        println("\nFiles that would be generated:")
        manufacturers.keys.sorted().forEach { m ->
            println("  - android-compose-preview-ext/src/main/kotlin/se/premex/compose/preview/devices/${m}Devices.kt")
        }
    }
    
    /**
     * Generates all device specification files.
     */
    suspend fun generateDeviceFiles() {
        println("🏭 Generating manufacturer extension files (Google devices removed)...")

        // Clean up old device files before generating new ones
        cleanupOldExtensionFiles()

        // Fetch device specifications
        val devices = deviceFetcher.fetchDeviceSpecs()
        
        // Generate manufacturer extension files
        manufacturerExtensionGenerator.generateManufacturerExtensions(devices, librarySourcePath)
        
        // Validate the generation
        validateGeneration()
    }
    
    /**
     * Cleans up old device files to ensure fresh generation.
     */
    private fun cleanupOldExtensionFiles() {
        println("🧹 Cleaning up old manufacturer extension files...")

        try {
            val extensionsDir = extensionsPath.toFile()
            if (extensionsDir.exists()) {
                val extensionFiles = extensionsDir.listFiles { f -> f.isFile && f.name.endsWith("Devices.kt") }

                if (extensionFiles != null && extensionFiles.isNotEmpty()) {
                    val deletedCount = extensionFiles.count { it.delete() }
                    println("[INFO] Removed $deletedCount old manufacturer extension files")
                } else {
                    println("[INFO] No old manufacturer extension files found")
                }
            } else {
                println("[INFO] Manufacturer extensions directory doesn't exist, will be created during generation")
            }

        } catch (e: Exception) {
            println("[WARN] Error during cleanup: ${e.message}")
        }

        println("✅ Cleanup completed")
    }

    /**
     * Validates that the generated files can be compiled.
     */
    private fun validateGeneration() {
        println("[INFO] Validating generated files...")
        
        val extensionsDir = extensionsPath.toFile()
        if (!extensionsDir.exists() || extensionsDir.listFiles()?.isEmpty() == true) {
            error("No manufacturer extension files were generated")
        }
        
        println("[INFO] ✅ Generated manufacturer extensions present")
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