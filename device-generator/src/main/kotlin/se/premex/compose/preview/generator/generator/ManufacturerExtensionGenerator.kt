package se.premex.compose.preview.generator.generator

import se.premex.compose.preview.generator.model.DeviceSpec
import com.squareup.kotlinpoet.*
import java.nio.file.Path

/**
 * Generates manufacturer-specific device extension files using KotlinPoet.
 */
class ManufacturerExtensionGenerator {
    
    fun generateManufacturerExtensions(devices: List<DeviceSpec>, sourceRootDirectory: Path) {
        val nonGoogleDevices = devices.filterNot { it.isGoogleDevice }
        val devicesByManufacturer = nonGoogleDevices.groupBy { it.manufacturer }
        
        // Ensure the devices directory exists
        val devicesDir = sourceRootDirectory.resolve("se/premex/compose/preview/devices")
        devicesDir.toFile().mkdirs()
        
        // Clean existing extension files
        devicesDir.toFile().listFiles()?.filter { it.name.endsWith("Devices.kt") }?.forEach { it.delete() }
        
        devicesByManufacturer.forEach { (manufacturer, manufacturerDevices) ->
            generateManufacturerExtension(manufacturer, manufacturerDevices, sourceRootDirectory)
        }
        
        println("[INFO] Generated ${devicesByManufacturer.size} manufacturer extension files")
    }
    
    private fun generateManufacturerExtension(
        manufacturer: String, 
        devices: List<DeviceSpec>, 
        sourceRootDirectory: Path
    ) {
        val className = devices.first().toManufacturerClassName()
        val fileName = "${className}Devices"
        
        // Create the extension property that returns an object
        val extensionProperty = PropertySpec.builder(className, ANY)
            .receiver(ClassName("se.premex.compose.preview", "DeviceCatalog"))
            .getter(FunSpec.getterBuilder()
                .addCode("return object {%L}", generateDeviceConstants(devices))
                .build())
            .addKdoc("""
                $manufacturer device specifications for Android Compose previews.

                This extension provides $manufacturer device specifications that can be used with @Preview annotations
                in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.

                Usage:
                ```kotlin
                @Preview(device = DeviceCatalog.$className.DEVICE_NAME)
                @Composable
                fun MyPreview() {
                    // Your composable content
                }
                ```
            """.trimIndent())
            .build()
        
        val fileSpec = FileSpec.builder("se.premex.compose.preview.devices", fileName)
            .addImport("se.premex.compose.preview", "DeviceCatalog")
            .addProperty(extensionProperty)
            .build()
        
        fileSpec.writeTo(sourceRootDirectory.toFile())
        println("[INFO] Generated extension for $manufacturer (${devices.size} devices)")
    }
    
    private fun generateDeviceConstants(devices: List<DeviceSpec>): CodeBlock {
        val codeBlock = CodeBlock.builder()
        
        // Sort devices by constant name and remove duplicates by constant name
        val sortedDevices = devices
            .distinctBy { "${it.toConstantName()}:${it.toDeviceString()}" } // Remove exact duplicates
            .groupBy { it.toConstantName() } // Group by constant name
            .mapValues { (_, deviceList) -> deviceList.first() } // Take first device for each constant name
            .values
            .sortedBy { it.toConstantName() }
        
        sortedDevices.forEach { device ->
            codeBlock.add("\n    /** ${device.manufacturer} ${device.code} */\n")
            codeBlock.add("    val ${device.toConstantName()} = \"${device.toDeviceString()}\"\n")
        }
        
        codeBlock.add("\n")
        return codeBlock.build()
    }
}