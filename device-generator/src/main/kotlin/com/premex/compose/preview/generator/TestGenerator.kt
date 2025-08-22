package com.premex.compose.preview.generator

import com.premex.compose.preview.generator.fetcher.DeviceFetcher
import com.premex.compose.preview.generator.generator.DevicesFileGenerator
import com.premex.compose.preview.generator.generator.ManufacturerExtensionGenerator
import com.premex.compose.preview.generator.model.DeviceSpec
import kotlinx.coroutines.runBlocking
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.system.exitProcess

/**
 * Test generator with limited dataset to verify fixes
 */
fun main(args: Array<String>) {
    try {
        runBlocking {
            val testGenerator = TestDeviceGenerator()
            testGenerator.generateTestFiles()
        }
        
        println("🎉 Test generation completed successfully!")
        
    } catch (e: Exception) {
        println("[ERROR] Test generation failed: ${e.message}")
        e.printStackTrace()
        exitProcess(1)
    }
}

class TestDeviceGenerator {
    private val devicesFileGenerator = DevicesFileGenerator()
    private val manufacturerExtensionGenerator = ManufacturerExtensionGenerator()
    
    private val projectRoot = findProjectRoot()
    private val librarySourcePath = projectRoot.resolve("library/src/main/kotlin")
    private val devicesFilePath = librarySourcePath
    private val extensionsPath = librarySourcePath.resolve("com/premex/compose/preview/devices")
    
    suspend fun generateTestFiles() {
        println("🧪 Generating test files with limited dataset...")
        
        // Create test data set with some duplicates to test deduplication
        val testDevices = listOf(
            DeviceSpec("Google", "pixel_8", 1080, 2400, 428, true),
            DeviceSpec("Google", "pixel_8_pro", 1344, 2992, 489, true),
            DeviceSpec("Samsung", "Galaxy S24", 1080, 2340, 416, false),
            DeviceSpec("Samsung", "Galaxy S24 Ultra", 1440, 3120, 505, false),
            DeviceSpec("Samsung", "Galaxy S24", 1080, 2340, 416, false), // Duplicate
            DeviceSpec("Xiaomi", "Mi 13", 1080, 2400, 414, false),
            DeviceSpec("Xiaomi", "Mi 13 Pro", 1440, 3200, 522, false),
            DeviceSpec("Xiaomi", "Mi_13", 1080, 2400, 414, false), // Should create same constant name as Mi 13
            DeviceSpec("OnePlus", "12", 1440, 3168, 510, false),
            DeviceSpec("OnePlus", "12R", 1240, 2772, 450, false),
        )
        
        // Generate main Devices.kt file
        devicesFileGenerator.generateDevicesFile(testDevices, devicesFilePath)
        
        // Generate manufacturer extension files  
        manufacturerExtensionGenerator.generateManufacturerExtensions(testDevices, librarySourcePath)
        
        println("Generated files:")
        println("  - library/src/main/kotlin/com/premex/compose/preview/Devices.kt")
        
        val nonGoogleDevices = testDevices.filterNot { it.isGoogleDevice }
        val manufacturers = nonGoogleDevices.groupBy { it.toManufacturerClassName() }
        manufacturers.keys.sorted().forEach { manufacturer ->
            println("  - library/src/main/kotlin/com/premex/compose/preview/devices/${manufacturer}Devices.kt")
        }
        
        // Test build
        val process = ProcessBuilder("./gradlew", "build", "--quiet")
            .directory(findProjectRoot().toFile())
            .inheritIO()
            .start()
            
        val exitCode = process.waitFor()
        if (exitCode == 0) {
            println("[INFO] ✅ Build successful - generated files compile correctly")
        } else {
            println("[WARN] ❌ Build failed - there may be compilation issues")
        }
    }
    
    private fun findProjectRoot(): Path {
        var current = Paths.get("").toAbsolutePath()
        
        while (current != null) {
            if (current.resolve("settings.gradle.kts").toFile().exists() ||
                current.resolve("settings.gradle").toFile().exists()) {
                return current
            }
            current = current.parent
        }
        
        return Paths.get("").toAbsolutePath()
    }
}