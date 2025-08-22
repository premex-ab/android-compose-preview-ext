package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Glxir device specifications for Android Compose previews.
 *
 * This extension provides Glxir device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Glxir.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Glxir get() = object {
    /** Glxir Shahin_IV */
    val SHAHIN_IV = "spec:width=1080,height=2460,unit=px,dpi=480"

}
