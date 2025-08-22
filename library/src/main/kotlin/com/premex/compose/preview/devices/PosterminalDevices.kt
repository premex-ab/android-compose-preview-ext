package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Posterminal device specifications for Android Compose previews.
 *
 * This extension provides Posterminal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Posterminal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Posterminal get() = object {
    /** Posterminal mPOS-R */
    val MPOS_R = "spec:width=1080,height=1920,unit=px,dpi=160"

}
