package se.premex.compose.preview.groups

/**
 * Preview Group for Zebra devices.
 * 
 * This utility provides easy access to all Zebra device specifications for creating
 * comprehensive preview groups in Compose. Instead of writing multiple @Preview
 * annotations manually, developers can use this to programmatically generate previews
 * or as reference for building their own preview sets.
 * 
 * Usage examples:
 * 
 * 1. Manual Preview Generation:
 * ```kotlin
 * // Generate individual previews
 * @Preview(name = "Zebra MC33", device = Zebra.MC33)
 * @Preview(name = "Zebra TC26", device = Zebra.TC26)
 * @Preview(name = "Zebra TC27", device = Zebra.TC27)
 * // ... continue for all devices as needed
 * @Composable
 * fun MyComposablePreview() {
 *     MyComposable()
 * }
 * ```
 * 
 * 2. Programmatic Access:
 * ```kotlin
 * // Get all Zebra devices programmatically
 * val zebraDevices = PreviewGroups.getZebraDevices()
 * zebraDevices.forEach { device ->
 *     // Use device specifications for testing or validation
 * }
 * ```
 * 
 * Contains all 76 Zebra device specifications from the device catalog.
 */
object ZebraPreviewGroup {
    
    /**
     * List of all Zebra device model names for reference.
     */
    val deviceNames = listOf(
        "CC605LN", "CC610LC", "CC610PC", "EC30RT", "EC50", "EC55", "EM45", 
        "ET40L", "ET40S", "ET45L", "ET45S", "ET50E", "ET50T", "ET51L", "ET51S", 
        "ET55E", "ET55T", "ET56L", "ET56S", "ET60", "ET65", "KC50L", "KC50S", 
        "L10AW", "MC2200", "MC2700", "MC33", "MC3300X", "MC3300XC", "MC33C", 
        "MC3400", "MC93", "MC93C", "MC9400", "MC9450", "PS20JP", "TC15", 
        "TC20KB", "TC20RD", "TC20RT", "TC21", "TC22", "TC25FM", "TC26", "TC27", 
        "TC51", "TC51HC", "TC52", "TC52X", "TC53", "TC53E", "TC55", "TC56", 
        "TC57", "TC57X", "TC58", "TC58E", "TC70", "TC70X", "TC72", "TC73", 
        "TC73T", "TC75", "TC75X", "TC75XDF", "TC77", "TC78", "TC78T", "TC8000", 
        "TC83B0", "TC83BH", "VC80X", "VC8308", "VC8310", "WT63B0", "WT6400"
    )
    
    /**
     * Get all Zebra device specifications.
     * This is a convenience method that calls PreviewGroups.getZebraDevices().
     */
    fun getAllDevices() = PreviewGroups.getZebraDevices()
    
    /**
     * Get device specifications by category.
     */
    object Categories {
        /** Handheld mobile computers (MC series) */
        val handhelds = PreviewGroups.getZebraDevices().filter { device ->
            deviceNames.any { name -> 
                name.startsWith("MC") && PreviewGroups.getZebraDevices().indexOf(device) == deviceNames.indexOf(name)
            }
        }
        
        /** Touch computers (TC series) */
        val touchComputers = PreviewGroups.getZebraDevices().filter { device ->
            deviceNames.any { name -> 
                name.startsWith("TC") && PreviewGroups.getZebraDevices().indexOf(device) == deviceNames.indexOf(name)
            }
        }
        
        /** Enterprise tablets (ET series) */
        val tablets = PreviewGroups.getZebraDevices().filter { device ->
            deviceNames.any { name -> 
                name.startsWith("ET") && PreviewGroups.getZebraDevices().indexOf(device) == deviceNames.indexOf(name)
            }
        }
        
        /** Vehicle computers (VC series) */
        val vehicleComputers = PreviewGroups.getZebraDevices().filter { device ->
            deviceNames.any { name -> 
                name.startsWith("VC") && PreviewGroups.getZebraDevices().indexOf(device) == deviceNames.indexOf(name)
            }
        }
    }
}