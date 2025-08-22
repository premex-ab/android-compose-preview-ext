package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bigben device specifications for Android Compose previews.
 *
 * This extension provides Bigben device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bigben.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bigben get() = object {
    /** Bigben Bigtech_B_RU */
    val BIGTECH_B_RU = "spec:width=1200,height=1920,unit=px,dpi=280"

}
