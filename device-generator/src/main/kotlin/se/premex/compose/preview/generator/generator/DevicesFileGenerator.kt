package se.premex.compose.preview.generator.generator

import se.premex.compose.preview.generator.model.DeviceSpec
import com.squareup.kotlinpoet.*
import java.io.File
import java.nio.file.Path

/**
 * Generates the main Devices.kt file using KotlinPoet.
 */
class DevicesFileGenerator {
    
    fun generateDevicesFile(devices: List<DeviceSpec>, outputPath: Path) {
        val googleDevices = devices.filter { it.isGoogleDevice }
            .distinctBy { it.code }
            .sortedBy { it.code }
        
        val devicesClass = TypeSpec.objectBuilder("Devices")
            .addKdoc("""
                Extended device specifications for Android Compose previews.
                
                This object provides device specifications that can be used with @Preview annotations
                in Android Compose, extending the built-in device list with devices from the Android
                Device Catalog maintained by Google Play Store.

                Usage:
                ```kotlin
                @Preview(device = Devices.PIXEL_8)
                @Preview(device = Devices.Samsung.GALAXY_S24)
                @Composable
                fun MyPreview() {
                    // Your composable content
                }
                ```

                NOTE: Device specifications are automatically generated from the Android Device Catalog:
                https://raw.githubusercontent.com/hossain-khan/android-device-catalog-parser/refs/heads/main/lib/src/test/resources/android-devices-catalog.csv

                Run ./gradlew :device-generator:run to refresh with the latest catalog data.
            """.trimIndent())
            .addProperty(
                PropertySpec.builder("DEFAULT", String::class)
                    .addModifiers(KModifier.CONST)
                    .initializer("\"\"")
                    .build()
            )
        
        // Add Google Nexus devices section
        val nexusDevices = googleDevices.filter { it.code.contains("nexus", ignoreCase = true) }
        if (nexusDevices.isNotEmpty()) {
            devicesClass.addKdoc("\n// Google Nexus Devices\n")
            nexusDevices.forEach { device ->
                devicesClass.addProperty(
                    PropertySpec.builder(device.toConstantName(), String::class)
                        .addModifiers(KModifier.CONST)
                        .initializer("\"${device.toDeviceString()}\"")
                        .build()
                )
            }
        }
        
        // Add Google Pixel devices section
        val pixelDevices = googleDevices.filter { it.code.contains("pixel", ignoreCase = true) }
        if (pixelDevices.isNotEmpty()) {
            devicesClass.addKdoc("\n// Google Pixel Devices\n")
            pixelDevices.forEach { device ->
                devicesClass.addProperty(
                    PropertySpec.builder(device.toConstantName(), String::class)
                        .addModifiers(KModifier.CONST)
                        .initializer("\"${device.toDeviceString()}\"")
                        .build()
                )
            }
        }
        
        // Add Automotive devices section
        val automotiveDevices = googleDevices.filter { it.code.contains("automotive", ignoreCase = true) }
        if (automotiveDevices.isNotEmpty()) {
            devicesClass.addKdoc("\n// Automotive\n")
            automotiveDevices.forEach { device ->
                devicesClass.addProperty(
                    PropertySpec.builder(device.toConstantName(), String::class)
                        .addModifiers(KModifier.CONST)
                        .initializer("\"${device.toDeviceString()}\"")
                        .build()
                )
            }
        }
        
        val fileSpec = FileSpec.builder("se.premex.compose.preview", "Devices")
            .addType(devicesClass.build())
            .build()
        
        fileSpec.writeTo(outputPath.toFile())
        println("[INFO] Generated main Devices.kt file")
    }
}