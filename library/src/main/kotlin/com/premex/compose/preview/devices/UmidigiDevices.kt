package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Umidigi device specifications for Android Compose previews.
 *
 * This extension provides Umidigi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Umidigi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Umidigi get() = object {
    /** Umidigi A11 EEA */
    val A11_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi A11 Pro Max */
    val A11_PRO_MAX = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Umidigi A11S EEA */
    val A11S_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi A11_Tab */
    val A11_TAB = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Umidigi A11_Tab-EEA */
    val A11_TAB_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Umidigi A13 */
    val A13 = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Umidigi A13 Pro 5G EEA */
    val A13_PRO_5G_EEA = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Umidigi A13 Pro EEA */
    val A13_PRO_EEA = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Umidigi A13 Pro Max 5G EEA */
    val A13_PRO_MAX_5G_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Umidigi A13S */
    val A13S = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Umidigi A13_Tab */
    val A13_TAB = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Umidigi A13_Tab_EEA */
    val A13_TAB_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Umidigi A15T */
    val A15T = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Umidigi A15_Tab */
    val A15_TAB = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Umidigi A15_Tab_EEA */
    val A15_TAB_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Umidigi A3 */
    val A3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Umidigi A3_Pro */
    val A3_PRO = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Umidigi A3S_EEA */
    val A3S_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Umidigi A3X */
    val A3X = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Umidigi A5 Pro */
    val A5_PRO = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Umidigi A7 */
    val A7 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Umidigi A7 Pro */
    val A7_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi A7S */
    val A7S = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi A9 */
    val A9 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi A9 Pro 128G EEA */
    val A9_PRO_128G_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi A9 Pro_EEA */
    val A9_PRO_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi A9 Pro R EEA */
    val A9_PRO_R_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi AblePad_Pro */
    val ABLEPAD_PRO = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Umidigi Active T1 EEA */
    val ACTIVE_T1_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Umidigi BISON */
    val BISON = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi BISON 2 EEA */
    val BISON_2_EEA = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Umidigi BISON_GT2 */
    val BISON_GT2 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Umidigi BISON_GT2_5G */
    val BISON_GT2_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Umidigi BISON GT EEA */
    val BISON_GT_EEA = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Umidigi BISON_Pro_RU */
    val BISON_PRO_RU = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi BISON R EEA */
    val BISON_R_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi BISON X10G EEA */
    val BISON_X10G_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi BISON X10G NFC EEA */
    val BISON_X10G_NFC_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi BISON_X10_Pro_RU */
    val BISON_X10_PRO_RU = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi BISON X10S EEA */
    val BISON_X10S_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi BISON X10S NFC */
    val BISON_X10S_NFC = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi BISON_X10_TR */
    val BISON_X10_TR = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi BISON X20 EEA */
    val BISON_X20_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi C1 Max EEA */
    val C1_MAX_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi C1 Plus EEA */
    val C1_PLUS_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi F1_EEA */
    val F1_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi F2 */
    val F2 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi F3_5G */
    val F3_5G = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Umidigi F3 EEA */
    val F3_EEA = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Umidigi F3_Pro_5G */
    val F3_PRO_5G = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Umidigi F3S EEA */
    val F3S_EEA = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Umidigi G1 Max RU */
    val G1_MAX_RU = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi G1 Plus EEA */
    val G1_PLUS_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi G1_Tab */
    val G1_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G1_Tab_EEA */
    val G1_TAB_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G1_Tab_Kids */
    val G1_TAB_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G1_Tab_Kids_EEA */
    val G1_TAB_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G1_Tab_Mini */
    val G1_TAB_MINI = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G1_Tab_Mini_EEA */
    val G1_TAB_MINI_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G1_Tab_Mini_Kids */
    val G1_TAB_MINI_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G1_Tab_Mini_Kids_EEA */
    val G1_TAB_MINI_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G2 EEA */
    val G2_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi G2_Tab */
    val G2_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G2_Tab_EEA */
    val G2_TAB_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G2_Tab_Kids */
    val G2_TAB_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G2_Tab_Kids_EEA */
    val G2_TAB_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G3 EEA */
    val G3_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi G3 Plus EEA */
    val G3_PLUS_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi G3_Tab_Ultra_EEA */
    val G3_TAB_ULTRA_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Umidigi G5 Mecha RU */
    val G5_MECHA_RU = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Umidigi G5_Tab */
    val G5_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G5_Tab_EEA */
    val G5_TAB_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G5_Tab_Kids */
    val G5_TAB_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G5_Tab_Kids_EEA */
    val G5_TAB_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi G7_Tab_Mini */
    val G7_TAB_MINI = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Umidigi G7_Tab_Pro */
    val G7_TAB_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Umidigi G9 Tab */
    val G9_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umidigi One */
    val ONE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Umidigi One Max */
    val ONE_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Umidigi One Pro */
    val ONE_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Umidigi Power */
    val POWER = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi Power_3_EEA */
    val POWER_3_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi Power 5 EEA */
    val POWER_5_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi Power 5S RU */
    val POWER_5S_RU = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi Power 7 */
    val POWER_7 = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Umidigi Power 7 Max EEA */
    val POWER_7_MAX_EEA = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Umidigi Power 7S EEA */
    val POWER_7S_EEA = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Umidigi S2PRO */
    val S2PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Umidigi S3_Pro */
    val S3_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi S5 Pro */
    val S5_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Umidigi UMIDIGI A15 */
    val UMIDIGI_A15 = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Umidigi UMIDIGI A15C EEA */
    val UMIDIGI_A15C_EEA = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Umidigi UMIDIGI C1 EEA */
    val UMIDIGI_C1_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi UMIDIGI C2 EEA */
    val UMIDIGI_C2_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi UMIDIGI G100 */
    val UMIDIGI_G100 = "spec:width=720,height=1640,unit=px,dpi=480"

    /** Umidigi UMIDIGI G100A */
    val UMIDIGI_G100A = "spec:width=720,height=1640,unit=px,dpi=480"

    /** Umidigi UMIDIGI G1 EEA */
    val UMIDIGI_G1_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi UMIDIGI G3 Max EEA */
    val UMIDIGI_G3_MAX_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Umidigi UMIDIGI G5A EEA */
    val UMIDIGI_G5A_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi UMIDIGI G5 EEA */
    val UMIDIGI_G5_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Umidigi UMIDIGI G6 5G */
    val UMIDIGI_G6_5G = "spec:width=720,height=1616,unit=px,dpi=320"

    /** Umidigi UMIDIGI G7_EEA */
    val UMIDIGI_G7_EEA = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Umidigi UMIDIGI G9A */
    val UMIDIGI_G9A = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi UMIDIGI G9C */
    val UMIDIGI_G9C = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi UMIDIGI G9T */
    val UMIDIGI_G9T = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Umidigi UMIDIGI G9x */
    val UMIDIGI_G9X = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Umidigi UMIDIGI Note 100 */
    val UMIDIGI_NOTE_100 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Umidigi UMIDIGI Note 100 5G */
    val UMIDIGI_NOTE_100_5G = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Umidigi UMIDIGI Note 100A */
    val UMIDIGI_NOTE_100A = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Umidigi UMIDIGI X */
    val UMIDIGI_X = "spec:width=720,height=1548,unit=px,dpi=320"

    /** Umidigi Z2 */
    val Z2 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Umidigi Z2 Pro */
    val Z2_PRO = "spec:width=1080,height=2246,unit=px,dpi=480"

}
