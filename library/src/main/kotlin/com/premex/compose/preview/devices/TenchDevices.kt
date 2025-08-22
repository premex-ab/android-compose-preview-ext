package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tench device specifications for Android Compose previews.
 *
 * This extension provides Tench device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tench.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tench get() = object {
    /** Tench TAB_A10 */
    val TAB_A10 = "spec:width=800,height=1280,unit=px,dpi=213"

}
