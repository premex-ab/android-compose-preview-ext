package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ayya device specifications for Android Compose previews.
 *
 * This extension provides Ayya device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ayya.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ayya get() = object {
    /** Ayya Ayat101 */
    val AYAT101 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Ayya T1 */
    val T1 = "spec:width=720,height=1600,unit=px,dpi=320"

}
