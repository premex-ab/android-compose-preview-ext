package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ofddisplay device specifications for Android Compose previews.
 *
 * This extension provides Ofddisplay device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ofddisplay.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ofddisplay get() = object {
    /** Ofddisplay D01 */
    val D01 = "spec:width=1080,height=1920,unit=px,dpi=240"

}
