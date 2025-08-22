package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kzen device specifications for Android Compose previews.
 *
 * This extension provides Kzen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kzen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kzen get() = object {
    /** Kzen Lamia_L01 */
    val LAMIA_L01 = "spec:width=720,height=1440,unit=px,dpi=320"

}
