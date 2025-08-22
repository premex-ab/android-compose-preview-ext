package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Honkuahg device specifications for Android Compose previews.
 *
 * This extension provides Honkuahg device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Honkuahg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Honkuahg get() = object {
    /** Honkuahg EV10 */
    val EV10 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
