package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hotwav device specifications for Android Compose previews.
 *
 * This extension provides Hotwav device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hotwav.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hotwav get() = object {
    /** Hotwav Cosmos_U */
    val COSMOS_U = "spec:width=480,height=996,unit=px,dpi=240"

    /** Hotwav Cyber_13_Pro */
    val CYBER_13_PRO = "spec:width=1080,height=2408,unit=px,dpi=440"

    /** Hotwav Cyber 15 */
    val CYBER_15 = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Hotwav Cyber 7 */
    val CYBER_7 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Hotwav Cyber 8 */
    val CYBER_8 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Hotwav Cyber 9 Pro */
    val CYBER_9_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Hotwav Cyber X */
    val CYBER_X = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Hotwav Cyber X Pro */
    val CYBER_X_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Hotwav H1 */
    val H1 = "spec:width=480,height=1014,unit=px,dpi=240"

    /** Hotwav HOT 6 */
    val HOT_6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hotwav Hyper 7 */
    val HYPER_7 = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Hotwav Hyper 7 Pro */
    val HYPER_7_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Hotwav M5 */
    val M5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hotwav M5i */
    val M5I = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hotwav M5 Plus */
    val M5_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hotwav M6 */
    val M6 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hotwav Note 12 */
    val NOTE_12 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Hotwav Note _12 _EF */
    val NOTE_12_EF = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Hotwav Note_13 */
    val NOTE_13 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Hotwav Note 13 Max */
    val NOTE_13_MAX = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Hotwav Note_13_Pro_EEA */
    val NOTE_13_PRO_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Hotwav Note 15 */
    val NOTE_15 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Hotwav Note 15 Pro */
    val NOTE_15_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Hotwav Note 16 */
    val NOTE_16 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Hotwav Pad 11 */
    val PAD_11 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Hotwav Pad_8 */
    val PAD_8 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Hotwav Pearl K1 */
    val PEARL_K1 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Hotwav Pearl K2 */
    val PEARL_K2 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Hotwav Pearl_K2_Prime */
    val PEARL_K2_PRIME = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Hotwav Pearl K3 */
    val PEARL_K3 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Hotwav Symbol */
    val SYMBOL = "spec:width=720,height=1498,unit=px,dpi=320"

    /** Hotwav Symbol Max */
    val SYMBOL_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Hotwav Symbol X */
    val SYMBOL_X = "spec:width=720,height=1498,unit=px,dpi=320"

    /** Hotwav T5 Pro */
    val T5_PRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hotwav T7 EEA */
    val T7_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hotwav T7 Pro EEA */
    val T7_PRO_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Hotwav TAB R5 */
    val TAB_R5 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hotwav TAB R6 Pro */
    val TAB_R6_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hotwav TAB R6 Ultra */
    val TAB_R6_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Hotwav TAB_R7 */
    val TAB_R7 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hotwav TAB R8 */
    val TAB_R8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hotwav TAB R9 Pro EEA */
    val TAB_R9_PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Hotwav W10 */
    val W10 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hotwav W10 Pro */
    val W10_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hotwav W11 */
    val W11 = "spec:width=1080,height=2408,unit=px,dpi=480"

}
