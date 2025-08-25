package se.premex.compose.preview

import org.junit.jupiter.api.Test
import se.premex.compose.preview.device.catalog.android.Zebra
import se.premex.compose.preview.groups.PreviewGroups
import se.premex.compose.preview.groups.ZebraPreviewGroup
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class UsageExamplesTest {

    @Test
    fun `test TC27`() {
        assertEquals("spec:width=1080px,height=2160px,dpi=480", Zebra.TC27)
    }

    @Test
    fun `test TC26`() {
        assertEquals("spec:width=720px,height=1280px,dpi=320", Zebra.TC26)
    }

    @Test
    fun `preview groups example - get all Zebra devices`() {
        val zebraDevices = PreviewGroups.getZebraDevices()
        
        // Should contain all 76 Zebra devices
        assertEquals(76, zebraDevices.size)
        
        // All should be proper device specifications
        zebraDevices.forEach { device ->
            assertTrue(device.startsWith("spec:"), "Device spec should start with 'spec:': $device")
        }
    }

    @Test
    fun `preview groups example - device categories`() {
        val handhelds = ZebraPreviewGroup.Categories.handhelds
        val tablets = ZebraPreviewGroup.Categories.tablets
        val touchComputers = ZebraPreviewGroup.Categories.touchComputers
        val vehicleComputers = ZebraPreviewGroup.Categories.vehicleComputers
        
        // Each category should have some devices
        assertTrue(handhelds.isNotEmpty(), "Handhelds should not be empty")
        assertTrue(tablets.isNotEmpty(), "Tablets should not be empty") 
        assertTrue(touchComputers.isNotEmpty(), "Touch computers should not be empty")
        assertTrue(vehicleComputers.isNotEmpty(), "Vehicle computers should not be empty")
    }

    @Test
    fun `preview groups example - brand selection`() {
        val zebraByName = PreviewGroups.getDevicesForBrand("zebra")
        val zebraByNameCaps = PreviewGroups.getDevicesForBrand("ZEBRA")
        val unknownBrand = PreviewGroups.getDevicesForBrand("unknown")
        
        assertEquals(76, zebraByName.size)
        assertEquals(zebraByName, zebraByNameCaps) // Case insensitive
        assertTrue(unknownBrand.isEmpty()) // Unknown brand returns empty
    }
}