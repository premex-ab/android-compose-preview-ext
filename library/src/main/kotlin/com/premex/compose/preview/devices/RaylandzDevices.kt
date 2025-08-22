package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Raylandz device specifications for Android Compose previews.
 *
 * This extension provides Raylandz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Raylandz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Raylandz get() = object {
    /** Raylandz H1 PLUS */
    val H1_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Raylandz P20 PLUS */
    val P20_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Raylandz P5000 */
    val P5000 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Raylandz PHOENIX_N1 */
    val PHOENIX_N1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Raylandz XPOWER_P6000 */
    val XPOWER_P6000 = "spec:width=1080,height=2160,unit=px,dpi=480"

}
