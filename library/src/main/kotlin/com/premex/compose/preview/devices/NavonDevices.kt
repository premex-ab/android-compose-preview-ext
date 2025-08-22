package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Navon device specifications for Android Compose previews.
 *
 * This extension provides Navon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Navon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Navon get() = object {
    /** Navon D455 */
    val D455 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Navon Infinity */
    val INFINITY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Navon iQ7 2018 */
    val IQ7_2018 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Navon Navon_IQ8_2021 */
    val NAVON_IQ8_2021 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Navon Navon_IQ8_2021 */
    val NAVON_IQ8_2021_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Navon Platinum 10 3G */
    val PLATINUM_10_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Navon Platinum103G2019 */
    val PLATINUM103G2019 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Navon Pure Micro */
    val PURE_MICRO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Navon SKY */
    val SKY = "spec:width=480,height=960,unit=px,dpi=240"

    /** Navon Spirit */
    val SPIRIT = "spec:width=480,height=960,unit=px,dpi=240"

    /** Navon Spirit Plus */
    val SPIRIT_PLUS = "spec:width=640,height=1280,unit=px,dpi=320"

}
