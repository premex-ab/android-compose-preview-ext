package se.premex.compose.preview.groups

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PreviewGroupsTest {

    @Test
    fun `getZebraDevices returns all Zebra device specifications`() {
        val zebraDevices = PreviewGroups.getZebraDevices()
        
        // Check that we have the expected number of devices (76 as per the generated file)
        assertEquals(76, zebraDevices.size)
        
        // Check that all devices have spec format
        zebraDevices.forEach { device ->
            assertTrue(device.startsWith("spec:"), "Device spec should start with 'spec:': $device")
            assertTrue(device.contains("width="), "Device spec should contain width: $device")
            assertTrue(device.contains("height="), "Device spec should contain height: $device")
            assertTrue(device.contains("dpi="), "Device spec should contain dpi: $device")
        }
        
        // Check that some known devices are included
        assertTrue(zebraDevices.any { it.contains("width=480px,height=800px,dpi=240") }, 
                  "Should contain MC33 specification")
        assertTrue(zebraDevices.any { it.contains("width=720px,height=1280px,dpi=320") }, 
                  "Should contain TC26 specification")
    }

    @Test
    fun `getDevicesForBrand returns Zebra devices for zebra brand`() {
        val zebraDevices = PreviewGroups.getDevicesForBrand("zebra")
        val expectedDevices = PreviewGroups.getZebraDevices()
        
        assertEquals(expectedDevices.size, zebraDevices.size)
        assertEquals(expectedDevices, zebraDevices)
    }

    @Test
    fun `getDevicesForBrand is case insensitive`() {
        val zebraLower = PreviewGroups.getDevicesForBrand("zebra")
        val zebraUpper = PreviewGroups.getDevicesForBrand("ZEBRA")
        val zebraMixed = PreviewGroups.getDevicesForBrand("Zebra")
        
        assertEquals(zebraLower, zebraUpper)
        assertEquals(zebraLower, zebraMixed)
        assertFalse(zebraLower.isEmpty())
    }

    @Test
    fun `getDevicesForBrand returns empty list for unknown brand`() {
        val unknownDevices = PreviewGroups.getDevicesForBrand("unknown")
        assertTrue(unknownDevices.isEmpty())
        
        val emptyDevices = PreviewGroups.getDevicesForBrand("")
        assertTrue(emptyDevices.isEmpty())
    }

    @Test
    fun `getSupportedBrands returns expected brands`() {
        val supportedBrands = PreviewGroups.getSupportedBrands()
        
        assertEquals(1, supportedBrands.size)
        assertTrue(supportedBrands.contains("Zebra"))
    }
}