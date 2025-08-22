package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Casper device specifications for Android Compose previews.
 *
 * This extension provides Casper device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Casper.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Casper get() = object {
    /** Casper CASPER_L10_4_5G */
    val CASPER_L10_4_5G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Casper Casper VIA S48 */
    val CASPER_VIA_S48 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Casper L20 */
    val L20 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Casper S20 */
    val S20 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Casper S38 */
    val S38 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Casper VIA_A1 */
    val VIA_A1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Casper VIA_A1_1 */
    val VIA_A1_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Casper VIA_A1_Plus */
    val VIA_A1_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Casper VIA A2 */
    val VIA_A2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Casper VIA_A3 */
    val VIA_A3 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Casper VIA A3 Plus */
    val VIA_A3_PLUS = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Casper VIA A4 */
    val VIA_A4 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Casper VIA A40 */
    val VIA_A40 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Casper VIA A40 */
    val VIA_A40_720X1600 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Casper VIA_E3 */
    val VIA_E3 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Casper VIA_E3_0 */
    val VIA_E3_0 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Casper VIA_E4 */
    val VIA_E4 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Casper VIA_F20 */
    val VIA_F20 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Casper VIA_F3 */
    val VIA_F3 = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Casper VIA F30 */
    val VIA_F30 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Casper VIA F30 Plus */
    val VIA_F30_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Casper VIA G1 */
    val VIA_G1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Casper VIA G1 Plus */
    val VIA_G1_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Casper VIA_ G3 */
    val VIA_G3 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Casper VIA G5 */
    val VIA_G5 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Casper VIA_L30 */
    val VIA_L30 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Casper VIA_L30_0 */
    val VIA_L30_0 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Casper VIA_L40 */
    val VIA_L40 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Casper VIA L50 */
    val VIA_L50 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Casper VIA M3 */
    val VIA_M3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Casper VIA M30 */
    val VIA_M30 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Casper VIA M30 Plus */
    val VIA_M30_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Casper VIA M35 */
    val VIA_M35 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Casper VIA_M4 */
    val VIA_M4 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Casper VIA_P2 */
    val VIA_P2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Casper VIA P3 */
    val VIA_P3 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Casper VIA_S */
    val VIA_S = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Casper VIA_S10 */
    val VIA_S10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Casper VIA_S30 */
    val VIA_S30 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Casper VIA_S30_0 */
    val VIA_S30_0 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Casper VIA_S40 */
    val VIA_S40 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Casper VIA_S48_0 */
    val VIA_S48_0 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Casper VIA S50 */
    val VIA_S50 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Casper VIA T7D */
    val VIA_T7D = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Casper VIA X20 */
    val VIA_X20 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Casper VIA X30 */
    val VIA_X30 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Casper VIA X30 Plus */
    val VIA_X30_PLUS = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Casper VIA_X40 */
    val VIA_X40 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Casper VIA X45 */
    val VIA_X45 = "spec:width=1080,height=2400,unit=px,dpi=480"

}
