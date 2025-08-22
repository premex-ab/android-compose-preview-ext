package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Neffos device specifications for Android Compose previews.
 *
 * This extension provides Neffos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Neffos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Neffos get() = object {
    /** Neffos C5 */
    val C5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Neffos C5L */
    val C5L = "spec:width=480,height=854,unit=px,dpi=240"

    /** Neffos C5 Max */
    val C5_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Neffos Neffos  A5 */
    val NEFFOS_A5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Neffos Neffos C5 Plus */
    val NEFFOS_C5_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Neffos Neffos C7 */
    val NEFFOS_C7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Neffos Neffos C7 Lite */
    val NEFFOS_C7_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Neffos Neffos C7s */
    val NEFFOS_C7S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Neffos Neffos C9 */
    val NEFFOS_C9 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Neffos Neffos C9A */
    val NEFFOS_C9A = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Neffos Neffos  C9 Max */
    val NEFFOS_C9_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Neffos Neffos  C9s */
    val NEFFOS_C9S = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Neffos Neffos N1 */
    val NEFFOS_N1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Neffos Neffos X1 */
    val NEFFOS_X1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Neffos Neffos X1 Max */
    val NEFFOS_X1_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Neffos Neffos X20 */
    val NEFFOS_X20 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Neffos Neffos X20 Pro */
    val NEFFOS_X20_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Neffos Neffos X9 */
    val NEFFOS_X9 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Neffos Neffos Y5i */
    val NEFFOS_Y5I = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Neffos Neffos Y5s */
    val NEFFOS_Y5S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Neffos Neffos Y6 */
    val NEFFOS_Y6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Neffos Neffos Y7 */
    val NEFFOS_Y7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Neffos TP703A */
    val TP703A = "spec:width=480,height=854,unit=px,dpi=240"

    /** Neffos TP704A */
    val TP704A = "spec:width=480,height=854,unit=px,dpi=240"

    /** Neffos TP705 */
    val TP705 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Neffos X1 Lite */
    val X1_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Neffos Y5 */
    val Y5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Neffos Y50 */
    val Y50 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Neffos Y5L */
    val Y5L = "spec:width=480,height=854,unit=px,dpi=240"

}
