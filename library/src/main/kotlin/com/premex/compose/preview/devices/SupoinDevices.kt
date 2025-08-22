package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Supoin device specifications for Android Compose previews.
 *
 * This extension provides Supoin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Supoin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Supoin get() = object {
    /** Supoin S66 */
    val S66 = "spec:width=720,height=1440,unit=px,dpi=320"

}
