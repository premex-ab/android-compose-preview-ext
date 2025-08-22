package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vfonx device specifications for Android Compose previews.
 *
 * This extension provides Vfonx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vfonx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vfonx get() = object {
    /** Vfonx GP8 */
    val GP8 = "spec:width=1080,height=2160,unit=px,dpi=480"

}
