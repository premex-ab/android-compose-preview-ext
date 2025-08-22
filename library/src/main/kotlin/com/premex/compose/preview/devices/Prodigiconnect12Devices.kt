package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Prodigiconnect12 device specifications for Android Compose previews.
 *
 * This extension provides Prodigiconnect12 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Prodigiconnect12.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Prodigiconnect12 get() = object {
    /** Prodigiconnect12 Prodigi Connect 12 */
    val PRODIGI_CONNECT_12 = "spec:width=1080,height=1920,unit=px,dpi=240"

}
