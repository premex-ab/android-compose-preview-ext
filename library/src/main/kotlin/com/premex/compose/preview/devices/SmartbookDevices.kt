package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smartbook device specifications for Android Compose previews.
 *
 * This extension provides Smartbook device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smartbook.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smartbook get() = object {
    /** Smartbook S204G */
    val S204G = "spec:width=800,height=1280,unit=px,dpi=160"

}
