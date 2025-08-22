package se.premex.compose.preview.generator.readme

import se.premex.compose.preview.generator.model.DeviceSpec
import java.io.File
import java.nio.file.Path

/**
 * Parses existing device specification files to extract device information.
 */
class DeviceFileParser {
    
    /**
     * Parses all device files in the devices directory and extracts device specifications.
     */
    fun parseDeviceFiles(devicesDirectory: Path): List<DeviceSpec> {
        val deviceFiles = devicesDirectory.toFile().listFiles { file ->
            file.isFile && file.name.endsWith("Devices.kt")
        } ?: emptyArray()
        
        println("[INFO] Found ${deviceFiles.size} device files to parse")
        
        val allDevices = mutableListOf<DeviceSpec>()
        
        deviceFiles.forEach { file ->
            try {
                val devices = parseDeviceFile(file)
                allDevices.addAll(devices)
                println("[DEBUG] Parsed ${devices.size} devices from ${file.name}")
            } catch (e: Exception) {
                println("[WARN] Failed to parse ${file.name}: ${e.message}")
            }
        }
        
        println("[INFO] Successfully parsed ${allDevices.size} total devices")
        return allDevices
    }
    
    private fun parseDeviceFile(file: File): List<DeviceSpec> {
        val content = file.readText()
        val devices = mutableListOf<DeviceSpec>()
        
        // Extract manufacturer name from the file name
        val fileName = file.nameWithoutExtension
        val manufacturer = fileName.removeSuffix("Devices")
        
        // Parse device constants from the file content
        val devicePattern = Regex(
            """(?://\*\*\s*(.*?)\s*\*/)?\s*val\s+([A-Z_0-9]+)\s*=\s*"((?:id:|spec:)[^"]+)"""",
            RegexOption.MULTILINE
        )
        
        val matches = devicePattern.findAll(content)
        
        matches.forEach { match ->
            try {
                val description = match.groupValues[1].trim()
                val constantName = match.groupValues[2]
                val deviceString = match.groupValues[3]
                
                val deviceSpec = parseDeviceString(manufacturer, constantName, deviceString, description)
                if (deviceSpec != null) {
                    devices.add(deviceSpec)
                }
            } catch (e: Exception) {
                println("[WARN] Failed to parse device constant in ${file.name}: ${e.message}")
            }
        }
        
        return devices
    }
    
    private fun parseDeviceString(manufacturer: String, constantName: String, deviceString: String, description: String): DeviceSpec? {
        return try {
            if (deviceString.startsWith("id:")) {
                // Google device format
                val deviceId = deviceString.removePrefix("id:")
                DeviceSpec(
                    manufacturer = "Google",
                    code = deviceId,
                    width = 0, // Google devices don't specify dimensions directly
                    height = 0,
                    dpi = 0,
                    isGoogleDevice = true
                )
            } else if (deviceString.startsWith("spec:")) {
                // Third-party device spec format
                val spec = deviceString.removePrefix("spec:")
                val params = spec.split(",").associate { param ->
                    val (key, value) = param.split("=", limit = 2)
                    key.trim() to value.trim()
                }
                
                val width = params["width"]?.toIntOrNull() ?: 0
                val height = params["height"]?.toIntOrNull() ?: 0
                val dpi = params["dpi"]?.toIntOrNull() ?: 0
                
                // Try to extract device code from description or use constant name
                val deviceCode = extractDeviceCode(description, constantName, manufacturer)
                
                DeviceSpec(
                    manufacturer = manufacturer,
                    code = deviceCode,
                    width = width,
                    height = height,
                    dpi = dpi,
                    isGoogleDevice = false
                )
            } else {
                null
            }
        } catch (e: Exception) {
            println("[WARN] Failed to parse device string '$deviceString': ${e.message}")
            null
        }
    }
    
    private fun extractDeviceCode(description: String, constantName: String, manufacturer: String): String {
        // Try to extract device code from the description comment
        if (description.isNotBlank()) {
            // Remove manufacturer prefix from description
            val cleanDescription = description.removePrefix("$manufacturer ").trim()
            if (cleanDescription.isNotBlank()) {
                return cleanDescription
            }
        }
        
        // Fallback to constant name, converting from SCREAMING_SNAKE_CASE to readable format
        return constantName.split("_")
            .joinToString(" ") { part ->
                part.lowercase().replaceFirstChar { 
                    if (it.isLowerCase()) it.titlecase() else it.toString() 
                }
            }
    }
}