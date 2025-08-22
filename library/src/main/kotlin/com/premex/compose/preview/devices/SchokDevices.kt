package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Schok device specifications for Android Compose previews.
 *
 * This extension provides Schok device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Schok.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Schok get() = object {
    /** Schok freedom turbo */
    val FREEDOM_TURBO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Schok freedom turbo XL */
    val FREEDOM_TURBO_XL = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Schok SV55216A */
    val SV55216A = "spec:width=480,height=960,unit=px,dpi=240"

    /** Schok SV67Q */
    val SV67Q = "spec:width=720,height=1600,unit=px,dpi=320"

}
