package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sony device specifications for Android Compose previews.
 *
 * This extension provides Sony device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sony.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sony get() = object {
    /** Sony NW-A300Series */
    val NW_A300SERIES = "spec:width=720,height=1280,unit=px,dpi=400"

    /** Sony  NW-F880 Series */
    val NW_F880_SERIES = "spec:width=480,height=782,unit=px,dpi=240"

    /** Sony NW-WM1ZM2 */
    val NW_WM1ZM2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony NW-ZX2 */
    val NW_ZX2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Sony NW-ZX700Series */
    val NW_ZX700SERIES = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony NWZ-ZX1 */
    val NWZ_ZX1 = "spec:width=480,height=782,unit=px,dpi=240"

    /** Sony PDT-FP1 */
    val PDT_FP1 = "spec:width=1080,height=2520,unit=px,dpi=450"

    /** Sony Smartphone Z Ultra Google Play edition */
    val SMARTPHONE_Z_ULTRA_GOOGLE_PLAY_EDITION = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia 1 */
    val XPERIA_1 = "spec:width=1096,height=2560,unit=px,dpi=420"

    /** Sony Xperia 10 */
    val XPERIA_10 = "spec:width=1080,height=2520,unit=px,dpi=480"

    /** Sony Xperia 10 II */
    val XPERIA_10_II = "spec:width=1080,height=2520,unit=px,dpi=420"

    /** Sony Xperia 10 III */
    val XPERIA_10_III = "spec:width=1080,height=2520,unit=px,dpi=420"

    /** Sony Xperia 10 III Lite */
    val XPERIA_10_III_LITE = "spec:width=1080,height=2520,unit=px,dpi=420"

    /** Sony Xperia 10 IV */
    val XPERIA_10_IV = "spec:width=1080,height=2520,unit=px,dpi=420"

    /** Sony Xperia 10 Plus */
    val XPERIA_10_PLUS = "spec:width=1080,height=2520,unit=px,dpi=420"

    /** Sony Xperia 10 V */
    val XPERIA_10_V = "spec:width=1080,height=2520,unit=px,dpi=450"

    /** Sony Xperia 10 VI */
    val XPERIA_10_VI = "spec:width=1080,height=2520,unit=px,dpi=450"

    /** Sony Xperia 1 II */
    val XPERIA_1_II = "spec:width=1096,height=2560,unit=px,dpi=420"

    /** Sony Xperia 1 III */
    val XPERIA_1_III = "spec:width=1096,height=2560,unit=px,dpi=420"

    /** Sony Xperia 1 IV */
    val XPERIA_1_IV = "spec:width=1096,height=2560,unit=px,dpi=420"

    /** Sony Xperia 1 Professional Edition */
    val XPERIA_1_PROFESSIONAL_EDITION = "spec:width=1096,height=2560,unit=px,dpi=420"

    /** Sony Xperia 1 V */
    val XPERIA_1_V = "spec:width=1096,height=2560,unit=px,dpi=420"

    /** Sony Xperia 1 VI */
    val XPERIA_1_VI = "spec:width=1080,height=2340,unit=px,dpi=400"

    /** Sony Xperia 1 VII */
    val XPERIA_1_VII = "spec:width=1080,height=2340,unit=px,dpi=400"

    /** Sony Xperia 5 */
    val XPERIA_5 = "spec:width=1080,height=2520,unit=px,dpi=420"

    /** Sony Xperia 5 II */
    val XPERIA_5_II = "spec:width=1080,height=2520,unit=px,dpi=420"

    /** Sony Xperia 5 III */
    val XPERIA_5_III = "spec:width=1080,height=2520,unit=px,dpi=420"

    /** Sony Xperia 5 IV */
    val XPERIA_5_IV = "spec:width=1080,height=2520,unit=px,dpi=450"

    /** Sony Xperia 5 V */
    val XPERIA_5_V = "spec:width=1080,height=2520,unit=px,dpi=450"

    /** Sony Xperia 8 */
    val XPERIA_8 = "spec:width=1080,height=2520,unit=px,dpi=420"

    /** Sony Xperia 8 Lite */
    val XPERIA_8_LITE = "spec:width=1080,height=2520,unit=px,dpi=420"

    /** Sony Xperia A */
    val XPERIA_A = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia A2 */
    val XPERIA_A2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia A4 */
    val XPERIA_A4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia Ace */
    val XPERIA_ACE = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Sony Xperia Ace II */
    val XPERIA_ACE_II = "spec:width=720,height=1496,unit=px,dpi=300"

    /** Sony Xperia Ace III */
    val XPERIA_ACE_III = "spec:width=720,height=1496,unit=px,dpi=300"

    /** Sony Xperia acro S */
    val XPERIA_ACRO_S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia C */
    val XPERIA_C = "spec:width=540,height=960,unit=px,dpi=240"

    /** Sony Xperia C3 */
    val XPERIA_C3 = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Sony Xperia C3 Dual */
    val XPERIA_C3_DUAL = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Sony Xperia™ C4 */
    val XPERIA_C4 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia™ C4 Dual */
    val XPERIA_C4_DUAL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia C5 Ultra */
    val XPERIA_C5_ULTRA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia C5 Ultra Dual */
    val XPERIA_C5_ULTRA_DUAL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia E */
    val XPERIA_E = "spec:width=320,height=480,unit=px,dpi=160"

    /** Sony Xperia E1 */
    val XPERIA_E1 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Sony Xperia  E1 dual */
    val XPERIA_E1_DUAL = "spec:width=480,height=800,unit=px,dpi=240"

    /** Sony Xperia E3 */
    val XPERIA_E3 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Sony Xperia E3 Dual */
    val XPERIA_E3_DUAL = "spec:width=480,height=854,unit=px,dpi=240"

    /** Sony Xperia™ E4 */
    val XPERIA_E4 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Sony Xperia™ E4 Dual */
    val XPERIA_E4_DUAL = "spec:width=540,height=960,unit=px,dpi=240"

    /** Sony Xperia E4g */
    val XPERIA_E4G = "spec:width=540,height=960,unit=px,dpi=240"

    /** Sony Xperia E4g Dual */
    val XPERIA_E4G_DUAL = "spec:width=540,height=960,unit=px,dpi=240"

    /** Sony Xperia E5 */
    val XPERIA_E5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia E dual */
    val XPERIA_E_DUAL = "spec:width=320,height=480,unit=px,dpi=160"

    /** Sony Xperia Go */
    val XPERIA_GO = "spec:width=320,height=480,unit=px,dpi=160"

    /** Sony Xperia ion */
    val XPERIA_ION = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia J */
    val XPERIA_J = "spec:width=480,height=854,unit=px,dpi=240"

    /** Sony Xperia J1 Compact */
    val XPERIA_J1_COMPACT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia L */
    val XPERIA_L = "spec:width=480,height=854,unit=px,dpi=240"

    /** Sony Xperia L1 */
    val XPERIA_L1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia L2 */
    val XPERIA_L2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia L3 */
    val XPERIA_L3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sony Xperia L4 */
    val XPERIA_L4 = "spec:width=720,height=1680,unit=px,dpi=300"

    /** Sony Xperia M */
    val XPERIA_M = "spec:width=480,height=854,unit=px,dpi=240"

    /** Sony Xperia M2 */
    val XPERIA_M2 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Sony Xperia M2 Aqua */
    val XPERIA_M2_AQUA = "spec:width=540,height=960,unit=px,dpi=240"

    /** Sony Xperia M2 Dual */
    val XPERIA_M2_DUAL = "spec:width=540,height=960,unit=px,dpi=240"

    /** Sony Xperia™ M4 Aqua */
    val XPERIA_M4_AQUA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia™ M4 Aqua Dual */
    val XPERIA_M4_AQUA_DUAL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia M5 */
    val XPERIA_M5 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia M5 Dual */
    val XPERIA_M5_DUAL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia M dual */
    val XPERIA_M_DUAL = "spec:width=480,height=854,unit=px,dpi=240"

    /** Sony Xperia P */
    val XPERIA_P = "spec:width=540,height=960,unit=px,dpi=240"

    /** Sony Xperia PRO */
    val XPERIA_PRO = "spec:width=1096,height=2560,unit=px,dpi=420"

    /** Sony Xperia PRO-I */
    val XPERIA_PRO_I = "spec:width=1096,height=2560,unit=px,dpi=420"

    /** Sony Xperia R1 */
    val XPERIA_R1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia R1 Plus */
    val XPERIA_R1_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia S */
    val XPERIA_S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia SL */
    val XPERIA_SL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia SP */
    val XPERIA_SP = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia T */
    val XPERIA_T = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia T2 Ultra */
    val XPERIA_T2_ULTRA = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Sony Xperia T2 Ultra dual */
    val XPERIA_T2_ULTRA_DUAL = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Sony Xperia T3 */
    val XPERIA_T3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia Tablet S */
    val XPERIA_TABLET_S = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Sony Xperia Tablet Z */
    val XPERIA_TABLET_Z = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Sony Xperia Touch */
    val XPERIA_TOUCH = "spec:width=768,height=1366,unit=px,dpi=160"

    /** Sony Xperia TX */
    val XPERIA_TX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia V */
    val XPERIA_V = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia X */
    val XPERIA_X = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia XA */
    val XPERIA_XA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia XA1 */
    val XPERIA_XA1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia XA1 Plus */
    val XPERIA_XA1_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia XA1 Ultra */
    val XPERIA_XA1_ULTRA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia XA2 */
    val XPERIA_XA2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia XA2 Plus */
    val XPERIA_XA2_PLUS = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Sony Xperia XA2 Ultra */
    val XPERIA_XA2_ULTRA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia XA Ultra */
    val XPERIA_XA_ULTRA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia X Compact */
    val XPERIA_X_COMPACT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia X Performance */
    val XPERIA_X_PERFORMANCE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia XZ */
    val XPERIA_XZ = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia XZ1 */
    val XPERIA_XZ1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia XZ1 Compact */
    val XPERIA_XZ1_COMPACT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia XZ2 */
    val XPERIA_XZ2 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Sony Xperia XZ2 Compact */
    val XPERIA_XZ2_COMPACT = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Sony Xperia XZ2 Premium */
    val XPERIA_XZ2_PREMIUM = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Sony Xperia XZ3 */
    val XPERIA_XZ3 = "spec:width=1440,height=2880,unit=px,dpi=560"

    /** Sony Xperia XZ Premium */
    val XPERIA_XZ_PREMIUM = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia XZs */
    val XPERIA_XZS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia Z */
    val XPERIA_Z = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia Z1 */
    val XPERIA_Z1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia Z1 Compact */
    val XPERIA_Z1_COMPACT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia Z1f */
    val XPERIA_Z1F = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia Z2 */
    val XPERIA_Z2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia Z2a */
    val XPERIA_Z2A = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia Z2 Tablet */
    val XPERIA_Z2_TABLET = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Sony Xperia Z3 */
    val XPERIA_Z3 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia Z3 Compact */
    val XPERIA_Z3_COMPACT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia Z3 Dual */
    val XPERIA_Z3_DUAL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia Z3 Tablet Compact */
    val XPERIA_Z3_TABLET_COMPACT = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Sony Xperia Z3v */
    val XPERIA_Z3V = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia Z4 */
    val XPERIA_Z4 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia Z4 Tablet */
    val XPERIA_Z4_TABLET = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Sony Xperia Z5 */
    val XPERIA_Z5 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia Z5 Compact */
    val XPERIA_Z5_COMPACT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia Z5 dual */
    val XPERIA_Z5_DUAL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia Z5 Premium */
    val XPERIA_Z5_PREMIUM = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia Z5 Premium Dual */
    val XPERIA_Z5_PREMIUM_DUAL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia ZL */
    val XPERIA_ZL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia ZL2 */
    val XPERIA_ZL2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sony Xperia ZR */
    val XPERIA_ZR = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sony Xperia Z Ultra */
    val XPERIA_Z_ULTRA = "spec:width=1080,height=1920,unit=px,dpi=320"

    /** Sony Xperia Z Ultra */
    val XPERIA_Z_ULTRA_1080X1920 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
