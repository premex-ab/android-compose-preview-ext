package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ktcpd device specifications for Android Compose previews.
 *
 * This extension provides Ktcpd device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ktcpd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ktcpd get() = object {
    /** Ktcpd BLISS503 */
    val BLISS503 = "spec:width=800,height=1280,unit=px,dpi=213"

}
