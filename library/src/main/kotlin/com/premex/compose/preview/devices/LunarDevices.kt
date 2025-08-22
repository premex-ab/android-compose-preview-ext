package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lunar device specifications for Android Compose previews.
 *
 * This extension provides Lunar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lunar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lunar get() = object {
    /** Lunar Lunar Eclipse L1 */
    val LUNAR_ECLIPSE_L1 = "spec:width=1080,height=2460,unit=px,dpi=480"

}
