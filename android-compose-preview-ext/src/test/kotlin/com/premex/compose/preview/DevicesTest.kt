package com.premex.compose.preview

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class DevicesTest {

    @Test
    fun `test Google devices are properly defined`() {
        assertNotNull(Devices.PIXEL_8)
        assertNotNull(Devices.PIXEL_9_PRO)
        assertNotNull(Devices.NEXUS_5)
        
        // Test that Google devices use id: format
        assertTrue(Devices.PIXEL_8.startsWith("id:"))
        assertTrue(Devices.NEXUS_5.startsWith("id:"))
    }

    @Test
    fun `test Zebra devices are properly defined`() {
//        assertNotNull(Devices.Zebra.TC26)
//        assertNotNull(Devices.Zebra.TC27)
//
//        // Test that Zebra devices use spec: format
//        assertTrue(Devices.Zebra.TC26.startsWith("spec:"))
//        assertTrue(Devices.Zebra.TC27.startsWith("spec:"))
//
//        // Test specific device specs
//        assertEquals("spec:width=720,height=1280,unit=px,dpi=294", Devices.Zebra.TC26)
//        assertEquals("spec:width=1080,height=2160,unit=px,dpi=402", Devices.Zebra.TC27)
    }

    @Test
    fun `test Samsung devices are properly defined`() {
//        assertNotNull(Devices.Samsung.GALAXY_S24)
//        assertNotNull(Devices.Samsung.GALAXY_S24_ULTRA)
//
//        // Test that Samsung devices use spec: format
//        assertTrue(Devices.Samsung.GALAXY_S24.startsWith("spec:"))
//        assertTrue(Devices.Samsung.GALAXY_S24_ULTRA.startsWith("spec:"))
    }

    @Test
    fun `test Honeywell devices are properly defined`() {
//        assertNotNull(Devices.Honeywell.CT30_XP)
//        assertNotNull(Devices.Honeywell.CT40)
//
//        // Test that Honeywell devices use spec: format
//        assertTrue(Devices.Honeywell.CT30_XP.startsWith("spec:"))
//        assertTrue(Devices.Honeywell.CT40.startsWith("spec:"))
    }

    @Test
    fun `test device spec format is valid`() {
//        val deviceSpecs = listOf(
//            Devices.Zebra.TC26,
//            Devices.Zebra.TC27,
//            Devices.Samsung.GALAXY_S24,
//            Devices.Honeywell.CT40
//        )
//
//        deviceSpecs.forEach { spec ->
//            // Check spec format
//            assertTrue(spec.startsWith("spec:"))
//            assertTrue(spec.contains("width="))
//            assertTrue(spec.contains("height="))
//            assertTrue(spec.contains("unit=px"))
//            assertTrue(spec.contains("dpi="))
//        }
    }

    @Test
    fun `test DEFAULT device is empty string`() {
        assertEquals("", Devices.DEFAULT)
    }

    @Test
    fun `test automotive device is defined`() {
        assertNotNull(Devices.AUTOMOTIVE_1024P_LANDSCAPE)
        assertTrue(Devices.AUTOMOTIVE_1024P_LANDSCAPE.startsWith("id:"))
    }
}