package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Topjoy device specifications for Android Compose previews.
 *
 * This extension provides Topjoy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Topjoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Topjoy get() = object {
    /** Topjoy SC0802 */
    val SC0802 = "spec:width=800,height=1280,unit=px,dpi=170"

}
