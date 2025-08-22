package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Motorola device specifications for Android Compose previews.
 *
 * This extension provides Motorola device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Motorola.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Motorola get() = object {
    /** Motorola Droid MAXX */
    val DROID_MAXX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Droid Mini */
    val DROID_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Droid RAZR */
    val DROID_RAZR = "spec:width=540,height=960,unit=px,dpi=240"

    /** Motorola DROID RAZR HD */
    val DROID_RAZR_HD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola DROID RAZR i */
    val DROID_RAZR_I = "spec:width=540,height=960,unit=px,dpi=240"

    /** Motorola DROID RAZR M */
    val DROID_RAZR_M = "spec:width=540,height=960,unit=px,dpi=240"

    /** Motorola Droid Turbo */
    val DROID_TURBO = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Motorola Droid Ultra */
    val DROID_ULTRA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Lenovo K10 */
    val LENOVO_K10 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Motorola Lenovo K12 Pro */
    val LENOVO_K12_PRO = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Motorola Lenovo K13 Note */
    val LENOVO_K13_NOTE = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola Lenovo K14 */
    val LENOVO_K14 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola Lenovo K14 Note */
    val LENOVO_K14_NOTE = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Motorola Lenovo K14 Plus */
    val LENOVO_K14_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola Lenovo K15 */
    val LENOVO_K15 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola Lenovo XT2081-4 */
    val LENOVO_XT2081_4 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola Moto C */
    val MOTO_C = "spec:width=480,height=854,unit=px,dpi=240"

    /** Motorola Moto C Plus */
    val MOTO_C_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola moto e13 */
    val MOTO_E13 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola Moto E (1st Gen) */
    val MOTO_E_1ST_GEN = "spec:width=540,height=960,unit=px,dpi=240"

    /** Motorola moto e20 */
    val MOTO_E20 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto e22 */
    val MOTO_E22 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto e22i */
    val MOTO_E22I = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola Moto E (2nd Gen) */
    val MOTO_E_2ND_GEN = "spec:width=540,height=960,unit=px,dpi=240"

    /** Motorola moto e30 */
    val MOTO_E30 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto e32 */
    val MOTO_E32 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola Moto E (4) */
    val MOTO_E_4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Moto E4 */
    val MOTO_E4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola moto e40 */
    val MOTO_E40 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola Moto E (4) Plus */
    val MOTO_E_4_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Moto E (5) */
    val MOTO_E_5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Motorola moto e5 */
    val MOTO_E5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Motorola moto e(5) cruise */
    val MOTO_E_5_CRUISE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola moto e5 go */
    val MOTO_E5_GO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Moto E (5) Play */
    val MOTO_E_5_PLAY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola moto e5 play */
    val MOTO_E5_PLAY = "spec:width=480,height=960,unit=px,dpi=240"

    /** Motorola moto e(5) plus */
    val MOTO_E_5_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Motorola moto e5 plus */
    val MOTO_E5_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Motorola moto e6 */
    val MOTO_E6 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Motorola moto e(6i) */
    val MOTO_E_6I = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Motorola moto e6 play */
    val MOTO_E6_PLAY = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Motorola moto e6s */
    val MOTO_E6S = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Motorola moto e(7i) power */
    val MOTO_E_7I_POWER = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto e(7) plus */
    val MOTO_E_7_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto e(7) power */
    val MOTO_E_7_POWER = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto edge X30 */
    val MOTO_EDGE_X30 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola Moto E with 4G LTE (2nd Gen) */
    val MOTO_E_WITH_4G_LTE_2ND_GEN = "spec:width=540,height=960,unit=px,dpi=240"

    /** Motorola moto e (XT2052DL) */
    val MOTO_E_XT2052DL = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Motorola moto g04s */
    val MOTO_G04S = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Motorola moto g05 */
    val MOTO_G05 = "spec:width=720,height=1604,unit=px,dpi=280"

    /** Motorola moto g(10) */
    val MOTO_G_10 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g14 */
    val MOTO_G14 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g15 */
    val MOTO_G15 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola Moto G (1st Gen) */
    val MOTO_G_1ST_GEN = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola moto g(20) */
    val MOTO_G_20 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g200 5G */
    val MOTO_G200_5G = "spec:width=1080,height=2460,unit=px,dpi=400"

    /** Motorola moto g - 2025 */
    val MOTO_G_2025 = "spec:width=720,height=1604,unit=px,dpi=280"

    /** Motorola moto g22 */
    val MOTO_G22 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g23 */
    val MOTO_G23 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g24 */
    val MOTO_G24 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Motorola Moto G (2nd Gen) */
    val MOTO_G_2ND_GEN = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola moto g(30) */
    val MOTO_G_30 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g31 */
    val MOTO_G31 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Motorola moto g32 */
    val MOTO_G32 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g34 5G */
    val MOTO_G34_5G = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g35 5G */
    val MOTO_G35_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola Moto G (3rd Gen) */
    val MOTO_G_3RD_GEN = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Moto G(4) */
    val MOTO_G_4 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Motorola moto g41 */
    val MOTO_G41 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Motorola moto g42 */
    val MOTO_G42 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Motorola Moto G (4) Play */
    val MOTO_G_4_PLAY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Moto G4 Play */
    val MOTO_G4_PLAY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Moto G(4) Plus */
    val MOTO_G_4_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Motorola moto g(50) */
    val MOTO_G_50 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g(50) 5G */
    val MOTO_G_50_5G = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g51 5G */
    val MOTO_G51_5G = "spec:width=1080,height=2460,unit=px,dpi=400"

    /** Motorola moto g52 */
    val MOTO_G52 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g52j 5G */
    val MOTO_G52J_5G = "spec:width=1080,height=2460,unit=px,dpi=400"

    /** Motorola moto g53 5G */
    val MOTO_G53_5G = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g55 5G */
    val MOTO_G55_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g56 5G */
    val MOTO_G56_5G = "spec:width=1080,height=2400,unit=px,dpi=390"

    /** Motorola moto g 5G */
    val MOTO_G_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g 5G (2022) */
    val MOTO_G_5G_2022 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g 5G - 2023 */
    val MOTO_G_5G_2023 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g 5G - 2024 */
    val MOTO_G_5G_2024 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Motorola moto g 5G plus */
    val MOTO_G_5G_PLUS = "spec:width=1080,height=2520,unit=px,dpi=420"

    /** Motorola Moto G (5) Plus */
    val MOTO_G_5_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Motorola Moto G (5S) */
    val MOTO_G_5S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Motorola Moto G (5S) Plus */
    val MOTO_G_5S_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Motorola Moto G (5th Gen) */
    val MOTO_G_5TH_GEN = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Motorola moto g(6) */
    val MOTO_G_6 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Motorola moto g(60) */
    val MOTO_G_60 = "spec:width=1080,height=2460,unit=px,dpi=400"

    /** Motorola moto g(60)s */
    val MOTO_G_60_S = "spec:width=1080,height=2460,unit=px,dpi=400"

    /** Motorola moto g62 5G */
    val MOTO_G62_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g64y 5G */
    val MOTO_G64Y_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g(6) play */
    val MOTO_G_6_PLAY = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Motorola moto g(6) plus */
    val MOTO_G_6_PLUS = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Motorola moto g(7) */
    val MOTO_G_7 = "spec:width=1080,height=2270,unit=px,dpi=480"

    /** Motorola moto g71 5G */
    val MOTO_G71_5G = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Motorola moto g72 */
    val MOTO_G72 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g73 5G */
    val MOTO_G73_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g75 5G */
    val MOTO_G75_5G = "spec:width=1080,height=2388,unit=px,dpi=400"

    /** Motorola moto g(7) play */
    val MOTO_G_7_PLAY = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Motorola moto g(7) plus */
    val MOTO_G_7_PLUS = "spec:width=1080,height=2270,unit=px,dpi=480"

    /** Motorola moto g(7) power */
    val MOTO_G_7_POWER = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Motorola moto g82 5G */
    val MOTO_G82_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g84 5G */
    val MOTO_G84_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g85 5G */
    val MOTO_G85_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g86 power 5G */
    val MOTO_G86_POWER_5G = "spec:width=1220,height=2712,unit=px,dpi=450"

    /** Motorola moto g(8) play */
    val MOTO_G_8_PLAY = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Motorola moto g(8) plus */
    val MOTO_G_8_PLUS = "spec:width=1080,height=2280,unit=px,dpi=420"

    /** Motorola moto g(8) power */
    val MOTO_G_8_POWER = "spec:width=1080,height=2300,unit=px,dpi=420"

    /** Motorola moto g(8) power lite */
    val MOTO_G_8_POWER_LITE = "spec:width=720,height=1600,unit=px,dpi=260"

    /** Motorola moto g(9) play */
    val MOTO_G_9_PLAY = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g(9) plus */
    val MOTO_G_9_PLUS = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g(9) power */
    val MOTO_G_9_POWER = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Motorola moto g fast */
    val MOTO_G_FAST = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Motorola moto g play (2021) */
    val MOTO_G_PLAY_2021 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g play - 2024 */
    val MOTO_G_PLAY_2024 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola Moto G Plus (5th Gen) */
    val MOTO_G_PLUS_5TH_GEN = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Motorola moto g power */
    val MOTO_G_POWER = "spec:width=1080,height=2300,unit=px,dpi=420"

    /** Motorola moto g power (2021) */
    val MOTO_G_POWER_2021 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g power (2022) */
    val MOTO_G_POWER_2022 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g power - 2025 */
    val MOTO_G_POWER_2025 = "spec:width=1080,height=2388,unit=px,dpi=390"

    /** Motorola moto g power 5G - 2023 */
    val MOTO_G_POWER_5G_2023 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g power 5G - 2024 */
    val MOTO_G_POWER_5G_2024 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g pro */
    val MOTO_G_PRO = "spec:width=1080,height=2300,unit=px,dpi=420"

    /** Motorola moto g pure */
    val MOTO_G_PURE = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g stylus */
    val MOTO_G_STYLUS = "spec:width=1080,height=2300,unit=px,dpi=420"

    /** Motorola moto g stylus (2021) */
    val MOTO_G_STYLUS_2021 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g stylus (2022) */
    val MOTO_G_STYLUS_2022 = "spec:width=1080,height=2460,unit=px,dpi=400"

    /** Motorola moto g stylus (2023) */
    val MOTO_G_STYLUS_2023 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola moto g stylus 5G */
    val MOTO_G_STYLUS_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g stylus 5G (2022) */
    val MOTO_G_STYLUS_5G_2022 = "spec:width=1080,height=2460,unit=px,dpi=400"

    /** Motorola moto g stylus 5G - 2023 */
    val MOTO_G_STYLUS_5G_2023 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g stylus 5G - 2024 */
    val MOTO_G_STYLUS_5G_2024 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola moto g stylus 5G - 2025 */
    val MOTO_G_STYLUS_5G_2025 = "spec:width=1220,height=2712,unit=px,dpi=450"

    /** Motorola Moto G Turbo Edition */
    val MOTO_G_TURBO_EDITION = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Moto G with 4G LTE (1st Gen) */
    val MOTO_G_WITH_4G_LTE_1ST_GEN = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Moto G with 4G LTE (2nd Gen) */
    val MOTO_G_WITH_4G_LTE_2ND_GEN = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Moto MAXX */
    val MOTO_MAXX = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Motorola moto p30 */
    val MOTO_P30 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Motorola moto p30 play */
    val MOTO_P30_PLAY = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Motorola moto razr 50 */
    val MOTO_RAZR_50 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Motorola Motorola Defy */
    val MOTOROLA_DEFY = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola motorola edge */
    val MOTOROLA_EDGE = "spec:width=1080,height=2340,unit=px,dpi=440"

    /** Motorola motorola edge 20 */
    val MOTOROLA_EDGE_20 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge (2021) */
    val MOTOROLA_EDGE_2021 = "spec:width=1080,height=2460,unit=px,dpi=400"

    /** Motorola motorola edge (2022) */
    val MOTOROLA_EDGE_2022 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge 2023 */
    val MOTOROLA_EDGE_2023 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge 2024 */
    val MOTOROLA_EDGE_2024 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge 2025 */
    val MOTOROLA_EDGE_2025 = "spec:width=1220,height=2712,unit=px,dpi=450"

    /** Motorola motorola edge 20 lite */
    val MOTOROLA_EDGE_20_LITE = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge 30 */
    val MOTOROLA_EDGE_30 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge 30 fusion */
    val MOTOROLA_EDGE_30_FUSION = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge 30 neo */
    val MOTOROLA_EDGE_30_NEO = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Motorola motorola edge 30 ultra */
    val MOTOROLA_EDGE_30_ULTRA = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge 40 */
    val MOTOROLA_EDGE_40 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge 40 neo */
    val MOTOROLA_EDGE_40_NEO = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge 50 */
    val MOTOROLA_EDGE_50 = "spec:width=1220,height=2712,unit=px,dpi=450"

    /** Motorola motorola edge 50 fusion */
    val MOTOROLA_EDGE_50_FUSION = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge 50 pro */
    val MOTOROLA_EDGE_50_PRO = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Motorola motorola edge 50 ultra */
    val MOTOROLA_EDGE_50_ULTRA = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Motorola motorola edge 60 fusion */
    val MOTOROLA_EDGE_60_FUSION = "spec:width=1220,height=2712,unit=px,dpi=450"

    /** Motorola motorola edge 60 pro */
    val MOTOROLA_EDGE_60_PRO = "spec:width=1220,height=2712,unit=px,dpi=450"

    /** Motorola motorola edge 60 stylus */
    val MOTOROLA_EDGE_60_STYLUS = "spec:width=1220,height=2712,unit=px,dpi=450"

    /** Motorola motorola edge plus */
    val MOTOROLA_EDGE_PLUS = "spec:width=1080,height=2340,unit=px,dpi=440"

    /** Motorola motorola edge plus (2022) */
    val MOTOROLA_EDGE_PLUS_2022 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge plus 2023 */
    val MOTOROLA_EDGE_PLUS_2023 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola edge s */
    val MOTOROLA_EDGE_S = "spec:width=1080,height=2520,unit=px,dpi=420"

    /** Motorola motorola edge s pro */
    val MOTOROLA_EDGE_S_PRO = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola Motorola one */
    val MOTOROLA_ONE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Motorola motorola one 5G UW ace */
    val MOTOROLA_ONE_5G_UW_ACE = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola one action */
    val MOTOROLA_ONE_ACTION = "spec:width=1080,height=2520,unit=px,dpi=480"

    /** Motorola motorola one fusion+ */
    val MOTOROLA_ONE_FUSION = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Motorola motorola one fusion */
    val MOTOROLA_ONE_FUSION_720X1600 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Motorola motorola one hyper */
    val MOTOROLA_ONE_HYPER = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Motorola motorola one power */
    val MOTOROLA_ONE_POWER = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Motorola motorola one vision */
    val MOTOROLA_ONE_VISION = "spec:width=1080,height=2520,unit=px,dpi=480"

    /** Motorola motorola one zoom */
    val MOTOROLA_ONE_ZOOM = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Motorola motorola razr */
    val MOTOROLA_RAZR = "spec:width=876,height=2142,unit=px,dpi=360"

    /** Motorola motorola razr 2022 */
    val MOTOROLA_RAZR_2022 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola motorola razr 40 */
    val MOTOROLA_RAZR_40 = "spec:width=1080,height=2640,unit=px,dpi=420"

    /** Motorola motorola razr 40 ultra */
    val MOTOROLA_RAZR_40_ULTRA = "spec:width=1080,height=2640,unit=px,dpi=420"

    /** Motorola motorola razr 50d M-51E */
    val MOTOROLA_RAZR_50D_M_51E = "spec:width=1080,height=2640,unit=px,dpi=420"

    /** Motorola motorola razr 5G */
    val MOTOROLA_RAZR_5G = "spec:width=876,height=2142,unit=px,dpi=360"

    /** Motorola motorola razr 60 */
    val MOTOROLA_RAZR_60 = "spec:width=1080,height=2640,unit=px,dpi=420"

    /** Motorola motorola razr 60 ultra */
    val MOTOROLA_RAZR_60_ULTRA = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Motorola moto tab g20 */
    val MOTO_TAB_G20 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Motorola Moto Tab g70 */
    val MOTO_TAB_G70 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Motorola Moto X (1st Gen) */
    val MOTO_X_1ST_GEN = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorola Moto X (2nd Gen) */
    val MOTO_X_2ND_GEN = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Motorola moto X30 屏下摄像版 */
    val MOTO_X30 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola Moto X (4) */
    val MOTO_X_4 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Motorola Moto X Force */
    val MOTO_X_FORCE = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Motorola Moto X Play */
    val MOTO_X_PLAY = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Motorola Moto X Pure Edition */
    val MOTO_X_PURE_EDITION = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Motorola Moto X Style */
    val MOTO_X_STYLE = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Motorola Moto Z (2) Force */
    val MOTO_Z_2_FORCE = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Motorola Moto Z (2) Play */
    val MOTO_Z_2_PLAY = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Motorola Moto Z(3) */
    val MOTO_Z_3 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Motorola moto z3 play */
    val MOTO_Z3_PLAY = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Motorola moto z4 */
    val MOTO_Z4 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Motorola Moto Z Droid */
    val MOTO_Z_DROID = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Motorola Moto Z Play Droid */
    val MOTO_Z_PLAY_DROID = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Motorola Nexus 6 */
    val NEXUS_6 = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Motorola RAZR D1 */
    val RAZR_D1 = "spec:width=320,height=480,unit=px,dpi=160"

    /** Motorola RAZR D3 */
    val RAZR_D3 = "spec:width=480,height=788,unit=px,dpi=240"

    /** Motorola ThinkPhone 25 by motorola */
    val THINKPHONE_25_BY_MOTOROLA = "spec:width=1200,height=2670,unit=px,dpi=450"

    /** Motorola ThinkPhone by Motorola */
    val THINKPHONE_BY_MOTOROLA = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Motorola XOOM */
    val XOOM = "spec:width=752,height=1280,unit=px,dpi=160"

}
