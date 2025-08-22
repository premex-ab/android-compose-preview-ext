package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Idevice device specifications for Android Compose previews.
 *
 * This extension provides Idevice device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Idevice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Idevice get() = object {
    /** Idevice Uzbekistan */
    val UZBEKISTAN = "spec:width=720,height=1520,unit=px,dpi=320"

}
