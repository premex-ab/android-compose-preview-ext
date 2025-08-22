package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Villaon device specifications for Android Compose previews.
 *
 * This extension provides Villaon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Villaon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Villaon get() = object {
    /** Villaon A06s */
    val A06S = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Villaon V20 */
    val V20 = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Villaon V20 SE */
    val V20_SE = "spec:width=480,height=854,unit=px,dpi=200"

    /** Villaon V30 RS */
    val V30_RS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Villaon V40 */
    val V40 = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Villaon V40s */
    val V40S = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Villaon VILLAON V30 */
    val VILLAON_V30 = "spec:width=540,height=1200,unit=px,dpi=240"

}
