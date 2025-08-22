package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wced device specifications for Android Compose previews.
 *
 * This extension provides Wced device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wced.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wced get() = object {
    /** Wced H1010_M50 */
    val H1010_M50 = "spec:width=1200,height=2000,unit=px,dpi=320"

}
