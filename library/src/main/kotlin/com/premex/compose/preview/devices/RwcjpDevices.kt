package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rwcjp device specifications for Android Compose previews.
 *
 * This extension provides Rwcjp device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rwcjp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rwcjp get() = object {
    /** Rwcjp HNPD01 */
    val HNPD01 = "spec:width=1536,height=2048,unit=px,dpi=320"

}
