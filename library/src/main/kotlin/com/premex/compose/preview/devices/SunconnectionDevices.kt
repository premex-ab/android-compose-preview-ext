package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sunconnection device specifications for Android Compose previews.
 *
 * This extension provides Sunconnection device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sunconnection.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sunconnection get() = object {
    /** Sunconnection SUNTB_01_GY */
    val SUNTB_01_GY = "spec:width=800,height=1280,unit=px,dpi=213"

}
