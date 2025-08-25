package se.premex.compose.preview.groups

import se.premex.compose.preview.device.catalog.android.*

/**
 * Preview Groups utility providing collections of device specifications grouped by brand.
 * 
 * This enables developers to easily access all devices from a specific manufacturer
 * for comprehensive UI testing and preview generation.
 */
object PreviewGroups {
    
    /**
     * Get all device specifications for Zebra devices.
     * Useful for enterprise and rugged device testing.
     */
    fun getZebraDevices(): List<String> {
        return listOf(
            Zebra.CC605LN,
            Zebra.CC610LC,
            Zebra.CC610PC,
            Zebra.EC30RT,
            Zebra.EC50,
            Zebra.EC55,
            Zebra.EM45,
            Zebra.ET40L,
            Zebra.ET40S,
            Zebra.ET45L,
            Zebra.ET45S,
            Zebra.ET50E,
            Zebra.ET50T,
            Zebra.ET51L,
            Zebra.ET51S,
            Zebra.ET55E,
            Zebra.ET55T,
            Zebra.ET56L,
            Zebra.ET56S,
            Zebra.ET60,
            Zebra.ET65,
            Zebra.KC50L,
            Zebra.KC50S,
            Zebra.L10AW,
            Zebra.MC2200,
            Zebra.MC2700,
            Zebra.MC33,
            Zebra.MC3300X,
            Zebra.MC3300XC,
            Zebra.MC33C,
            Zebra.MC3400,
            Zebra.MC93,
            Zebra.MC93C,
            Zebra.MC9400,
            Zebra.MC9450,
            Zebra.PS20JP,
            Zebra.TC15,
            Zebra.TC20KB,
            Zebra.TC20RD,
            Zebra.TC20RT,
            Zebra.TC21,
            Zebra.TC22,
            Zebra.TC25FM,
            Zebra.TC26,
            Zebra.TC27,
            Zebra.TC51,
            Zebra.TC51HC,
            Zebra.TC52,
            Zebra.TC52X,
            Zebra.TC53,
            Zebra.TC53E,
            Zebra.TC55,
            Zebra.TC56,
            Zebra.TC57,
            Zebra.TC57X,
            Zebra.TC58,
            Zebra.TC58E,
            Zebra.TC70,
            Zebra.TC70X,
            Zebra.TC72,
            Zebra.TC73,
            Zebra.TC73T,
            Zebra.TC75,
            Zebra.TC75X,
            Zebra.TC75XDF,
            Zebra.TC77,
            Zebra.TC78,
            Zebra.TC78T,
            Zebra.TC8000,
            Zebra.TC83B0,
            Zebra.TC83BH,
            Zebra.VC80X,
            Zebra.VC8308,
            Zebra.VC8310,
            Zebra.WT63B0,
            Zebra.WT6400
        )
    }
    
    /**
     * Get device specifications for a specific brand.
     * 
     * @param brandName The name of the brand (case-insensitive)
     * @return List of device specification strings for the brand, or empty list if brand not found
     */
    fun getDevicesForBrand(brandName: String): List<String> {
        return when (brandName.lowercase()) {
            "zebra" -> getZebraDevices()
            else -> emptyList()
        }
    }
    
    /**
     * Get names of all supported brands with preview groups.
     */
    fun getSupportedBrands(): List<String> {
        return listOf("Zebra")
    }
}