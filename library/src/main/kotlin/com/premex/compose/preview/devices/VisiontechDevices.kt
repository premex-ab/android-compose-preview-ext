package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Visiontech device specifications for Android Compose previews.
 *
 * This extension provides Visiontech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Visiontech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Visiontech get() = object {
    /** Visiontech PVT-8-A50-R1 */
    val PVT_8_A50_R1 = "spec:width=800,height=1280,unit=px,dpi=213"

}
