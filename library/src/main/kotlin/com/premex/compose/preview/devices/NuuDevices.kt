package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nuu device specifications for Android Compose previews.
 *
 * This extension provides Nuu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nuu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nuu get() = object {
    /** Nuu A1 */
    val A1 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Nuu A10L */
    val A10L = "spec:width=480,height=960,unit=px,dpi=200"

    /** Nuu A11L */
    val A11L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Nuu A15 */
    val A15 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Nuu A23 Plus */
    val A23_PLUS = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Nuu A25 */
    val A25 = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Nuu A3 */
    val A3 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Nuu A4L */
    val A4L = "spec:width=480,height=854,unit=px,dpi=240"

    /** Nuu A5L */
    val A5L = "spec:width=480,height=960,unit=px,dpi=240"

    /** Nuu A6L-C */
    val A6L_C = "spec:width=480,height=960,unit=px,dpi=240"

    /** Nuu A6L-G */
    val A6L_G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Nuu A7L */
    val A7L = "spec:width=480,height=960,unit=px,dpi=240"

    /** Nuu A9L */
    val A9L = "spec:width=480,height=1014,unit=px,dpi=213"

    /** Nuu B10 */
    val B10 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Nuu B15 */
    val B15 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Nuu B20 */
    val B20 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Nuu B30 */
    val B30 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Nuu G2 */
    val G2 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Nuu M19 */
    val M19 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Nuu M2 */
    val M2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nuu M3 */
    val M3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nuu M6 */
    val M6 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Nuu N13 */
    val N13 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Nuu N20 */
    val N20 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Nuu N30 */
    val N30 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Nuu N5L */
    val N5L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nuu N6001L */
    val N6001L = "spec:width=480,height=960,unit=px,dpi=180"

    /** Nuu NUU A3 (TC) */
    val NUU_A3_TC = "spec:width=480,height=854,unit=px,dpi=240"

    /** Nuu NUU G3 */
    val NUU_G3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Nuu NUU G5 */
    val NUU_G5 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Nuu Tab 10 */
    val TAB_10 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Nuu Tab 10 Plus */
    val TAB_10_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nuu Tab 8 */
    val TAB_8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nuu Tab 8 */
    val TAB_8_800X1280 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nuu Tab 8 Plus */
    val TAB_8_PLUS = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nuu X10 5G */
    val X10_5G = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Nuu X4 */
    val X4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nuu X5 */
    val X5 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Nuu X6 */
    val X6 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Nuu X6mini */
    val X6MINI = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Nuu X6 Plus */
    val X6_PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Nuu X7 Plus */
    val X7_PLUS = "spec:width=720,height=1612,unit=px,dpi=280"

}
