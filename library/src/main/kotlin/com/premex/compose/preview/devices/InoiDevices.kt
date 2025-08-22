package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Inoi device specifications for Android Compose previews.
 *
 * This extension provides Inoi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Inoi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Inoi get() = object {
    /** Inoi A126 */
    val A126 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Inoi A160 */
    val A160 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Inoi A181 */
    val A181 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Inoi easyphone */
    val EASYPHONE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Inoi INOI 1 Lite */
    val INOI_1_LITE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Inoi INOI_2 */
    val INOI_2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Inoi INOI_2_2019 */
    val INOI_2_2019 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Inoi INOI_2_2021 */
    val INOI_2_2021 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Inoi INOI_2_LITE */
    val INOI_2_LITE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Inoi INOI 2 Lite 2019 */
    val INOI_2_LITE_2019 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Inoi INOI 2 Lite 2021 */
    val INOI_2_LITE_2021 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Inoi INOI_3 */
    val INOI_3 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Inoi INOI_3_LITE */
    val INOI_3_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Inoi INOI_3_POWER */
    val INOI_3_POWER = "spec:width=480,height=960,unit=px,dpi=240"

    /** Inoi INOI_5_2021 */
    val INOI_5_2021 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Inoi INOI_5i */
    val INOI_5I = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Inoi INOI_5i_Lite */
    val INOI_5I_LITE = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Inoi INOI_5_Lite_2021 */
    val INOI_5_LITE_2021 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Inoi INOI 5 Pro */
    val INOI_5_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Inoi INOI_6i */
    val INOI_6I = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Inoi INOI_6i_Lite */
    val INOI_6I_LITE = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Inoi INOI_7_2020 */
    val INOI_7_2020 = "spec:width=720,height=1520,unit=px,dpi=340"

    /** Inoi INOI_7_4_64_2021 */
    val INOI_7_4_64_2021 = "spec:width=720,height=1520,unit=px,dpi=340"

    /** Inoi INOI_7i */
    val INOI_7I = "spec:width=480,height=996,unit=px,dpi=240"

    /** Inoi INOI_A14 */
    val INOI_A14 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Inoi INOI A151 */
    val INOI_A151 = "spec:width=720,height=1600,unit=px,dpi=260"

    /** Inoi INOI A34 */
    val INOI_A34 = "spec:width=720,height=1600,unit=px,dpi=260"

    /** Inoi INOI A35 Adventure */
    val INOI_A35_ADVENTURE = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Inoi INOI A52 Lite 32GB */
    val INOI_A52_LITE_32GB = "spec:width=480,height=960,unit=px,dpi=213"

    /** Inoi INOI A62 64GB */
    val INOI_A62_64GB = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Inoi INOI A72 */
    val INOI_A72 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Inoi INOI A75 Elegance */
    val INOI_A75_ELEGANCE = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Inoi INOI Note 12 */
    val INOI_NOTE_12 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Inoi inoiPad */
    val INOIPAD = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Inoi inoiPad_Max */
    val INOIPAD_MAX = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Inoi inoiPad_mini_3G */
    val INOIPAD_MINI_3G = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Inoi inoiPad_mini_WiFi */
    val INOIPAD_MINI_WIFI = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Inoi inoiPad_Pro */
    val INOIPAD_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Inoi Note_13s256 */
    val NOTE_13S256 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Inoi T100 */
    val T100 = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Inoi T107 */
    val T107 = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Inoi T107_Plus */
    val T107_PLUS = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Inoi T108 */
    val T108 = "spec:width=800,height=1280,unit=px,dpi=220"

}
