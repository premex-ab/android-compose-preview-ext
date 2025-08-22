package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Piranha device specifications for Android Compose previews.
 *
 * This extension provides Piranha device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Piranha.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Piranha get() = object {
    /** Piranha Piranha8032 */
    val PIRANHA8032 = "spec:width=1080,height=2220,unit=px,dpi=440"

}
