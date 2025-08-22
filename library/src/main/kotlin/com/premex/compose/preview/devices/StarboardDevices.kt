package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Starboard device specifications for Android Compose previews.
 *
 * This extension provides Starboard device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Starboard.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Starboard get() = object {
    /** Starboard YL */
    val YL = "spec:width=2160,height=3840,unit=px,dpi=480"

}
