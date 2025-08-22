package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sico device specifications for Android Compose previews.
 *
 * This extension provides Sico device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sico.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sico get() = object {
    /** Sico Diamond 2 */
    val DIAMOND_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sico Infinity */
    val INFINITY = "spec:width=480,height=996,unit=px,dpi=240"

    /** Sico Infinity Max */
    val INFINITY_MAX = "spec:width=480,height=996,unit=px,dpi=240"

    /** Sico Mega2 */
    val MEGA2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sico Mega2max */
    val MEGA2MAX = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sico More_3 */
    val MORE_3 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Sico Nile X */
    val NILE_X = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sico PLUS2 */
    val PLUS2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Sico PLUS2 4G */
    val PLUS2_4G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Sico Plus3_4G */
    val PLUS3_4G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Sico Sico Express 3 */
    val SICO_EXPRESS_3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Sico Sico Topaz */
    val SICO_TOPAZ = "spec:width=720,height=1280,unit=px,dpi=320"

}
