package se.premex.compose.preview.generator.readme

import se.premex.compose.preview.generator.model.DeviceSpec
import java.nio.file.Path
import java.nio.file.Paths
import java.text.NumberFormat
import java.util.*

/**
 * Generates README documentation files for device specifications.
 */
class ReadmeGenerator {
    
    /**
     * Generates README files for all manufacturers and updates the main README.
     */
    fun generateReadmeFiles(devices: List<DeviceSpec>, projectRoot: Path) {
        println("📚 Starting README generation...")
        
        // Group devices by manufacturer (excluding Google devices which are handled separately)
        val nonGoogleDevices = devices.filterNot { it.isGoogleDevice }
        val devicesByManufacturer = nonGoogleDevices.groupBy { it.manufacturer }
        val googleDevices = devices.filter { it.isGoogleDevice }
        
        // Create README directory structure
        val readmeDir = projectRoot.resolve("docs/devices")
        readmeDir.toFile().mkdirs()
        
        // Clean existing README files
        readmeDir.toFile().listFiles()?.forEach { if (it.name.endsWith(".md")) it.delete() }
        
        // Generate manufacturer-specific README files
        devicesByManufacturer.forEach { (manufacturer, manufacturerDevices) ->
            generateManufacturerReadme(manufacturer, manufacturerDevices, readmeDir)
        }
        
        // Generate Google devices README
        if (googleDevices.isNotEmpty()) {
            generateGoogleDevicesReadme(googleDevices, readmeDir)
        }
        
        // Update main README with navigation
        updateMainReadme(devicesByManufacturer, googleDevices, projectRoot)
        
        println("✅ Generated README files for ${devicesByManufacturer.size} manufacturers")
    }
    
    private fun generateManufacturerReadme(manufacturer: String, devices: List<DeviceSpec>, readmeDir: Path) {
        val className = devices.first().toManufacturerClassName()
        val fileName = "${className.lowercase()}-devices.md"
        val readmeFile = readmeDir.resolve(fileName)
        
        val content = buildString {
            appendLine("# ${manufacturer.uppercase()} Devices")
            appendLine()
            appendLine("This document lists all ${manufacturer} device specifications available for Android Compose previews.")
            appendLine()
            appendLine("## Overview")
            appendLine()
            appendLine("- **Total devices**: ${NumberFormat.getNumberInstance(Locale.US).format(devices.size)}")
            appendLine("- **Manufacturer**: $manufacturer")
            appendLine("- **Usage**: `Devices.${className}.DEVICE_NAME`")
            appendLine()
            appendLine("## Usage Example")
            appendLine()
            appendLine("```kotlin")
            appendLine("import se.premex.compose.preview.devices.*")
            appendLine()
            appendLine("@Preview(device = Devices.${className}.${devices.firstOrNull()?.toConstantName() ?: "DEVICE_NAME"})")
            appendLine("@Composable")
            appendLine("fun MyPreview() {")
            appendLine("    // Your composable content")
            appendLine("}")
            appendLine("```")
            appendLine()
            appendLine("## Device Specifications")
            appendLine()
            
            // Group devices by screen resolution for better organization
            val devicesByResolution = devices.groupBy { "${it.width}x${it.height}" }
            
            devicesByResolution.entries.sortedBy { it.key }.forEach { (resolution, resolutionDevices) ->
                val (width, height) = resolution.split("x").map { it.toInt() }
                val aspectRatio = calculateAspectRatio(width, height)
                val category = categorizeScreen(width, height)
                
                appendLine("### $resolution ($category)")
                appendLine()
                appendLine("**Screen specs**: ${width}x${height}px | **Aspect ratio**: $aspectRatio")
                appendLine()
                
                // Sort devices alphabetically within each resolution group
                resolutionDevices.sortedBy { it.toConstantName() }.forEach { device ->
                    val dpiText = if (device.dpi > 0) " | **DPI**: ${device.dpi}" else ""
                    appendLine("- **`${device.toConstantName()}`** - ${device.code}$dpiText")
                    appendLine("  ```kotlin")
                    appendLine("  ${device.toDeviceString()}")
                    appendLine("  ```")
                    appendLine()
                }
            }
            
            appendLine("## Navigation")
            appendLine()
            appendLine("- [← Back to Main README](../../README.md)")
            appendLine("- [📱 All Device Categories](../README.md)")
            appendLine()
            appendLine("---")
            appendLine("*Generated automatically from Android Device Catalog*")
        }
        
        readmeFile.toFile().writeText(content)
        println("[INFO] Generated README for $manufacturer (${devices.size} devices)")
    }
    
