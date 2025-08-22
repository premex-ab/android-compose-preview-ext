package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Walton device specifications for Android Compose previews.
 *
 * This extension provides Walton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Walton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Walton get() = object {
    /** Walton Customer need debug */
    val CUSTOMER_NEED_DEBUG = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Walton LT750 */
    val LT750 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Walton NEXG_N25 */
    val NEXG_N25 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Walton NEXG N26 */
    val NEXG_N26 = "spec:width=720,height=1612,unit=px,dpi=480"

    /** Walton NEXG_N27 */
    val NEXG_N27 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Walton NEXG N71 */
    val NEXG_N71 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Walton NEXG N71 Plus */
    val NEXG_N71_PLUS = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Walton NEXG N72 */
    val NEXG_N72 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Walton NEXG N73 */
    val NEXG_N73 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Walton NEXG N74 */
    val NEXG_N74 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Walton NEXG N8 */
    val NEXG_N8 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Walton Orbit M20 */
    val ORBIT_M20 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Walton Orbit Y11 */
    val ORBIT_Y11 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Walton ORBIT Y12 */
    val ORBIT_Y12 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Walton ORBIT Y13 */
    val ORBIT_Y13 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Walton Orbit Y20 */
    val ORBIT_Y20 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Walton ORBIT Y70 */
    val ORBIT_Y70 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Walton PRIMO D10 */
    val PRIMO_D10 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo D9 */
    val PRIMO_D9 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Walton Primo E10 */
    val PRIMO_E10 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Walton Primo E10 PlUS */
    val PRIMO_E10_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Walton Primo E11 */
    val PRIMO_E11 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Walton Primo E12 */
    val PRIMO_E12 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Walton Primo E8s */
    val PRIMO_E8S = "spec:width=480,height=854,unit=px,dpi=240"

    /** Walton Primo E9 */
    val PRIMO_E9 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Walton PRIMO_EF10 */
    val PRIMO_EF10 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Walton Primo EF7 */
    val PRIMO_EF7 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo EF8 4G */
    val PRIMO_EF8_4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo_EF9 */
    val PRIMO_EF9 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo EM2 */
    val PRIMO_EM2 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton PRIMO F10 */
    val PRIMO_F10 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo F8 */
    val PRIMO_F8 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Walton Primo F8s */
    val PRIMO_F8S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo F9 */
    val PRIMO_F9 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo G8i */
    val PRIMO_G8I = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo G8i 4G */
    val PRIMO_G8I_4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo G9 */
    val PRIMO_G9 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Walton Primo GF6 */
    val PRIMO_GF6 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Walton Primo GF7 */
    val PRIMO_GF7 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton PRIMO GH10 */
    val PRIMO_GH10 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Walton Primo GH7 */
    val PRIMO_GH7 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo GH7i */
    val PRIMO_GH7I = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo GH8 */
    val PRIMO_GH8 = "spec:width=720,height=1498,unit=px,dpi=320"

    /** Walton Primo GH9 */
    val PRIMO_GH9 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Walton Primo GM2 */
    val PRIMO_GM2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Walton Primo GM2 Plus */
    val PRIMO_GM2_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Walton Primo GM3 */
    val PRIMO_GM3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo GM4 */
    val PRIMO_GM4 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Walton Primo H10 */
    val PRIMO_H10 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Walton Primo H7s */
    val PRIMO_H7S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Walton Primo H8 Pro */
    val PRIMO_H8_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Walton Primo H9 */
    val PRIMO_H9 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Walton Primo H9 Pro */
    val PRIMO_H9_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Walton Primo HM5 */
    val PRIMO_HM5 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Walton Primo HM6 */
    val PRIMO_HM6 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Walton Primo HM7 */
    val PRIMO_HM7 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Walton Primo N4 */
    val PRIMO_N4 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Walton Primo N5 */
    val PRIMO_N5 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Walton Primo NF3 */
    val PRIMO_NF3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Walton Primo NF4 */
    val PRIMO_NF4 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo NF5 */
    val PRIMO_NF5 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Walton Primo NH3 */
    val PRIMO_NH3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Walton Primo NH3i */
    val PRIMO_NH3I = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Walton Primo NH3 Lite */
    val PRIMO_NH3_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Walton PRIMO NH4 */
    val PRIMO_NH4 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo NH5 */
    val PRIMO_NH5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Walton Primo NX6 */
    val PRIMO_NX6 = "spec:width=1440,height=3040,unit=px,dpi=560"

    /** Walton Primo R4 Plus */
    val PRIMO_R4_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Walton Primo R5 */
    val PRIMO_R5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Walton Primo R5 Plus */
    val PRIMO_R5_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Walton Primo R6 */
    val PRIMO_R6 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Walton Primo R6 Max */
    val PRIMO_R6_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Walton Primo R8 */
    val PRIMO_R8 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Walton Primo R9 */
    val PRIMO_R9 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Walton Primo RM2 mini */
    val PRIMO_RM2_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Walton Primo_RM3 */
    val PRIMO_RM3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Walton Primo RM4 */
    val PRIMO_RM4 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Walton Primo RX6 */
    val PRIMO_RX6 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Walton Primo RX7 */
    val PRIMO_RX7 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Walton PRIMO_RX8 */
    val PRIMO_RX8 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Walton Primo RX8 Mini */
    val PRIMO_RX8_MINI = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Walton PRIMO_RX9 */
    val PRIMO_RX9 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Walton Primo S6 */
    val PRIMO_S6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Walton Primo S6 Dual */
    val PRIMO_S6_DUAL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Walton Primo S6 infinity */
    val PRIMO_S6_INFINITY = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Walton PRIMO_S7 */
    val PRIMO_S7 = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Walton Primo S7  Pro */
    val PRIMO_S7_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Walton PRIMO_S8 */
    val PRIMO_S8 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Walton Primo ZX3 */
    val PRIMO_ZX3 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Walton PRIMO_ZX4 */
    val PRIMO_ZX4 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Walton RX7 Mini */
    val RX7_MINI = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Walton WALPAD 10H */
    val WALPAD_10H = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Walton WALPAD 10H Pro */
    val WALPAD_10H_PRO = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Walton Walpad10HProMax */
    val WALPAD10HPROMAX = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Walton WALPAD 10P */
    val WALPAD_10P = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Walton WALPAD 8G */
    val WALPAD_8G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Walton WALPAD 8G */
    val WALPAD_8G_800X1280 = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Walton WALPAD_9G */
    val WALPAD_9G = "spec:width=800,height=1340,unit=px,dpi=213"

    /** Walton Walton Primo X5 */
    val WALTON_PRIMO_X5 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Walton XANON X20 */
    val XANON_X20 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Walton XANON X21 */
    val XANON_X21 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Walton XANON_X90 */
    val XANON_X90 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Walton XANON_X91 */
    val XANON_X91 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Walton ZenX 1  */
    val ZENX_1 = "spec:width=720,height=1612,unit=px,dpi=480"

    /** Walton zenx 2 */
    val ZENX_2 = "spec:width=720,height=1600,unit=px,dpi=480"

}
