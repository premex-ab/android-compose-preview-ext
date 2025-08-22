package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fancyday device specifications for Android Compose previews.
 *
 * This extension provides Fancyday device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fancyday.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fancyday get() = object {
    /** Fancyday C10US */
    val C10US = "spec:width=800,height=1280,unit=px,dpi=160"

}
