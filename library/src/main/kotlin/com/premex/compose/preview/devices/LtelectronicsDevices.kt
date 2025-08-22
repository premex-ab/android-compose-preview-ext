package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ltelectronics device specifications for Android Compose previews.
 *
 * This extension provides Ltelectronics device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ltelectronics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ltelectronics get() = object {
    /** Ltelectronics K100 */
    val K100 = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Ltelectronics K200 */
    val K200 = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Ltelectronics K700 */
    val K700 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ltelectronics LT_C1500 */
    val LT_C1500 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ltelectronics LT_C2100 */
    val LT_C2100 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Ltelectronics LT_C2200 */
    val LT_C2200 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Ltelectronics LT_C3300 */
    val LT_C3300 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ltelectronics LT_C3500 */
    val LT_C3500 = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Ltelectronics LT-NOTE-10S */
    val LT_NOTE_10S = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Ltelectronics LT_S10_Lite */
    val LT_S10_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Ltelectronics LT_S9_NOTE */
    val LT_S9_NOTE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Ltelectronics SPURT_K300 */
    val SPURT_K300 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Ltelectronics SPURT_K400 */
    val SPURT_K400 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Ltelectronics SPURT_K500 */
    val SPURT_K500 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Ltelectronics SPURT_K600 */
    val SPURT_K600 = "spec:width=720,height=1520,unit=px,dpi=320"

}
