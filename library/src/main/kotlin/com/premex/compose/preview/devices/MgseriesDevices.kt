package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mgseries device specifications for Android Compose previews.
 *
 * This extension provides Mgseries device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mgseries.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mgseries get() = object {
    /** Mgseries Any 302 */
    val ANY_302 = "spec:width=800,height=1280,unit=px,dpi=160"

}
