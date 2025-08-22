package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Avaya device specifications for Android Compose previews.
 *
 * This extension provides Avaya device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Avaya.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Avaya get() = object {
    /** Avaya Vantage */
    val VANTAGE = "spec:width=800,height=1280,unit=px,dpi=213"

}
