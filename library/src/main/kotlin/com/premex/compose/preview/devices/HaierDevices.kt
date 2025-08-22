package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Haier device specifications for Android Compose previews.
 *
 * This extension provides Haier device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Haier.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Haier get() = object {
    /** Haier A36C5H */
    val A36C5H = "spec:width=480,height=854,unit=px,dpi=240"

    /** Haier A4_Lite */
    val A4_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Haier A81G */
    val A81G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Haier Alpha A1 */
    val ALPHA_A1 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Haier Alpha A3 */
    val ALPHA_A3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Haier Elegance E13 */
    val ELEGANCE_E13 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Haier Elegance E7 */
    val ELEGANCE_E7 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Haier Elegance E9 */
    val ELEGANCE_E9 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Haier G51 */
    val G51 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Haier Haier Leisure L7 */
    val HAIER_LEISURE_L7 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Haier Haier Titan T5 */
    val HAIER_TITAN_T5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Haier I4 */
    val I4 = "spec:width=600,height=1280,unit=px,dpi=280"

    /** Haier I6_Infinity */
    val I6_INFINITY = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Haier L52 */
    val L52 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Haier M53-52401 */
    val M53_52401 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Haier P20 */
    val P20 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Haier P20_M88G3M */
    val P20_M88G3M = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Haier PAD1042 */
    val PAD1042 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Haier Power P10 */
    val POWER_P10 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Haier Power P11 */
    val POWER_P11 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Haier S5_Silk */
    val S5_SILK = "spec:width=480,height=960,unit=px,dpi=240"

    /** Haier Tablet_P20 */
    val TABLET_P20 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Haier Titan_T3 */
    val TITAN_T3 = "spec:width=720,height=1440,unit=px,dpi=320"

}
