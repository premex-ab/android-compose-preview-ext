package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Logicom device specifications for Android Compose previews.
 *
 * This extension provides Logicom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Logicom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Logicom get() = object {
    /** Logicom AERO */
    val AERO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Logicom COMET */
    val COMET = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Logicom CT1080 */
    val CT1080 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom Elio */
    val ELIO = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Logicom EZY 2 */
    val EZY_2 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Logicom EZY_EEA */
    val EZY_EEA = "spec:width=480,height=854,unit=px,dpi=200"

    /** Logicom FIVE */
    val FIVE = "spec:width=480,height=854,unit=px,dpi=200"

    /** Logicom Five Pro */
    val FIVE_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Logicom Five Pro 32 */
    val FIVE_PRO_32 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Logicom FLOW */
    val FLOW = "spec:width=480,height=1016,unit=px,dpi=200"

    /** Logicom IDbot53plus */
    val IDBOT53PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Logicom ID bot 553 */
    val ID_BOT_553 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Logicom L65T */
    val L65T = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Logicom La Tab 105 */
    val LA_TAB_105 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_Tab_105_P */
    val LA_TAB_105_P = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_Tab_105_P_Rev2_EEA */
    val LA_TAB_105_P_REV2_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La Tab 106 */
    val LA_TAB_106 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La Tab 109 HD */
    val LA_TAB_109_HD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Logicom La_Tab_114 */
    val LA_TAB_114 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_Tab_114_Rev2 */
    val LA_TAB_114_REV2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_Tab_115 */
    val LA_TAB_115 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La tab 124 */
    val LA_TAB_124 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Logicom La_Tab_124_HD_Plus_EEA */
    val LA_TAB_124_HD_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Logicom La_Tab_126 */
    val LA_TAB_126 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_Tab_128 */
    val LA_TAB_128 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_Tab_292 */
    val LA_TAB_292 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La Tab 72 */
    val LA_TAB_72 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_Tab_74 */
    val LA_TAB_74 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_Tab_74_Rev2 */
    val LA_TAB_74_REV2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_Tab_74_Rev2_AF */
    val LA_TAB_74_REV2_AF = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_Tab_75 */
    val LA_TAB_75 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La Tab 90 */
    val LA_TAB_90 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_Tab_Link_101 */
    val LA_TAB_LINK_101 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Logicom La_Tab_Link_71_P */
    val LA_TAB_LINK_71_P = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_Tab_Link_73 */
    val LA_TAB_LINK_73 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom La_tab_link_74 */
    val LA_TAB_LINK_74 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Logicom La_Tab_Stand */
    val LA_TAB_STAND = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Logicom Le Connect */
    val LE_CONNECT = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Logicom Le Fit */
    val LE_FIT = "spec:width=480,height=854,unit=px,dpi=240"

    /** Logicom Le Fit FR */
    val LE_FIT_FR = "spec:width=480,height=854,unit=px,dpi=240"

    /** Logicom Le Fizz */
    val LE_FIZZ = "spec:width=480,height=800,unit=px,dpi=240"

    /** Logicom Le HELLO */
    val LE_HELLO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Logicom Le Hola */
    val LE_HOLA = "spec:width=480,height=960,unit=px,dpi=240"

    /** Logicom Le Hola FR */
    val LE_HOLA_FR = "spec:width=480,height=960,unit=px,dpi=240"

    /** Logicom Le Hop */
    val LE_HOP = "spec:width=480,height=996,unit=px,dpi=240"

    /** Logicom Le Lift */
    val LE_LIFT = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Logicom Le Link */
    val LE_LINK = "spec:width=480,height=854,unit=px,dpi=220"

    /** Logicom L-EMENT 403 */
    val L_EMENT_403 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Logicom L-EMENT 505 */
    val L_EMENT_505 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Logicom L-EMENT551 */
    val L_EMENT551 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Logicom L-EMENT 553 */
    val L_EMENT_553 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Logicom L-EMENT_TAB1040_BT */
    val L_EMENT_TAB1040_BT = "spec:width=600,height=1024,unit=px,dpi=120"

    /** Logicom LEMENTTAB1042 */
    val LEMENTTAB1042 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom L-EMENT_TAB1043 */
    val L_EMENT_TAB1043 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom le Moov */
    val LE_MOOV = "spec:width=480,height=960,unit=px,dpi=240"

    /** Logicom LeMoov2 */
    val LEMOOV2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Logicom Le Must */
    val LE_MUST = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Logicom Le Must 2 */
    val LE_MUST_2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Logicom Le Omega */
    val LE_OMEGA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Logicom Le Prime */
    val LE_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Logicom Le_Pulse  */
    val LE_PULSE = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Logicom Le Smooth */
    val LE_SMOOTH = "spec:width=480,height=800,unit=px,dpi=240"

    /** Logicom Le_Spark */
    val LE_SPARK = "spec:width=600,height=1280,unit=px,dpi=280"

    /** Logicom Le Swipe */
    val LE_SWIPE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Logicom Le UP */
    val LE_UP = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Logicom Le Wave */
    val LE_WAVE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Logicom Logicom La Tab 127 HD */
    val LOGICOM_LA_TAB_127_HD = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Logicom Logikids_10 */
    val LOGIKIDS_10 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom LOGIKIDS11 */
    val LOGIKIDS11 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Logicom LOGIKIDS_11P */
    val LOGIKIDS_11P = "spec:width=800,height=1280,unit=px,dpi=245"

    /** Logicom LOGIKIDS_5 */
    val LOGIKIDS_5 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom LOGIKIDS5 */
    val LOGIKIDS5 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom LOGIKIDS_5_Rev2 */
    val LOGIKIDS_5_REV2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom LOGIKIDS7 */
    val LOGIKIDS7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom Luma */
    val LUMA = "spec:width=720,height=1640,unit=px,dpi=240"

    /** Logicom LUNAR */
    val LUNAR = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Logicom Lunar Pro */
    val LUNAR_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Logicom LYRA PLUS */
    val LYRA_PLUS = "spec:width=540,height=1092,unit=px,dpi=240"

    /** Logicom M bot tab 10 */
    val M_BOT_TAB_10 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom M bot Tab 103 */
    val M_BOT_TAB_103 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom M bot Tab 1150 */
    val M_BOT_TAB_1150 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom ONIX */
    val ONIX = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Logicom RIOPAD_7 */
    val RIOPAD_7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom SENSE */
    val SENSE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Logicom SMART PRO */
    val SMART_PRO = "spec:width=720,height=1600,unit=px,dpi=220"

    /** Logicom SOLAR */
    val SOLAR = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Logicom Solar Pro */
    val SOLAR_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Logicom TAB134 */
    val TAB134 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Logicom TAB76 */
    val TAB76 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Logicom Tab_80 */
    val TAB_80 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Logicom TABLINK104 */
    val TABLINK104 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Logicom Tab_Stand_Pro */
    val TAB_STAND_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Logicom TAB_STAND_PRO_2 */
    val TAB_STAND_PRO_2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Logicom TABXL_14 */
    val TABXL_14 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Logicom TAB_XXL_14 */
    val TAB_XXL_14 = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Logicom  Wave 2 */
    val WAVE_2 = "spec:width=480,height=800,unit=px,dpi=180"

    /** Logicom  WAVE  2s */
    val WAVE_2S = "spec:width=480,height=800,unit=px,dpi=180"

    /** Logicom Yuno */
    val YUNO = "spec:width=720,height=1600,unit=px,dpi=280"

}
