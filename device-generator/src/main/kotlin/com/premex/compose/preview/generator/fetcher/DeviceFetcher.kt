package com.premex.compose.preview.generator.fetcher

import com.opencsv.CSVReader
import com.premex.compose.preview.generator.model.DeviceSpec
import java.io.StringReader
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.time.Duration

/**
 * Fetches device specifications from external sources.
 */
class DeviceFetcher {
    private val httpClient = HttpClient.newBuilder()
        .connectTimeout(Duration.ofSeconds(30))
        .build()
        
    private val catalogUrl = "https://raw.githubusercontent.com/hossain-khan/android-device-catalog-parser/refs/heads/main/lib/src/test/resources/android-devices-catalog.csv"
    
    /**
     * Fetches device specifications from the Android Device Catalog CSV.
     */
    suspend fun fetchDeviceSpecs(): List<DeviceSpec> {
        println("[INFO] Fetching Android Device Catalog CSV from Play Store...")
        
        val request = HttpRequest.newBuilder()
            .uri(URI.create(catalogUrl))
            .timeout(Duration.ofSeconds(30))
            .GET()
            .build()
            
        val response = httpClient.send(request, HttpResponse.BodyHandlers.ofString())
        
        if (response.statusCode() != 200) {
            error("Failed to fetch Android Device Catalog from $catalogUrl (HTTP ${response.statusCode()})")
        }
        
        val csvData = response.body()
        val csvLines = csvData.lines().size
        println("[INFO] Downloaded CSV with $csvLines lines")
        
        return parseDevicesFromCsv(csvData)
    }
    
    /**
     * Parses device specifications from CSV data.
     */
    private fun parseDevicesFromCsv(csvData: String): List<DeviceSpec> {
        println("[INFO] Processing Android Device Catalog CSV...")
        
        val devices = mutableListOf<DeviceSpec>()
        var processed = 0
        
        CSVReader(StringReader(csvData)).use { reader ->
            val headers = reader.readNext() ?: return emptyList()
            
            println("[DEBUG] CSV Headers: ${headers.joinToString(", ")}")
            
            // Find column indices - this CSV has different column names
            val brandIndex = headers.indexOfFirst { it.equals("Brand", ignoreCase = true) }
            val modelIndex = headers.indexOfFirst { it.equals("Model Name", ignoreCase = true) || it.equals("Device", ignoreCase = true) }
            val screenSizesIndex = headers.indexOfFirst { it.equals("Screen Sizes", ignoreCase = true) }
            val screenDensitiesIndex = headers.indexOfFirst { it.equals("Screen Densities", ignoreCase = true) }
            
            if (brandIndex == -1 || modelIndex == -1 || screenSizesIndex == -1 || screenDensitiesIndex == -1) {
                println("[WARN] Could not find all required columns in CSV. Found: Brand=$brandIndex, Model=$modelIndex, Sizes=$screenSizesIndex, Densities=$screenDensitiesIndex")
                return getBuiltInGoogleDevices() // Return built-in devices only
            }
            
            var line: Array<String>?
            while (reader.readNext().also { line = it } != null) {
                line?.let { row ->
                    try {
                        if (row.size <= maxOf(brandIndex, modelIndex, screenSizesIndex, screenDensitiesIndex)) {
                            return@let // Skip incomplete rows
                        }
                        
                        val manufacturer = row[brandIndex].trim()
                        val model = row[modelIndex].trim()
                        val screenSizes = row[screenSizesIndex].trim()
                        val screenDensities = row[screenDensitiesIndex].trim()
                        
                        // Skip rows with empty required fields
                        if (manufacturer.isEmpty() || model.isEmpty()) {
                            return@let
                        }
                        
                        // Parse screen dimensions and densities from CSV format
                        val deviceSpecs = parseScreenSpecifications(manufacturer, model, screenSizes, screenDensities)
                        devices.addAll(deviceSpecs)
                        processed += deviceSpecs.size
                        
                    } catch (e: Exception) {
                        // Skip problematic rows
                        println("[WARN] Skipping row due to parsing error: ${e.message}")
                    }
                }
            }
        }
        
        // Add Google Pixel devices that might not be in the CSV
        devices.addAll(getBuiltInGoogleDevices())
        
        println("[INFO] Processed $processed device specifications from CSV")
        return devices.distinctBy { "${it.manufacturer}|${it.code}" }
    }
    
