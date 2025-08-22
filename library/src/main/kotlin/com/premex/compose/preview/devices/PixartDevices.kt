package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pixart device specifications for Android Compose previews.
 *
 * This extension provides Pixart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pixart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pixart get() = object {
    /** Pixart Pixart_P20 */
    val PIXART_P20 = "spec:width=800,height=1280,unit=px,dpi=213"

}
