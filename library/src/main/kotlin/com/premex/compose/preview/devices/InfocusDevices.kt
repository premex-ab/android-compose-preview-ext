package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Infocus device specifications for Android Compose previews.
 *
 * This extension provides Infocus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Infocus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Infocus get() = object {
    /** Infocus Big Tab */
    val BIG_TAB = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Infocus Big Tab */
    val BIG_TAB_900X1600 = "spec:width=900,height=1600,unit=px,dpi=160"

    /** Infocus IF9001 */
    val IF9001 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Infocus IF9002 */
    val IF9002 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Infocus IF9007 */
    val IF9007 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Infocus IF9021 */
    val IF9021 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Infocus InFocus M6S */
    val INFOCUS_M6S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Infocus InFocus M7 Lite */
    val INFOCUS_M7_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Infocus InFocus M7S */
    val INFOCUS_M7S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Infocus M2_3G */
    val M2_3G = "spec:width=768,height=1280,unit=px,dpi=320"

    /** Infocus M320 */
    val M320 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Infocus M330 */
    val M330 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Infocus M370 */
    val M370 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Infocus M370i */
    val M370I = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Infocus M430 */
    val M430 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Infocus M535_00WW */
    val M535_00WW = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Infocus M550 3D */
    val M550_3D = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Infocus M5s */
    val M5S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Infocus M680 */
    val M680 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Infocus M808i */
    val M808I = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Infocus M810 */
    val M810 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Infocus M812 */
    val M812 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Infocus Vision 3 Pro */
    val VISION_3_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Infocus VZU */
    val VZU = "spec:width=720,height=1280,unit=px,dpi=320"

}
