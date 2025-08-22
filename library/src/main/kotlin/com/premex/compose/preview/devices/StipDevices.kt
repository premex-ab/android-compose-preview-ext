package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Stip device specifications for Android Compose previews.
 *
 * This extension provides Stip device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Stip.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Stip get() = object {
    /** Stip MS9 */
    val MS9 = "spec:width=720,height=1440,unit=px,dpi=320"

}
