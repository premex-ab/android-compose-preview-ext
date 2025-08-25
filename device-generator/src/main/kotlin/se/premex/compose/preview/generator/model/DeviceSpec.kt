package se.premex.compose.preview.generator.model

/**
 * Represents a device specification with all necessary information for generating Compose preview device constants.
 */
data class DeviceSpec(
    val manufacturer: String,
    val code: String,
    val width: Int,
    val height: Int,
    val dpi: Int,
    val isGoogleDevice: Boolean = false
) {
    /**
     * Generates the device specification string for Compose previews.
     * Google devices use "id:" format, others use "spec:" format.
     */
    fun toDeviceString(): String {
        return if (isGoogleDevice) {
            "id:$code"
        } else {
            "spec:width=${width}px,height=${height}px,dpi=$dpi"
        }
    }
    
    /**
     * Generates a sanitized constant name for Kotlin code.
     */
    fun toConstantName(): String {
        return sanitizeDeviceName(code)
    }
    
    /**
     * Generates a sanitized class name for the manufacturer.
     */
    fun toManufacturerClassName(): String {
        return sanitizeClassName(manufacturer)
    }
    
    private fun sanitizeDeviceName(device: String): String {
        // Convert to uppercase constant format
        var clean = device.replace(Regex("[^A-Za-z0-9]+"), "_")
        clean = clean.replace(Regex("_+"), "_")
        clean = clean.trim('_').uppercase()
        
        // If starts with number, prefix with underscore
        if (clean.isNotEmpty() && clean[0].isDigit()) {
            clean = "_$clean"
        }
        
        return clean
    }
    
    private fun sanitizeClassName(manufacturer: String): String {
        // Convert manufacturer name to valid Kotlin class name in PascalCase
        var clean = manufacturer.replace(Regex("[^A-Za-z0-9]+"), " ").trim()

        // Handle special cases and convert to PascalCase
        clean = when (clean.lowercase()) {
            "google" -> "Google"
            "samsung" -> "Samsung"
            "xiaomi" -> "Xiaomi"
            "huawei" -> "Huawei"
            "oppo" -> "Oppo"
            "vivo" -> "Vivo"
            "motorola" -> "Motorola"
            "lg" -> "Lg"
            "sony" -> "Sony"
            "htc" -> "Htc"
            "nokia" -> "Nokia"
            "honor" -> "Honor"
            "realme" -> "Realme"
            "zebra" -> "Zebra"
            "honeywell" -> "Honeywell"
            "datalogic" -> "Datalogic"
            else -> {
                // Convert to PascalCase: split by spaces, capitalize each word, then join
                clean.split(Regex("\\s+"))
                    .filter { it.isNotEmpty() }
                    .joinToString("") { word ->
                        word.lowercase().replaceFirstChar { char ->
                            if (char.isLowerCase()) char.titlecase() else char.toString()
                        }
                    }
            }
        }
        
        // Ensure it starts with a letter (if starts with number, prefix with underscore)
        if (clean.isNotEmpty() && clean[0].isDigit()) {
            clean = "_$clean"
        }
        
        return clean
    }
}