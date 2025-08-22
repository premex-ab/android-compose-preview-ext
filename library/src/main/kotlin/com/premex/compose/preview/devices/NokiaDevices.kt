package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nokia device specifications for Android Compose previews.
 *
 * This extension provides Nokia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nokia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nokia get() = object {
    /** Nokia N1 */
    val N1 = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Nokia Nokia 1 */
    val NOKIA_1 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Nokia Nokia 1.3 */
    val NOKIA_1_3 = "spec:width=720,height=1520,unit=px,dpi=300"

    /** Nokia Nokia 1.4 */
    val NOKIA_1_4 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia 1 Plus */
    val NOKIA_1_PLUS = "spec:width=480,height=960,unit=px,dpi=213"

    /** Nokia Nokia 2 */
    val NOKIA_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nokia Nokia 2.1 */
    val NOKIA_2_1 = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Nokia Nokia 2.2 */
    val NOKIA_2_2 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Nokia Nokia 2.3 */
    val NOKIA_2_3 = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Nokia Nokia 2.4 */
    val NOKIA_2_4 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia 2 V */
    val NOKIA_2_V = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Nokia Nokia 2 V Tella */
    val NOKIA_2_V_TELLA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Nokia Nokia 3 */
    val NOKIA_3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nokia Nokia 3.1 */
    val NOKIA_3_1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Nokia Nokia 3.1 C */
    val NOKIA_3_1_C = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Nokia Nokia 3.1 Plus */
    val NOKIA_3_1_PLUS = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Nokia Nokia 3.2 */
    val NOKIA_3_2 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Nokia Nokia 3.4 */
    val NOKIA_3_4 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Nokia Nokia 3 V */
    val NOKIA_3_V = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Nokia Nokia 4.2 */
    val NOKIA_4_2 = "spec:width=720,height=1520,unit=px,dpi=300"

    /** Nokia Nokia 5 */
    val NOKIA_5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nokia Nokia 5.1 */
    val NOKIA_5_1 = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Nokia Nokia 5.1 Plus */
    val NOKIA_5_1_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Nokia Nokia 5.3 */
    val NOKIA_5_3 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia 5.4 */
    val NOKIA_5_4 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Nokia Nokia 6 */
    val NOKIA_6 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Nokia Nokia 6 */
    val NOKIA_6_1080X1920 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Nokia Nokia 6.1 */
    val NOKIA_6_1 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Nokia Nokia 6.1 Plus */
    val NOKIA_6_1_PLUS = "spec:width=1080,height=2280,unit=px,dpi=420"

    /** Nokia Nokia 6.2 */
    val NOKIA_6_2 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Nokia Nokia 7 */
    val NOKIA_7 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Nokia Nokia 7.1 */
    val NOKIA_7_1 = "spec:width=1080,height=2280,unit=px,dpi=420"

    /** Nokia Nokia 7.2 */
    val NOKIA_7_2 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Nokia Nokia 7 plus */
    val NOKIA_7_PLUS = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Nokia Nokia 8 */
    val NOKIA_8 = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Nokia Nokia 8.1 */
    val NOKIA_8_1 = "spec:width=1080,height=2246,unit=px,dpi=420"

    /** Nokia Nokia 8.3 5G */
    val NOKIA_8_3_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Nokia Nokia 8 Sirocco */
    val NOKIA_8_SIROCCO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Nokia Nokia 8 Sirocco */
    val NOKIA_8_SIROCCO_1440X2560 = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Nokia Nokia 8 V 5G UW */
    val NOKIA_8_V_5G_UW = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Nokia Nokia 9 */
    val NOKIA_9 = "spec:width=1440,height=2880,unit=px,dpi=560"

    /** Nokia Nokia C01 Plus */
    val NOKIA_C01_PLUS = "spec:width=720,height=1440,unit=px,dpi=300"

    /** Nokia Nokia C02 */
    val NOKIA_C02 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Nokia Nokia C1 */
    val NOKIA_C1 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Nokia Nokia C10 */
    val NOKIA_C10 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia C100 */
    val NOKIA_C100 = "spec:width=720,height=1440,unit=px,dpi=300"

    /** Nokia Nokia C110 */
    val NOKIA_C110 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Nokia Nokia C1 2nd Edition */
    val NOKIA_C1_2ND_EDITION = "spec:width=720,height=1440,unit=px,dpi=300"

    /** Nokia Nokia C12 Pro */
    val NOKIA_C12_PRO = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Nokia Nokia C1 Plus */
    val NOKIA_C1_PLUS = "spec:width=720,height=1440,unit=px,dpi=300"

    /** Nokia Nokia C2 */
    val NOKIA_C2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Nokia Nokia C20 */
    val NOKIA_C20 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia C200 */
    val NOKIA_C200 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Nokia Nokia C20 Plus */
    val NOKIA_C20_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia C21 */
    val NOKIA_C21 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia C210 */
    val NOKIA_C210 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Nokia Nokia C21 Plus */
    val NOKIA_C21_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia C22 */
    val NOKIA_C22 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia C2 2nd Edition */
    val NOKIA_C2_2ND_EDITION = "spec:width=480,height=960,unit=px,dpi=200"

    /** Nokia Nokia C2 Tennen */
    val NOKIA_C2_TENNEN = "spec:width=720,height=1440,unit=px,dpi=300"

    /** Nokia Nokia C3 */
    val NOKIA_C3 = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Nokia Nokia C30 */
    val NOKIA_C30 = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Nokia Nokia C300 */
    val NOKIA_C300 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia C31 */
    val NOKIA_C31 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia C32 */
    val NOKIA_C32 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia C5 Endi */
    val NOKIA_C5_ENDI = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia G10 */
    val NOKIA_G10 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia G100 */
    val NOKIA_G100 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia G11 */
    val NOKIA_G11 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia G11 Plus */
    val NOKIA_G11_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia G20 */
    val NOKIA_G20 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia G21 */
    val NOKIA_G21 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia G22 */
    val NOKIA_G22 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia G300 */
    val NOKIA_G300 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Nokia Nokia G310 5G */
    val NOKIA_G310_5G = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Nokia Nokia G400 5G */
    val NOKIA_G400_5G = "spec:width=1080,height=2408,unit=px,dpi=400"

    /** Nokia Nokia G42 5G */
    val NOKIA_G42_5G = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Nokia Nokia G50 */
    val NOKIA_G50 = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Nokia Nokia G60 5G */
    val NOKIA_G60_5G = "spec:width=1080,height=2408,unit=px,dpi=400"

    /** Nokia Nokia T10 */
    val NOKIA_T10 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Nokia Nokia T20 */
    val NOKIA_T20 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Nokia Nokia T21 */
    val NOKIA_T21 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Nokia Nokia X10 */
    val NOKIA_X10 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Nokia Nokia X100 */
    val NOKIA_X100 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Nokia Nokia X20 */
    val NOKIA_X20 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Nokia Nokia X30 5G */
    val NOKIA_X30_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Nokia Nokia X5 */
    val NOKIA_X5 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Nokia Nokia X6 */
    val NOKIA_X6 = "spec:width=1080,height=2280,unit=px,dpi=420"

    /** Nokia Nokia X7 */
    val NOKIA_X7 = "spec:width=1080,height=2246,unit=px,dpi=420"

    /** Nokia Nokia X71 */
    val NOKIA_X71 = "spec:width=1080,height=2310,unit=px,dpi=420"

    /** Nokia Nokia XR20 */
    val NOKIA_XR20 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Nokia Nokia XR21 */
    val NOKIA_XR21 = "spec:width=1080,height=2400,unit=px,dpi=400"

}
