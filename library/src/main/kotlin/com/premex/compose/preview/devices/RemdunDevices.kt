package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Remdun device specifications for Android Compose previews.
 *
 * This extension provides Remdun device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Remdun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Remdun get() = object {
    /** Remdun RD115MQE */
    val RD115MQE = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Remdun RD11PT */
    val RD11PT = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Remdun RD15QE */
    val RD15QE = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Remdun RD16Q */
    val RD16Q = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Remdun RD16QE */
    val RD16QE = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Remdun RD195T */
    val RD195T = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Remdun RD1XT */
    val RD1XT = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Remdun RD40T */
    val RD40T = "spec:width=480,height=800,unit=px,dpi=240"

    /** Remdun RD40TE */
    val RD40TE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Remdun RD50T */
    val RD50T = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Remdun RD50TE */
    val RD50TE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Remdun RD51QE */
    val RD51QE = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Remdun RD52E */
    val RD52E = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Remdun RD60TE */
    val RD60TE = "spec:width=720,height=1440,unit=px,dpi=360"

    /** Remdun RD62E */
    val RD62E = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Remdun RD695T */
    val RD695T = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Remdun RD86 */
    val RD86 = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Remdun RD86E */
    val RD86E = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Remdun RD86QE */
    val RD86QE = "spec:width=800,height=1280,unit=px,dpi=240"

}
