package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mobicel device specifications for Android Compose previews.
 *
 * This extension provides Mobicel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mobicel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mobicel get() = object {
    /** Mobicel F40 */
    val F40 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Mobicel F41 */
    val F41 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Mobicel F50 */
    val F50 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Mobicel F51 */
    val F51 = "spec:width=480,height=854,unit=px,dpi=180"

    /** Mobicel IX PLUS */
    val IX_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Mobicel Mercury */
    val MERCURY = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Mobicel MX3 PLUS */
    val MX3_PLUS = "spec:width=480,height=854,unit=px,dpi=213"

    /** Mobicel P11 */
    val P11 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Mobicel P11 Plus */
    val P11_PLUS = "spec:width=576,height=1152,unit=px,dpi=220"

    /** Mobicel P12 */
    val P12 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mobicel P5 */
    val P5 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Mobicel RX */
    val RX = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mobicel Smart Tab 10 4G */
    val SMART_TAB_10_4G = "spec:width=800,height=1280,unit=px,dpi=280"

    /** Mobicel Vodacom Smart Tab 8 */
    val VODACOM_SMART_TAB_8 = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Mobicel VX21 */
    val VX21 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mobicel X6 */
    val X6 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Mobicel X7 */
    val X7 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mobicel Z4 */
    val Z4 = "spec:width=480,height=960,unit=px,dpi=200"

}
