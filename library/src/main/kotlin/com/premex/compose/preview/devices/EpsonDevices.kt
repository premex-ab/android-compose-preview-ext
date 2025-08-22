package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Epson device specifications for Android Compose previews.
 *
 * This extension provides Epson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Epson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Epson get() = object {
    /** Epson embt4 */
    val EMBT4 = "spec:width=480,height=854,unit=px,dpi=240"

}
