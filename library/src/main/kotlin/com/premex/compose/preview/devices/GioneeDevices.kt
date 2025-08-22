package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gionee device specifications for Android Compose previews.
 *
 * This extension provides Gionee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gionee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gionee get() = object {
    /** Gionee A1 */
    val A1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee A1 lite */
    val A1_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee A1 Plus */
    val A1_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee E8 */
    val E8 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Gionee F10 */
    val F10 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Gionee F100A */
    val F100A = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee F100S */
    val F100S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee F103 */
    val F103 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee F103 Pro */
    val F103_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee F105 */
    val F105 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee F106 */
    val F106 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee F106L */
    val F106L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee F109N */
    val F109N = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee F10 Plus */
    val F10_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Gionee F205 */
    val F205 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gionee F5 */
    val F5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee F8_Neo */
    val F8_NEO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gionee F9 */
    val F9 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Gionee F9 Plus */
    val F9_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Gionee GIONEE F11 */
    val GIONEE_F11 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Gionee GIONEE H601 */
    val GIONEE_H601 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Gionee GIONEE_H603 */
    val GIONEE_H603 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Gionee GIONEE_M100 */
    val GIONEE_M100 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Gionee GIONEE_M11 */
    val GIONEE_M11 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Gionee GIONEE M15 */
    val GIONEE_M15 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Gionee GIONEE M7L */
    val GIONEE_M7L = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Gionee GIONEE MAX */
    val GIONEE_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Gionee GIONEE MAX Pro */
    val GIONEE_MAX_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Gionee GIONEE_P12 */
    val GIONEE_P12 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Gionee GIONEE P15 */
    val GIONEE_P15 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Gionee GIONEE P15 Pro */
    val GIONEE_P15_PRO = "spec:width=720,height=1640,unit=px,dpi=260"

    /** Gionee GIONEE X1 */
    val GIONEE_X1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee GN3001 */
    val GN3001 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee GN3003 */
    val GN3003 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee GN5002 */
    val GN5002 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee GN5003 */
    val GN5003 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee GN8001 */
    val GN8001 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee GN9006 */
    val GN9006 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee India */
    val INDIA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gionee M2mini */
    val M2MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Gionee M3 */
    val M3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee M5L */
    val M5L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee M5 Lite */
    val M5_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee M5 mini */
    val M5_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee M5 Plus */
    val M5_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee M6 */
    val M6 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee M6 Lite */
    val M6_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee M6 mirror */
    val M6_MIRROR = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee M6 Plus */
    val M6_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee M6SPlus */
    val M6SPLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee M7 Power */
    val M7_POWER = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gionee P3S */
    val P3S = "spec:width=480,height=854,unit=px,dpi=240"

    /** Gionee P5L */
    val P5L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee P5 mini */
    val P5_MINI = "spec:width=480,height=854,unit=px,dpi=240"

    /** Gionee P5W */
    val P5W = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee P61 */
    val P61 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Gionee P7 */
    val P7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee P7 Max */
    val P7_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee P8M */
    val P8M = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee P8W */
    val P8W = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee S10BL */
    val S10BL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee S10L */
    val S10L = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee S10 lite */
    val S10_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee S11 */
    val S11 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Gionee S11 lite */
    val S11_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gionee S12 Lite */
    val S12_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Gionee S6 */
    val S6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee S6 Pro */
    val S6_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee S6s */
    val S6S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee S8 */
    val S8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee S9 */
    val S9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gionee S_plus */
    val S_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gionee X1S */
    val X1S = "spec:width=720,height=1280,unit=px,dpi=320"

}
