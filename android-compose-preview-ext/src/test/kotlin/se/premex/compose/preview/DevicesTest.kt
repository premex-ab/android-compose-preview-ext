package se.premex.compose.preview

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DeviceCatalogTest {

    @Test
    fun `test default device exists`() {
        assertEquals("", DeviceCatalog.DEFAULT)
    }

    @Test
    fun `manufacturer extensions can be referenced without Google constants`() {
        // This test just ensures that the DeviceCatalog root remains minimal and no Google constants leak back.
        val hasOnlyDefault = DeviceCatalog::class.members.none { it.name.startsWith("PIXEL") || it.name.startsWith("NEXUS") }
        assertTrue(hasOnlyDefault, "DeviceCatalog should not contain Google device constants")
    }
}