package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Krip device specifications for Android Compose previews.
 *
 * This extension provides Krip device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Krip.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Krip get() = object {
    /** Krip K4b */
    val K4B = "spec:width=480,height=800,unit=px,dpi=240"

    /** Krip K4m */
    val K4M = "spec:width=480,height=800,unit=px,dpi=240"

    /** Krip K5 */
    val K5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Krip K50 */
    val K50 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Krip K51 */
    val K51 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Krip K55g */
    val K55G = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Krip K55h */
    val K55H = "spec:width=480,height=960,unit=px,dpi=240"

    /** Krip K57 */
    val K57 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Krip K58 */
    val K58 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Krip K58b */
    val K58B = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Krip K5b */
    val K5B = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Krip K5c */
    val K5C = "spec:width=540,height=960,unit=px,dpi=240"

    /** Krip K5d */
    val K5D = "spec:width=480,height=854,unit=px,dpi=240"

    /** Krip K5m */
    val K5M = "spec:width=480,height=854,unit=px,dpi=240"

    /** Krip K6 */
    val K6 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Krip K60 */
    val K60 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Krip K65 */
    val K65 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Krip K66 */
    val K66 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Krip K6b */
    val K6B = "spec:width=480,height=960,unit=px,dpi=213"

    /** Krip K700A */
    val K700A = "spec:width=480,height=960,unit=px,dpi=240"

    /** Krip KRIP_K4 */
    val KRIP_K4 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Krip KRIP_K55 */
    val KRIP_K55 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Krip KRIP K68 */
    val KRIP_K68 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Krip KRIP K69 */
    val KRIP_K69 = "spec:width=720,height=1640,unit=px,dpi=320"

}
