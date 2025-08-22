package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vizio device specifications for Android Compose previews.
 *
 * This extension provides Vizio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vizio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vizio get() = object {
    /** Vizio XR6M10 */
    val XR6M10 = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Vizio XR6P10 */
    val XR6P10 = "spec:width=1080,height=1920,unit=px,dpi=400"

}
