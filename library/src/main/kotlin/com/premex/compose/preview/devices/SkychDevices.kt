package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Skych device specifications for Android Compose previews.
 *
 * This extension provides Skych device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Skych.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Skych get() = object {
    /** Skych Elite A6 */
    val ELITE_A6 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Skych Elite C55 */
    val ELITE_C55 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Skych Elite N55Max */
    val ELITE_N55MAX = "spec:width=480,height=960,unit=px,dpi=200"

    /** Skych Elite OctaPlus */
    val ELITE_OCTAPLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Skych Elite OctaPLus */
    val ELITE_OCTAPLUS_800X1280 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Skych Elite T8 */
    val ELITE_T8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Skych SKY_KIDsPro */
    val SKY_KIDSPRO = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Skych SKY_PAD10Max */
    val SKY_PAD10MAX = "spec:width=800,height=1280,unit=px,dpi=190"

    /** Skych SKY_PAD8PROUS */
    val SKY_PAD8PROUS = "spec:width=800,height=1280,unit=px,dpi=220"

}
