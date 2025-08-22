package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nelatech device specifications for Android Compose previews.
 *
 * This extension provides Nelatech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nelatech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nelatech get() = object {
    /** Nelatech TAB8V1  */
    val TAB8V1 = "spec:width=800,height=1280,unit=px,dpi=240"

}
