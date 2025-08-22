package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smartron device specifications for Android Compose previews.
 *
 * This extension provides Smartron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smartron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smartron get() = object {
    /** Smartron Srtphone */
    val SRTPHONE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Smartron tphone */
    val TPHONE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Smartron tphone P */
    val TPHONE_P = "spec:width=720,height=1280,unit=px,dpi=320"

}
