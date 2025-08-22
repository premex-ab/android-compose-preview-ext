package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nobby device specifications for Android Compose previews.
 *
 * This extension provides Nobby device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nobby.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nobby get() = object {
    /** Nobby S300 pro */
    val S300_PRO = "spec:width=480,height=960,unit=px,dpi=240"

}
