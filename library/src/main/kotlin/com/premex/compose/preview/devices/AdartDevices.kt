package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Adart device specifications for Android Compose previews.
 *
 * This extension provides Adart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Adart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Adart get() = object {
    /** Adart RX550 */
    val RX550 = "spec:width=720,height=1280,unit=px,dpi=320"

}
