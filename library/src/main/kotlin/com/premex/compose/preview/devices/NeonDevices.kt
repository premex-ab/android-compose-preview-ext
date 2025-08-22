package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Neon device specifications for Android Compose previews.
 *
 * This extension provides Neon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Neon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Neon get() = object {
    /** Neon Neon Tab 11 */
    val NEON_TAB_11 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
