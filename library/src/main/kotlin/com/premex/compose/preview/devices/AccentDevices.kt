package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Accent device specifications for Android Compose previews.
 *
 * This extension provides Accent device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Accent.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Accent get() = object {
    /** Accent Accent Camelon C6 */
    val ACCENT_CAMELON_C6 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Accent C5L PLUS */
    val C5L_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Accent CAMELEON C5 */
    val CAMELEON_C5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Accent FAST10 */
    val FAST10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Accent Fast10 */
    val FAST10_800X1280 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Accent Fast17 */
    val FAST17 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Accent FAST7 */
    val FAST7 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Accent FAST73G */
    val FAST73G = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Accent FAST7 3G */
    val FAST7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Accent KIDZY70 */
    val KIDZY70 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Accent Pearl_A4 */
    val PEARL_A4 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Accent PEARL A4 Lite */
    val PEARL_A4_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Accent Pearl A4 PLUS */
    val PEARL_A4_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Accent PEARL A6 */
    val PEARL_A6 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Accent Pearl A6 */
    val PEARL_A6_720X1600 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Accent TANK_P55 */
    val TANK_P55 = "spec:width=720,height=1440,unit=px,dpi=320"

}
