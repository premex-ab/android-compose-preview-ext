package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Allview device specifications for Android Compose previews.
 *
 * This extension provides Allview device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Allview.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Allview get() = object {
    /** Allview A10 Lite */
    val A10_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Allview A10 Lite 2019 */
    val A10_LITE_2019 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Allview A10 Lite 2GB */
    val A10_LITE_2GB = "spec:width=480,height=960,unit=px,dpi=240"

    /** Allview A10 Max */
    val A10_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Allview A20 Lite */
    val A20_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Allview A20 Max */
    val A20_MAX = "spec:width=480,height=1014,unit=px,dpi=213"

    /** Allview A30 MAX */
    val A30_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Allview A30_Plus */
    val A30_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Allview A5 Easy */
    val A5_EASY = "spec:width=480,height=800,unit=px,dpi=240"

    /** Allview A5 Ready */
    val A5_READY = "spec:width=480,height=800,unit=px,dpi=240"

    /** Allview A9 Lite */
    val A9_LITE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Allview A9  Plus */
    val A9_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Allview AX501Q */
    val AX501Q = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Allview AX503 */
    val AX503 = "spec:width=600,height=1024,unit=px,dpi=240"

    /** Allview P10 Max */
    val P10_MAX = "spec:width=480,height=960,unit=px,dpi=240"

    /** Allview P10 Pro */
    val P10_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Allview P41 eMagic */
    val P41_EMAGIC = "spec:width=480,height=800,unit=px,dpi=240"

    /** Allview P4 Pro */
    val P4_PRO = "spec:width=768,height=1280,unit=px,dpi=360"

    /** Allview P5 eMagic */
    val P5_EMAGIC = "spec:width=480,height=854,unit=px,dpi=240"

    /** Allview P5 Energy */
    val P5_ENERGY = "spec:width=480,height=854,unit=px,dpi=240"

    /** Allview P7 Lite */
    val P7_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Allview P7 PRO */
    val P7_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Allview P8 eMagic */
    val P8_EMAGIC = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Allview P8 Energy */
    val P8_ENERGY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Allview P8 Energy mini */
    val P8_ENERGY_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Allview P8 Life */
    val P8_LIFE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Allview P8 Pro */
    val P8_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Allview P9 Energy */
    val P9_ENERGY = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Allview P9 Energy Lite 2017 */
    val P9_ENERGY_LITE_2017 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Allview P9 Energy Mini */
    val P9_ENERGY_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Allview P9 Energy S */
    val P9_ENERGY_S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Allview V10 Viper */
    val V10_VIPER = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Allview V10 Viper Lite */
    val V10_VIPER_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Allview V2 Viper S */
    val V2_VIPER_S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Allview V2 Viper X plus */
    val V2_VIPER_X_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Allview V3 Viper */
    val V3_VIPER = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Allview V4 Viper */
    val V4_VIPER = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Allview V4 Viper PRO */
    val V4_VIPER_PRO = "spec:width=640,height=1352,unit=px,dpi=240"

    /** Allview V5 Viper */
    val V5_VIPER = "spec:width=480,height=1014,unit=px,dpi=213"

    /** Allview Viva 1003G */
    val VIVA_1003G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Allview Viva 1003G Lite */
    val VIVA_1003G_LITE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Allview Viva 803G */
    val VIVA_803G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Allview Viva C1004 */
    val VIVA_C1004 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Allview Viva C703 */
    val VIVA_C703 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Allview Viva H1001 LTE */
    val VIVA_H1001_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Allview Viva H1002 LTE */
    val VIVA_H1002_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Allview Viva  H1003 LTE */
    val VIVA_H1003_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Allview Viva H1003 LTE PRO/1 */
    val VIVA_H1003_LTE_PRO_1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Allview Viva H1003 LTE PRO/1-64GB */
    val VIVA_H1003_LTE_PRO_1_64GB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Allview Viva H1003 LTE PRO3 */
    val VIVA_H1003_LTE_PRO3 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Allview Viva H1003 LTE PRO/B6 */
    val VIVA_H1003_LTE_PRO_B6 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Allview Viva H1004 LTE */
    val VIVA_H1004_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Allview Viva_H701_LTE */
    val VIVA_H701_LTE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Allview Viva H802 LTE */
    val VIVA_H802_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Allview Viva_Play_804_EEA */
    val VIVA_PLAY_804_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Allview X10_Soul_EEA */
    val X10_SOUL_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Allview X10_Soul_Lite */
    val X10_SOUL_LITE = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Allview X20_Soul_EEA */
    val X20_SOUL_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Allview X3 Soul Lite */
    val X3_SOUL_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Allview X3 Soul Plus */
    val X3_SOUL_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Allview X3 Soul Style */
    val X3_SOUL_STYLE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Allview X4 Soul Infinity N */
    val X4_SOUL_INFINITY_N = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Allview X4 Soul Infinity Plus */
    val X4_SOUL_INFINITY_PLUS = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Allview X4 Soul Infinity S */
    val X4_SOUL_INFINITY_S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Allview X4 Soul Infinity SV */
    val X4_SOUL_INFINITY_SV = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Allview X4 Soul Infinity Z */
    val X4_SOUL_INFINITY_Z = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Allview X4 Soul Lite */
    val X4_SOUL_LITE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Allview X4 Soul Mini */
    val X4_SOUL_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Allview X4 Soul Style */
    val X4_SOUL_STYLE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Allview X4 Soul Xtreme */
    val X4_SOUL_XTREME = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Allview X5_Soul */
    val X5_SOUL = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Allview X5 Soul Mini */
    val X5_SOUL_MINI = "spec:width=720,height=1498,unit=px,dpi=320"

    /** Allview X5 Soul Pro */
    val X5_SOUL_PRO = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Allview X5_Soul_Style */
    val X5_SOUL_STYLE = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Allview X6 Soul mini */
    val X6_SOUL_MINI = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Allview X6 Soul Xtreme */
    val X6_SOUL_XTREME = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Allview X7_Soul_Pro_EEA */
    val X7_SOUL_PRO_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Allview X7 Soul Style */
    val X7_SOUL_STYLE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Allview X8 PRO */
    val X8_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Allview X8 Soul Style */
    val X8_SOUL_STYLE = "spec:width=720,height=1640,unit=px,dpi=320"

}
