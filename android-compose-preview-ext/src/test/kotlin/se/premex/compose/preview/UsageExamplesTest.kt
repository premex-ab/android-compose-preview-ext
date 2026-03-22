package se.premex.compose.preview

import org.junit.jupiter.api.Test
import se.premex.compose.preview.device.catalog.android.Zebra
import se.premex.compose.preview.device.catalog.android.groups.ZebraDevices
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
    fun `ZebraDevices ALL contains TC27`() {
        assertTrue(ZebraDevices.ALL.contains(Zebra.TC27))
    }

    @Test
    fun `ZebraDevices ALL contains TC26`() {
        assertTrue(ZebraDevices.ALL.contains(Zebra.TC26))
    }

    @Test
    fun `ZebraDevices ALL is non-empty`() {
        assertTrue(ZebraDevices.ALL.isNotEmpty())
    }

    @Test
    fun `ZebraDevices ALL contains only valid spec strings`() {
        ZebraDevices.ALL.forEach { spec ->
            assertTrue(
                spec.startsWith("spec:") || spec.startsWith("id:"),
                "Invalid device spec: $spec"
            )
        }
    }

}