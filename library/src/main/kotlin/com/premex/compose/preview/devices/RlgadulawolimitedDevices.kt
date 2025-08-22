package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rlgadulawolimited device specifications for Android Compose previews.
 *
 * This extension provides Rlgadulawolimited device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rlgadulawolimited.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rlgadulawolimited get() = object {
    /** Rlgadulawolimited Eagle-2024 */
    val EAGLE_2024 = "spec:width=800,height=1280,unit=px,dpi=240"

}