    private fun generateGoogleDevicesReadme(googleDevices: List<DeviceSpec>, readmeDir: Path) {
        val readmeFile = readmeDir.resolve("google-devices.md")
        
        val content = buildString {
            appendLine("# Google Devices")
            appendLine()
            appendLine("This document lists all Google device specifications available for Android Compose previews.")
            appendLine()
            appendLine("## Overview")
            appendLine()
            appendLine("- **Total devices**: ${NumberFormat.getNumberInstance(Locale.US).format(googleDevices.size)}")
            appendLine("- **Manufacturer**: Google")
            appendLine("- **Usage**: `Devices.DEVICE_NAME` (direct access)")
            appendLine()
            appendLine("## Usage Example")
            appendLine()
            appendLine("```kotlin")
            appendLine("@Preview(device = Devices.PIXEL_8)")
            appendLine("@Composable")
            appendLine("fun MyPreview() {")
            appendLine("    // Your composable content")
            appendLine("}")
            appendLine("```")
            appendLine()
            appendLine("## Device Specifications")
            appendLine()
            
            // Group Google devices by product line (Pixel, Nexus, etc.)
            val devicesByLine = googleDevices.groupBy { device ->
                when {
                    device.code.contains("pixel", true) -> "Pixel"
                    device.code.contains("nexus", true) -> "Nexus"
                    device.code.contains("android", true) -> "Android Generic"
                    else -> "Other"
                }
            }
            
            devicesByLine.entries.sortedBy { it.key }.forEach { (productLine, lineDevices) ->
                appendLine("### $productLine Devices")
                appendLine()
                
                lineDevices.sortedBy { it.code }.forEach { device ->
                    val specs = if (device.width > 0 && device.height > 0) {
                        " | **Screen**: ${device.width}x${device.height}px"
                    } else {
                        ""
                    }
                    val dpiText = if (device.dpi > 0) " | **DPI**: ${device.dpi}" else ""
                    
                    appendLine("- **`${device.toConstantName()}`** - ${device.code}$specs$dpiText")
                    appendLine("  ```kotlin")
                    appendLine("  ${device.toDeviceString()}")
                    appendLine("  ```")
                    appendLine()
                }
            }
            
            appendLine("## Navigation")
            appendLine()
            appendLine("- [← Back to Main README](../../README.md)")
            appendLine("- [📱 All Device Categories](../README.md)")
            appendLine()
            appendLine("---")
            appendLine("*Generated automatically from Android Device Catalog*")
        }
        
        readmeFile.toFile().writeText(content)
        println("[INFO] Generated README for Google devices (${googleDevices.size} devices)")
    }
    
