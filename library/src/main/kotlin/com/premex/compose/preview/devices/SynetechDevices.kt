package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Synetech device specifications for Android Compose previews.
 *
 * This extension provides Synetech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Synetech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Synetech get() = object {
    /** Synetech Synetech_Elite_Taurus_V */
    val SYNETECH_ELITE_TAURUS_V = "spec:width=2160,height=3840,unit=px,dpi=480"

}
