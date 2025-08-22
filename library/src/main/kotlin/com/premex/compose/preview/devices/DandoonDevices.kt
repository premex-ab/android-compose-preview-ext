package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dandoon device specifications for Android Compose previews.
 *
 * This extension provides Dandoon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dandoon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dandoon get() = object {
    /** Dandoon A2 */
    val A2 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
