package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Besttab device specifications for Android Compose previews.
 *
 * This extension provides Besttab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Besttab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Besttab get() = object {
    /** Besttab A10_NEU */
    val A10_NEU = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Besttab A20_NEU */
    val A20_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

}
