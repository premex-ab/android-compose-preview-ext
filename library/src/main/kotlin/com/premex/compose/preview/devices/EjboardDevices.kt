package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ejboard device specifications for Android Compose previews.
 *
 * This extension provides Ejboard device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ejboard.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ejboard get() = object {
    /** Ejboard EJ_IFPD */
    val EJ_IFPD = "spec:width=2160,height=3840,unit=px,dpi=480"

}
