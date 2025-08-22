package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Warp device specifications for Android Compose previews.
 *
 * This extension provides Warp device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Warp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Warp get() = object {
    /** Warp TAB-WP11 */
    val TAB_WP11 = "spec:width=1200,height=2000,unit=px,dpi=240"

}
