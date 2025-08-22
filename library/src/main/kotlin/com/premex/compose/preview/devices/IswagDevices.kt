package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iswag device specifications for Android Compose previews.
 *
 * This extension provides Iswag device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iswag.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iswag get() = object {
    /** Iswag ALPHA */
    val ALPHA = "spec:width=480,height=800,unit=px,dpi=240"

    /** Iswag BLINK */
    val BLINK = "spec:width=444,height=960,unit=px,dpi=213"

    /** Iswag iSWAG ACTIV */
    val ISWAG_ACTIV = "spec:width=720,height=1520,unit=px,dpi=300"

    /** Iswag ISWAG_VIPER */
    val ISWAG_VIPER = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Iswag MATRIX */
    val MATRIX = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Iswag NEO */
    val NEO = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Iswag STREAM7 */
    val STREAM7 = "spec:width=600,height=1024,unit=px,dpi=213"

}
