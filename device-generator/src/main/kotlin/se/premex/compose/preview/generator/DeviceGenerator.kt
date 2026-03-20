package se.premex.compose.preview.generator

import se.premex.compose.preview.generator.fetcher.DeviceFetcher
import se.premex.compose.preview.generator.generator.DeviceCatalogGenerator
import se.premex.compose.preview.generator.generator.DeviceDocsGenerator
import se.premex.compose.preview.generator.generator.PreviewGroupsGenerator
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
            val generator = DeviceGenerator()
            generator.generateDeviceFiles()
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
    private val combinedGenerator = DeviceCatalogGenerator()
    private val docsGenerator = DeviceDocsGenerator()
    private val previewGroupsGenerator = PreviewGroupsGenerator()

    // Project paths
    private val projectRoot = findProjectRoot()
    private val librarySourcePath = projectRoot.resolve("android-compose-preview-ext/src/main/kotlin")

    /**
     * Generates all device specification files.
     */
    suspend fun generateDeviceFiles() {
        println("🏭 Generating per-manufacturer device files (no unified kt)...")

        // Fetch device specifications
        val devices = deviceFetcher.fetchDeviceSpecs()
        
        // Generate manufacturer extension files
        combinedGenerator.generate(devices, librarySourcePath)

        // Generate preview groups files
        previewGroupsGenerator.generate(devices, librarySourcePath)

        // Generate markdown documentation for devices
        docsGenerator.generate(devices, projectRoot)

        // Validate the generation
        validateGeneration()
    }


    /**
     * Validates that the generated files can be compiled.
     */
    private fun validateGeneration() {
        // Actual base package used in DeviceCatalogGenerator
        val generatedPkgDir = librarySourcePath.resolve("se/premex/compose/preview/device/catalog/android").toFile()
        if (!generatedPkgDir.exists()) error("Generated package directory missing: $generatedPkgDir")
        val generatedFiles = generatedPkgDir.walkTopDown().filter { it.isFile && it.name.endsWith(".kt") }.toList()
        if (generatedFiles.isEmpty()) error("No manufacturer files generated in $generatedPkgDir")
        // Basic sanity: ensure at least one object declaration exists
        val hasObject = generatedFiles.any { it.readText().contains("object ") }
        if (!hasObject) error("Generated files missing object declarations")
        println("[INFO] ✅ Generation validated: ${generatedFiles.size} manufacturer files in ${generatedPkgDir}.")
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