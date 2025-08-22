package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rugstorm device specifications for Android Compose previews.
 *
 * This extension provides Rugstorm device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rugstorm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rugstorm get() = object {
    /** Rugstorm UA80 */
    val UA80 = "spec:width=800,height=1280,unit=px,dpi=280"

}
