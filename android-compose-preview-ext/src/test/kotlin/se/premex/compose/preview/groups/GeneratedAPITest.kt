package se.premex.compose.preview.groups

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Simple test to verify the API works after generation.
 */
class GeneratedAPITest {

    @Test
    fun `basic API test`() {
        // Test that we can get Zebra devices
        val zebraDevices = PreviewGroups.getZebraDevices()
        assertTrue(zebraDevices.isNotEmpty(), "Should have Zebra devices")
        
        // Test brand lookup
        val brandZebra = PreviewGroups.getDevicesForBrand("zebra") 
        assertEquals(zebraDevices, brandZebra, "Brand lookup should match direct method")
        
        // Test supported brands
        val brands = PreviewGroups.getSupportedBrands()
        assertTrue(brands.contains("zebra"), "Should support zebra")
        assertTrue(brands.size > 1000, "Should have many brands")
        
        println("✅ API tests passed:")
        println("   Zebra devices: ${zebraDevices.size}")
        println("   Total brands: ${brands.size}")
        println("   First Zebra device: ${zebraDevices.firstOrNull()}")
        println("   First few brands: ${brands.take(5)}")
    }
    
    @Test
    fun `zebra categories test`() {
        val handhelds = ZebraPreviewGroup.Categories.handhelds
        val touchComputers = ZebraPreviewGroup.Categories.touchComputers
        val tablets = ZebraPreviewGroup.Categories.tablets
        
        assertTrue(handhelds.isNotEmpty(), "Should have handhelds")
        assertTrue(touchComputers.isNotEmpty(), "Should have touch computers") 
        assertTrue(tablets.isNotEmpty(), "Should have tablets")
        
        println("✅ Zebra categories test passed:")
        println("   Handhelds: ${handhelds.size}")
        println("   Touch computers: ${touchComputers.size}")
        println("   Tablets: ${tablets.size}")
        println("   First handheld: ${handhelds.firstOrNull()}")
    }
}