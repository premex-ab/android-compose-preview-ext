package com.premex.compose.preview

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class UsageExamplesTest {

    @Test
    fun `test library can be used as documented in README`() {
        // Test Google devices
        val pixelDevice = Devices.PIXEL_8
        assertTrue(pixelDevice.isNotEmpty(), "Pixel 8 device should be defined")
        
        // Test enterprise devices
        val zebraDevice = Devices.Zebra.TC26
        assertTrue(zebraDevice.startsWith("spec:"), "Zebra TC26 should use spec format")
        
        val samsungDevice = Devices.Samsung.GALAXY_S24
        assertTrue(samsungDevice.startsWith("spec:"), "Samsung Galaxy S24 should use spec format")
        
        val honeywellDevice = Devices.Honeywell.CT40
        assertTrue(honeywellDevice.startsWith("spec:"), "Honeywell CT40 should use spec format")
        
        val datalogicDevice = Devices.Datalogic.MEMOR_10
        assertTrue(datalogicDevice.startsWith("spec:"), "Datalogic Memor 10 should use spec format")
    }
    
    @Test
    fun `test all manufacturers have multiple device options`() {
        // This would be how someone would access devices programmatically
        val zebraDevices = listOf(
            Devices.Zebra.TC26,
            Devices.Zebra.TC27,
            Devices.Zebra.TC57,
            Devices.Zebra.TC77,
            Devices.Zebra.ET40
        )
        
        val samsungDevices = listOf(
            Devices.Samsung.GALAXY_S24,
            Devices.Samsung.GALAXY_S24_ULTRA,
            Devices.Samsung.GALAXY_TAB_S9
        )
        
        val honeywellDevices = listOf(
            Devices.Honeywell.CT40,
            Devices.Honeywell.CT45,
            Devices.Honeywell.EDA52
        )
        
        val datalogicDevices = listOf(
            Devices.Datalogic.MEMOR_10,
            Devices.Datalogic.MEMOR_11,
            Devices.Datalogic.SKORPIO_X5
        )
        
        // Verify all devices are defined
        (zebraDevices + samsungDevices + honeywellDevices + datalogicDevices).forEach { device ->
            assertTrue(device.isNotEmpty(), "Device specification should not be empty: $device")
        }
    }
    
    @Test
    fun `test device specifications contain required fields`() {
        val thirdPartyDevices = listOf(
            Devices.Zebra.TC26,
            Devices.Samsung.GALAXY_S24,
            Devices.Honeywell.CT40,
            Devices.Datalogic.MEMOR_10
        )
        
        thirdPartyDevices.forEach { device ->
            assertTrue(device.contains("width="), "Device should specify width: $device")
            assertTrue(device.contains("height="), "Device should specify height: $device")
            assertTrue(device.contains("unit=px"), "Device should specify unit as px: $device")
            assertTrue(device.contains("dpi="), "Device should specify DPI: $device")
        }
    }
}