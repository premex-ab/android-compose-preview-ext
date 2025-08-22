package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sego device specifications for Android Compose previews.
 *
 * This extension provides Sego device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sego.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sego get() = object {
    /** Sego S25 Neo */
    val S25_NEO = "spec:width=720,height=1600,unit=px,dpi=272"

    /** Sego SEGO_S24 */
    val SEGO_S24 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sego SEGO_Zero_50 */
    val SEGO_ZERO_50 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Sego S_PAD */
    val S_PAD = "spec:width=800,height=1280,unit=px,dpi=213"

}
