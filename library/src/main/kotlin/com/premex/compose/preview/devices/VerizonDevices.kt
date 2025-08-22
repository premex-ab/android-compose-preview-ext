package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Verizon device specifications for Android Compose previews.
 *
 * This extension provides Verizon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Verizon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Verizon get() = object {
    /** Verizon Visible Midnight */
    val VISIBLE_MIDNIGHT = "spec:width=720,height=1600,unit=px,dpi=280"

}
