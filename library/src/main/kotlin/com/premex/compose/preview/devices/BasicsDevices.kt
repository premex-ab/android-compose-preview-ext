package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Basics device specifications for Android Compose previews.
 *
 * This extension provides Basics device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Basics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Basics get() = object {
    /** Basics BT1124FW */
    val BT1124FW = "spec:width=1200,height=1920,unit=px,dpi=213"

}
