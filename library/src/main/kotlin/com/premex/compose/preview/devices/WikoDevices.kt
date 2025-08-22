package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wiko device specifications for Android Compose previews.
 *
 * This extension provides Wiko device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wiko.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wiko get() = object {
    /** Wiko C210AE */
    val C210AE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Wiko C800 */
    val C800 = "spec:width=720,height=1528,unit=px,dpi=280"

    /** Wiko FEVER */
    val FEVER = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Wiko FREDDY */
    val FREDDY = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko Gallardo */
    val GALLARDO = "spec:width=480,height=960,unit=px,dpi=213"

    /** Wiko HARRY */
    val HARRY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko Harry2 */
    val HARRY2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Wiko HIGHWAY PURE */
    val HIGHWAY_PURE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko HIGHWAY STAR */
    val HIGHWAY_STAR = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko JERRY */
    val JERRY = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko JERRY2 */
    val JERRY2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko Jerry4 */
    val JERRY4 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Wiko JERRY MAX */
    val JERRY_MAX = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko K300S */
    val K300S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Wiko KENNY */
    val KENNY = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko K-KOOL */
    val K_KOOL = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko LENNY */
    val LENNY = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko LENNY2 */
    val LENNY2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko LENNY3 */
    val LENNY3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko LENNY3 MAX */
    val LENNY3_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko Lenny4 */
    val LENNY4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko Lenny4 Plus */
    val LENNY4_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko M10 Lite */
    val M10_LITE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Wiko P4903JP */
    val P4903JP = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko Power U10 */
    val POWER_U10 = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Wiko Power U20 */
    val POWER_U20 = "spec:width=720,height=1640,unit=px,dpi=260"

    /** Wiko Power U30 */
    val POWER_U30 = "spec:width=720,height=1640,unit=px,dpi=260"

    /** Wiko PULP */
    val PULP = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko PULP 4G */
    val PULP_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko PULP FAB */
    val PULP_FAB = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko PULP FAB 4G */
    val PULP_FAB_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko RAINBOW JAM */
    val RAINBOW_JAM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko RAINBOW LITE */
    val RAINBOW_LITE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko RAINBOW LITE 4G */
    val RAINBOW_LITE_4G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko RAINBOW LITE 4G */
    val RAINBOW_LITE_4G_720X1280 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko RIDGE 4G */
    val RIDGE_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko RIDGE FAB 4G */
    val RIDGE_FAB_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko ROBBY */
    val ROBBY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko ROBBY2 */
    val ROBBY2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko  SUGAR F7 mini */
    val SUGAR_F7_MINI = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Wiko SUGAR S9 */
    val SUGAR_S9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Wiko SUNNY */
    val SUNNY = "spec:width=480,height=800,unit=px,dpi=240"

    /** Wiko SUNNY2 */
    val SUNNY2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Wiko Sunny2 Plus */
    val SUNNY2_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko Sunny3 */
    val SUNNY3 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko Sunny3 Mini */
    val SUNNY3_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Wiko sunny4 Plus */
    val SUNNY4_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Wiko Sunny5 */
    val SUNNY5 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Wiko Sunny5 Lite */
    val SUNNY5_LITE = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Wiko SUNNY MAX */
    val SUNNY_MAX = "spec:width=480,height=800,unit=px,dpi=240"

    /** Wiko SUNSET2 */
    val SUNSET2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Wiko T10 */
    val T10 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Wiko T20 */
    val T20 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Wiko T3 */
    val T3 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Wiko T50 */
    val T50 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Wiko T60 */
    val T60 = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Wiko TOMMY */
    val TOMMY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko TOMMY2 */
    val TOMMY2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko Tommy2 Plus */
    val TOMMY2_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko Tommy3 */
    val TOMMY3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Wiko Tone E19 */
    val TONE_E19 = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Wiko U307AS */
    val U307AS = "spec:width=480,height=960,unit=px,dpi=213"

    /** Wiko U520AS */
    val U520AS = "spec:width=720,height=1440,unit=px,dpi=300"

    /** Wiko U FEEL */
    val U_FEEL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko U FEEL FAB */
    val U_FEEL_FAB = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko U FEEL GO */
    val U_FEEL_GO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko U FEEL LITE */
    val U_FEEL_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko U FEEL PRIME */
    val U_FEEL_PRIME = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Wiko U PULSE */
    val U_PULSE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko U PULSE LITE */
    val U_PULSE_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko View */
    val VIEW = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Wiko View2 Go */
    val VIEW2_GO = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Wiko View2 Plus */
    val VIEW2_PLUS = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Wiko View3 */
    val VIEW3 = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Wiko View3 Lite */
    val VIEW3_LITE = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Wiko View3 Pro */
    val VIEW3_PRO = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Wiko View4 */
    val VIEW4 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Wiko View4 Lite */
    val VIEW4_LITE = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Wiko View5 */
    val VIEW5 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Wiko View5 Plus */
    val VIEW5_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Wiko View Prime */
    val VIEW_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Wiko WAX */
    val WAX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wiko WC300 */
    val WC300 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Wiko WC300SN */
    val WC300SN = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Wiko W_C800 */
    val W_C800 = "spec:width=720,height=1528,unit=px,dpi=280"

    /** Wiko W_C860 */
    val W_C860 = "spec:width=720,height=1528,unit=px,dpi=280"

    /** Wiko WIKO 10 */
    val WIKO_10 = "spec:width=720,height=1600,unit=px,dpi=260"

    /** Wiko Wiko Life 3 */
    val WIKO_LIFE_3 = "spec:width=480,height=960,unit=px,dpi=220"

    /** Wiko Wiko Ride 3 */
    val WIKO_RIDE_3 = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Wiko WIKO T21 */
    val WIKO_T21 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Wiko WIKO VOIX */
    val WIKO_VOIX = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Wiko WIM */
    val WIM = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Wiko WIM Lite */
    val WIM_LITE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Wiko W-K200 */
    val W_K200 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Wiko W_K300 */
    val W_K300 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Wiko W_K400 */
    val W_K400 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Wiko W_K600 */
    val W_K600 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Wiko W_P130 */
    val W_P130 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Wiko W_P200 */
    val W_P200 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Wiko W_P200CM */
    val W_P200CM = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Wiko Y50 */
    val Y50 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wiko Y52 */
    val Y52 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Wiko Y60 */
    val Y60 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Wiko Y61 */
    val Y61 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Wiko Y62 */
    val Y62 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Wiko Y80 */
    val Y80 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Wiko Y81 */
    val Y81 = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Wiko Y82 */
    val Y82 = "spec:width=720,height=1600,unit=px,dpi=320"

}
