package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sonyaudio device specifications for Android Compose previews.
 *
 * This extension provides Sonyaudio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sonyaudio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sonyaudio get() = object {
    /** Sonyaudio NW-A100 */
    val NW_A100 = "spec:width=720,height=1280,unit=px,dpi=360"

    /** Sonyaudio NW-ZX500 */
    val NW_ZX500 = "spec:width=720,height=1280,unit=px,dpi=360"

}