    /**
     * Parses screen specifications from CSV format strings.
     * Screen Sizes format: "1080x1920,1440x2560"
     * Screen Densities format: "320,420,480"
     */
    private fun parseScreenSpecifications(manufacturer: String, model: String, screenSizes: String, screenDensities: String): List<DeviceSpec> {
        val specs = mutableListOf<DeviceSpec>()
        
        if (screenSizes.isEmpty() || screenDensities.isEmpty()) {
            return specs
        }
        
        val sizes = screenSizes.split(",").map { it.trim() }
        val densities = screenDensities.split(",").mapNotNull { it.trim().toIntOrNull() }
        
        // Use the first (most common) size and density
        val primarySize = sizes.firstOrNull() ?: return specs
        val primaryDensity = densities.firstOrNull() ?: return specs
        
        // Parse width x height
        val dimensionParts = primarySize.split("x")
        if (dimensionParts.size != 2) return specs
        
        val width = dimensionParts[0].toIntOrNull() ?: return specs
        val height = dimensionParts[1].toIntOrNull() ?: return specs
        
        if (width <= 0 || height <= 0 || primaryDensity <= 0) return specs
        
        val isGoogle = manufacturer.equals("Google", ignoreCase = true)
        
        specs.add(DeviceSpec(
            manufacturer = manufacturer,
            code = model,
            width = width,
            height = height,
            dpi = primaryDensity,
            isGoogleDevice = isGoogle
        ))
        
        return specs
    }
    
    /**
     * Returns built-in Google device specifications to ensure they're always available.
     */
    private fun getBuiltInGoogleDevices(): List<DeviceSpec> {
        return listOf(
            // Google Nexus Devices
            DeviceSpec("Google", "Nexus 7", 800, 1280, 213, true),
            DeviceSpec("Google", "Nexus 7 2013", 1200, 1920, 323, true),
            DeviceSpec("Google", "Nexus 5", 1080, 1920, 445, true),
            DeviceSpec("Google", "Nexus 6", 1440, 2560, 493, true),
            DeviceSpec("Google", "Nexus 9", 1536, 2048, 288, true),
            DeviceSpec("Google", "Nexus 10", 1600, 2560, 300, true),
            DeviceSpec("Google", "Nexus 5X", 1080, 1920, 424, true),
            DeviceSpec("Google", "Nexus 6P", 1440, 2560, 515, true),
            
            // Google Pixel Devices
            DeviceSpec("Google", "pixel_c", 1800, 2560, 308, true),
            DeviceSpec("Google", "pixel", 1080, 1920, 441, true),
            DeviceSpec("Google", "pixel_xl", 1440, 2560, 534, true),
            DeviceSpec("Google", "pixel_2", 1080, 1920, 441, true),
            DeviceSpec("Google", "pixel_2_xl", 1440, 2880, 538, true),
            DeviceSpec("Google", "pixel_3", 1080, 2160, 443, true),
            DeviceSpec("Google", "pixel_3_xl", 1440, 2960, 523, true),
            DeviceSpec("Google", "pixel_3a", 1080, 2220, 441, true),
            DeviceSpec("Google", "pixel_3a_xl", 1080, 2160, 402, true),
            DeviceSpec("Google", "pixel_4", 1080, 2280, 444, true),
            DeviceSpec("Google", "pixel_4_xl", 1440, 3040, 537, true),
            DeviceSpec("Google", "pixel_4a", 1080, 2340, 443, true),
            DeviceSpec("Google", "pixel_5", 1080, 2340, 432, true),
            DeviceSpec("Google", "pixel_6", 1080, 2400, 411, true),
            DeviceSpec("Google", "pixel_6_pro", 1440, 3120, 512, true),
            DeviceSpec("Google", "pixel_6a", 1080, 2400, 429, true),
            DeviceSpec("Google", "pixel_7", 1080, 2400, 416, true),
            DeviceSpec("Google", "pixel_7_pro", 1440, 3120, 512, true),
            DeviceSpec("Google", "pixel_7a", 1080, 2400, 429, true),
            DeviceSpec("Google", "pixel_8", 1080, 2400, 428, true),
            DeviceSpec("Google", "pixel_8_pro", 1344, 2992, 489, true),
            DeviceSpec("Google", "pixel_8a", 1080, 2400, 429, true),
            DeviceSpec("Google", "pixel_9", 1080, 2424, 422, true),
            DeviceSpec("Google", "pixel_9_pro", 1280, 2856, 495, true),
            DeviceSpec("Google", "pixel_9_pro_fold", 2152, 2076, 373, true),
            DeviceSpec("Google", "pixel_9_pro_xl", 1344, 2992, 486, true),
            DeviceSpec("Google", "pixel_fold", 1840, 2208, 378, true),
            DeviceSpec("Google", "pixel_tablet", 1600, 2560, 276, true),
            
            // Automotive
            DeviceSpec("Google", "automotive_1024p_landscape", 1024, 768, 160, true)
        )
    }
}