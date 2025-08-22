package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Acer device specifications for Android Compose previews.
 *
 * This extension provides Acer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Acer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Acer get() = object {
    /** Acer A10M1 */
    val A10M1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer A11M1 */
    val A11M1 = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Acer A1-734 */
    val A1_734 = "spec:width=720,height=1280,unit=px,dpi=213"

    /** Acer A1-810 */
    val A1_810 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Acer A1-830 */
    val A1_830 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Acer A3-A11 */
    val A3_A11 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer A3-A20 */
    val A3_A20 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer A3-A20FHD */
    val A3_A20FHD = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer A3-A30 */
    val A3_A30 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer A3-A40 */
    val A3_A40 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer A8M1 */
    val A8M1 = "spec:width=800,height=1340,unit=px,dpi=213"

    /** Acer  Acer_A60  */
    val ACER_A60 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Acer Acer_A60L */
    val ACER_A60L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Acer  Acer_A61LX  */
    val ACER_A61LX = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Acer Acer_A62_LITE */
    val ACER_A62_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Acer Acer_AC50_RD */
    val ACER_AC50_RD = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Acer Acer_AC81 */
    val ACER_AC81 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Acer Acer_AC92_RD */
    val ACER_AC92_RD = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Acer ACER_ALTOS_EZB */
    val ACER_ALTOS_EZB = "spec:width=2160,height=3840,unit=px,dpi=420"

    /** Acer Acer_AQ9_EU */
    val ACER_AQ9_EU = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Acer Acer_AX61 */
    val ACER_AX61 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Acer Acer_AX64 */
    val ACER_AX64 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Acer Acer_AX85 */
    val ACER_AX85 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Acer Acer education whiteboard */
    val ACER_EDUCATION_WHITEBOARD = "spec:width=2160,height=3840,unit=px,dpi=420"

    /** Acer Acer One 10 T4-129LI */
    val ACER_ONE_10_T4_129LI = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer Acer One 10 T8-129L */
    val ACER_ONE_10_T8_129L = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer Acer_One_10_T9-1212L */
    val ACER_ONE_10_T9_1212L = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer Acer One 7 4G */
    val ACER_ONE_7_4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer Acer_one_8_T2 */
    val ACER_ONE_8_T2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer Acer One 8 T4-82L */
    val ACER_ONE_8_T4_82L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer Acer One 8 T4-82L */
    val ACER_ONE_8_T4_82L_800X1280 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Acer Acer One 8 T9-422L */
    val ACER_ONE_8_T9_422L = "spec:width=800,height=1340,unit=px,dpi=240"

    /** Acer Acer One T10-22L */
    val ACER_ONE_T10_22L = "spec:width=1200,height=2000,unit=px,dpi=260"

    /** Acer ACTAB1021_A */
    val ACTAB1021_A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer ACTAB1022 */
    val ACTAB1022 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer ACTAB1024 */
    val ACTAB1024 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer ACTAB10KB24 */
    val ACTAB10KB24 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer ACTAB1123 */
    val ACTAB1123 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Acer ACTAB1422 */
    val ACTAB1422 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Acer ACTAB721 */
    val ACTAB721 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acer ACTAB723 */
    val ACTAB723 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acer ACTAB821_A */
    val ACTAB821_A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer ACTABKID */
    val ACTABKID = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer ARSP25MTA14A1 */
    val ARSP25MTA14A1 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Acer AS10W */
    val AS10W = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Acer AS10WF */
    val AS10WF = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Acer AS8W */
    val AS8W = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer ATAB1021E */
    val ATAB1021E = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer ATAB1024E */
    val ATAB1024E = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer ATAB10KB24E */
    val ATAB10KB24E = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer ATAB1123E */
    val ATAB1123E = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Acer ATAB1422E */
    val ATAB1422E = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Acer ATAB721E */
    val ATAB721E = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acer ATAB723E */
    val ATAB723E = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acer ATAB821E */
    val ATAB821E = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer ATABKD1024K */
    val ATABKD1024K = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer ATLTE1022 */
    val ATLTE1022 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer ATLTE1022E */
    val ATLTE1022E = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer B1-710 */
    val B1_710 = "spec:width=600,height=976,unit=px,dpi=160"

    /** Acer B1-711 */
    val B1_711 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acer B1-720 */
    val B1_720 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acer B1-723 */
    val B1_723 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acer B1-730 */
    val B1_730 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acer B1-733 */
    val B1_733 = "spec:width=720,height=1280,unit=px,dpi=213"

    /** Acer B1-820 */
    val B1_820 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer B1-850 */
    val B1_850 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer B1-A71 */
    val B1_A71 = "spec:width=600,height=976,unit=px,dpi=160"

    /** Acer B3-A30 */
    val B3_A30 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer Battlezone */
    val BATTLEZONE = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer Battlezone LTE */
    val BATTLEZONE_LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer Baymax */
    val BAYMAX = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer C01 (PA) */
    val C01_PA = "spec:width=480,height=640,unit=px,dpi=240"

    /** Acer Frontier */
    val FRONTIER = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Acer G1-715 */
    val G1_715 = "spec:width=600,height=976,unit=px,dpi=160"

    /** Acer GT-810 */
    val GT_810 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Acer Iconia One 10 */
    val ICONIA_ONE_10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer Iconia One 10 */
    val ICONIA_ONE_10_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer Iconia One 7 */
    val ICONIA_ONE_7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acer Iconia One 7 */
    val ICONIA_ONE_7_720X1280 = "spec:width=720,height=1280,unit=px,dpi=213"

    /** Acer Iconia One 7 */
    val ICONIA_ONE_7_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer Iconia One 8 */
    val ICONIA_ONE_8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer Iconia Tab 10 */
    val ICONIA_TAB_10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer Iconia Tab 10 */
    val ICONIA_TAB_10_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer Iconia Tab 10 (AsgardLTE) */
    val ICONIA_TAB_10_ASGARDLTE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer Iconia Tab 7 */
    val ICONIA_TAB_7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acer Iconia Tab 7 */
    val ICONIA_TAB_7_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer Iconia Tab 8 */
    val ICONIA_TAB_8 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Acer Iconia Tab 8 */
    val ICONIA_TAB_8_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Acer Iconia Tab A210 */
    val ICONIA_TAB_A210 = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Acer Iconia Tab A511 */
    val ICONIA_TAB_A511 = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Acer Iconia Tab A700 */
    val ICONIA_TAB_A700 = "spec:width=1128,height=1920,unit=px,dpi=240"

    /** Acer Liquid E2 */
    val LIQUID_E2 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Acer Liquid E700 */
    val LIQUID_E700 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Acer Liquid Jade Z */
    val LIQUID_JADE_Z = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Acer Liquid T2 */
    val LIQUID_T2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Acer Liquid Z220 */
    val LIQUID_Z220 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Acer Liquid Z3 */
    val LIQUID_Z3 = "spec:width=320,height=480,unit=px,dpi=160"

    /** Acer Liquid Z320 */
    val LIQUID_Z320 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Acer Liquid Z330 */
    val LIQUID_Z330 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Acer Liquid Z410 */
    val LIQUID_Z410 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Acer Liquid Z500 */
    val LIQUID_Z500 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Acer Liquid Z520 */
    val LIQUID_Z520 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Acer Liquid Z6 */
    val LIQUID_Z6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Acer Liquid Z630 */
    val LIQUID_Z630 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Acer Liquid Z630S */
    val LIQUID_Z630S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Acer Liquid Z6E */
    val LIQUID_Z6E = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Acer Liquid Z6 Plus */
    val LIQUID_Z6_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Acer Liquid Zest */
    val LIQUID_ZEST = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Acer Liquid Zest 4G */
    val LIQUID_ZEST_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Acer Liquid Zest Plus */
    val LIQUID_ZEST_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Acer P10M2 */
    val P10M2 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Acer P11 */
    val P11 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Acer Tattoo */
    val TATTOO = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Acer Ultimo */
    val ULTIMO = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer V10M2 */
    val V10M2 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer V11M1 */
    val V11M1 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Acer Walle */
    val WALLE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Acer X12M1 */
    val X12M1 = "spec:width=1600,height=2560,unit=px,dpi=320"

}
