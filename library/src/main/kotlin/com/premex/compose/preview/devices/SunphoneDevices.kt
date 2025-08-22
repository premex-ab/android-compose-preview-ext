package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sunphone device specifications for Android Compose previews.
 *
 * This extension provides Sunphone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sunphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sunphone get() = object {
    /** Sunphone L3 */
    val L3 = "spec:width=720,height=1600,unit=px,dpi=320"

}
