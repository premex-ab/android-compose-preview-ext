package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vivitek device specifications for Android Compose previews.
 *
 * This extension provides Vivitek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vivitek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vivitek get() = object {
    /** Vivitek BK3_TH3_series */
    val BK3_TH3_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

}
