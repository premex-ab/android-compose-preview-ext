package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Naomiphone device specifications for Android Compose previews.
 *
 * This extension provides Naomiphone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Naomiphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Naomiphone get() = object {
    /** Naomiphone Ambar */
    val AMBAR = "spec:width=480,height=960,unit=px,dpi=240"

}
