package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bothouniversity device specifications for Android Compose previews.
 *
 * This extension provides Bothouniversity device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bothouniversity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bothouniversity get() = object {
    /** Bothouniversity GLTAB101 */
    val GLTAB101 = "spec:width=800,height=1280,unit=px,dpi=200"

}
