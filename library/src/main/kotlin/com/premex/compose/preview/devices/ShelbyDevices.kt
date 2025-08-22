package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Shelby device specifications for Android Compose previews.
 *
 * This extension provides Shelby device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Shelby.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Shelby get() = object {
    /** Shelby ZA555 */
    val ZA555 = "spec:width=720,height=1280,unit=px,dpi=320"

}
