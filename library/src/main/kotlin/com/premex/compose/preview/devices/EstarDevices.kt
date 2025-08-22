package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Estar device specifications for Android Compose previews.
 *
 * This extension provides Estar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Estar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Estar get() = object {
    /** Estar 1021W_URBAN */
    val _1021W_URBAN = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Estar Digni-Smart */
    val DIGNI_SMART = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Estar eSTAR BEAUTY 2 HD Quad core */
    val ESTAR_BEAUTY_2_HD_QUAD_CORE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Estar MID1020L */
    val MID1020L = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Estar MID7399 */
    val MID7399 = "spec:width=600,height=1024,unit=px,dpi=160"

}
