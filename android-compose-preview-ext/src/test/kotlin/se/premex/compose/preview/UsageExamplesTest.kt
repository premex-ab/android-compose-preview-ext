package se.premex.compose.preview

import org.junit.jupiter.api.Test
import se.premex.compose.preview.device.catalog.android.Zebra
import kotlin.test.assertEquals

class UsageExamplesTest {

    @Test
    fun `test TC27`() {
        assertEquals("spec:width=1080px,height=2160px,dpi=480", Zebra.TC27)
    }

    @Test
    fun `test TC26`() {
        assertEquals("spec:width=720px,height=1280px,dpi=320", Zebra.TC26)
    }

}