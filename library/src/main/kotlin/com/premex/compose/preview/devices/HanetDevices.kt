package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hanet device specifications for Android Compose previews.
 *
 * This extension provides Hanet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hanet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hanet get() = object {
    /** Hanet T432 */
    val T432 = "spec:width=800,height=1280,unit=px,dpi=213"

}
