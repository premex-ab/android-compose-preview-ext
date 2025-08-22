package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Congotelecom device specifications for Android Compose previews.
 *
 * This extension provides Congotelecom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Congotelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Congotelecom get() = object {
    /** Congotelecom Speed */
    val SPEED = "spec:width=720,height=1600,unit=px,dpi=280"

}
