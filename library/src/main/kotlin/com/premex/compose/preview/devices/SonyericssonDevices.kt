package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sonyericsson device specifications for Android Compose previews.
 *
 * This extension provides Sonyericsson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sonyericsson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sonyericsson get() = object {
    /** Sonyericsson Xperia AX */
    val XPERIA_AX = "spec:width=720,height=1184,unit=px,dpi=320"

    /** Sonyericsson Xperia GX */
    val XPERIA_GX = "spec:width=720,height=1184,unit=px,dpi=320"

    /** Sonyericsson Xperia SX */
    val XPERIA_SX = "spec:width=540,height=888,unit=px,dpi=240"

    /** Sonyericsson Xperia Tablet Z */
    val XPERIA_TABLET_Z = "spec:width=1128,height=1920,unit=px,dpi=240"

    /** Sonyericsson Xperia UL */
    val XPERIA_UL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sonyericsson Xperia VL */
    val XPERIA_VL = "spec:width=720,height=1184,unit=px,dpi=320"

}
