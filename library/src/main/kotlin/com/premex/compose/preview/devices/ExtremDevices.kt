package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Extrem device specifications for Android Compose previews.
 *
 * This extension provides Extrem device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Extrem.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Extrem get() = object {
    /** Extrem Infinity */
    val INFINITY = "spec:width=1200,height=1920,unit=px,dpi=280"

}