    private fun updateMainReadme(devicesByManufacturer: Map<String, List<DeviceSpec>>, googleDevices: List<DeviceSpec>, projectRoot: Path) {
        val mainReadmePath = projectRoot.resolve("README.md")
        if (!mainReadmePath.toFile().exists()) {
            println("[WARN] Main README.md not found, skipping navigation update")
            return
        }
        
        val existingContent = mainReadmePath.toFile().readText()
        
        // Create device navigation section
        val deviceNavigationSection = buildString {
            appendLine("## 📱 Supported Devices")
            appendLine()
            appendLine("This library provides device specifications for **${NumberFormat.getNumberInstance(Locale.US).format(devicesByManufacturer.values.flatten().size + googleDevices.size)}** devices from **${devicesByManufacturer.size + 1}** manufacturers.")
            appendLine()
            appendLine("### Browse by Manufacturer")
            appendLine()
            
            // Google devices first
            if (googleDevices.isNotEmpty()) {
                appendLine("#### [🔍 Google Devices](docs/devices/google-devices.md)")
                appendLine("${googleDevices.size} devices including Pixel, Nexus, and Android generic devices")
                appendLine()
            }
            
            // Manufacturer categories
            val popularManufacturers = setOf("samsung", "xiaomi", "huawei", "oppo", "vivo", "motorola", "lg", "sony", "zebra", "honeywell", "datalogic")
            val sortedManufacturers = devicesByManufacturer.entries.sortedWith(compareBy<Map.Entry<String, List<DeviceSpec>>> { entry ->
                if (entry.key.lowercase() in popularManufacturers) 0 else 1
            }.thenBy { it.key.lowercase() })
            
            appendLine("#### Enterprise & Consumer Devices")
            sortedManufacturers.forEach { (manufacturer, devices) ->
                val className = devices.first().toManufacturerClassName()
                val fileName = "${className.lowercase()}-devices.md"
                val category = when (manufacturer.lowercase()) {
                    "zebra", "honeywell", "datalogic" -> "📊 Enterprise"
                    "samsung", "xiaomi", "huawei", "oppo", "vivo" -> "📱 Consumer"
                    else -> "🔧 Other"
                }
                appendLine("- $category [**$manufacturer**](docs/devices/$fileName) - ${devices.size} devices")
            }
            appendLine()
            appendLine("### Quick Stats")
            appendLine()
            appendLine("| Category | Manufacturers | Total Devices |")
            appendLine("|----------|---------------|---------------|")
            appendLine("| Google | 1 | ${googleDevices.size} |")
            appendLine("| Enterprise | ${devicesByManufacturer.keys.count { it.lowercase() in setOf("zebra", "honeywell", "datalogic") }} | ${devicesByManufacturer.filterKeys { it.lowercase() in setOf("zebra", "honeywell", "datalogic") }.values.flatten().size} |")
            appendLine("| Consumer | ${devicesByManufacturer.keys.count { it.lowercase() in setOf("samsung", "xiaomi", "huawei", "oppo", "vivo", "motorola", "lg", "sony") }} | ${devicesByManufacturer.filterKeys { it.lowercase() in setOf("samsung", "xiaomi", "huawei", "oppo", "vivo", "motorola", "lg", "sony") }.values.flatten().size} |")
            appendLine("| Other | ${devicesByManufacturer.keys.count { it.lowercase() !in popularManufacturers }} | ${devicesByManufacturer.filterKeys { it.lowercase() !in popularManufacturers }.values.flatten().size} |")
            appendLine()
        }
        
        // Replace or insert the device navigation section
        val deviceSectionRegex = Regex("(?s)## 📱 Supported Devices.*?(?=##|$)")
        val updatedContent = if (existingContent.contains("## 📱 Supported Devices")) {
            existingContent.replace(deviceSectionRegex, deviceNavigationSection.trimEnd())
        } else {
            // Find a good place to insert (after the first ## section)
            val sections = existingContent.split(Regex("(?=##)"))
            if (sections.size > 1) {
                sections[0] + sections[1] + "\n" + deviceNavigationSection + sections.drop(2).joinToString("")
            } else {
                existingContent + "\n" + deviceNavigationSection
            }
        }
        
        mainReadmePath.toFile().writeText(updatedContent)
        println("[INFO] Updated main README.md with navigation to ${devicesByManufacturer.size + 1} device categories")
    }
    
    private fun calculateAspectRatio(width: Int, height: Int): String {
        val gcd = gcd(width, height)
        val ratioWidth = width / gcd
        val ratioHeight = height / gcd
        return "$ratioWidth:$ratioHeight"
    }
    
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
    
    private fun categorizeScreen(width: Int, height: Int): String {
        val maxDimension = maxOf(width, height)
        
        return when {
            maxDimension <= 480 -> "Micro"
            maxDimension <= 800 -> "Small"
            maxDimension <= 1080 -> "Medium"
            maxDimension <= 1440 -> "Large" 
            maxDimension <= 2160 -> "XL"
            else -> "XXL"
        }
    }
}