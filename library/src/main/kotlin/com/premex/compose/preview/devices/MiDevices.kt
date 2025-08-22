package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mi device specifications for Android Compose previews.
 *
 * This extension provides Mi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mi get() = object {
    /** Mi Mi 11 X */
    val MI_11_X = "spec:width=1080,height=2400,unit=px,dpi=440"

}
