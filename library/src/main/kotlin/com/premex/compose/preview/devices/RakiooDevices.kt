package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rakioo device specifications for Android Compose previews.
 *
 * This extension provides Rakioo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rakioo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rakioo get() = object {
    /** Rakioo X5 */
    val X5 = "spec:width=600,height=1024,unit=px,dpi=160"

}
