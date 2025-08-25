package se.premex.compose.preview.groups

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ZebraPreviewGroupTest {

    @Test
    fun `deviceNames contains expected count`() {
        assertEquals(76, ZebraPreviewGroup.deviceNames.size)
    }

    @Test
    fun `deviceNames contains known Zebra models`() {
        assertTrue(ZebraPreviewGroup.deviceNames.contains("MC33"))
        assertTrue(ZebraPreviewGroup.deviceNames.contains("TC26"))
        assertTrue(ZebraPreviewGroup.deviceNames.contains("TC27"))
        assertTrue(ZebraPreviewGroup.deviceNames.contains("ET50T"))
        assertTrue(ZebraPreviewGroup.deviceNames.contains("VC80X"))
    }

    @Test
    fun `getAllDevices returns same as PreviewGroups getZebraDevices`() {
        val directDevices = PreviewGroups.getZebraDevices()
        val groupDevices = ZebraPreviewGroup.getAllDevices()
        
        assertEquals(directDevices.size, groupDevices.size)
        assertEquals(directDevices, groupDevices)
    }

    @Test
    fun `Categories handhelds contain MC series devices`() {
        val handhelds = ZebraPreviewGroup.Categories.handhelds
        
        assertFalse(handhelds.isEmpty())
        // Should contain some MC series devices
        assertTrue(handhelds.size > 0)
    }

    @Test
    fun `Categories touchComputers contain TC series devices`() {
        val touchComputers = ZebraPreviewGroup.Categories.touchComputers
        
        assertFalse(touchComputers.isEmpty())
        // Should contain some TC series devices  
        assertTrue(touchComputers.size > 0)
    }

    @Test
    fun `Categories tablets contain ET series devices`() {
        val tablets = ZebraPreviewGroup.Categories.tablets
        
        assertFalse(tablets.isEmpty())
        // Should contain some ET series devices
        assertTrue(tablets.size > 0)
    }

    @Test
    fun `Categories vehicleComputers contain VC series devices`() {
        val vehicleComputers = ZebraPreviewGroup.Categories.vehicleComputers
        
        assertFalse(vehicleComputers.isEmpty())
        // Should contain some VC series devices
        assertTrue(vehicleComputers.size > 0)
    }
}