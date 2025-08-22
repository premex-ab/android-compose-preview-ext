package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Trufon device specifications for Android Compose previews.
 *
 * This extension provides Trufon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Trufon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Trufon get() = object {
    /** Trufon TRUFON FLEX */
    val TRUFON_FLEX = "spec:width=720,height=1600,unit=px,dpi=280"

}
