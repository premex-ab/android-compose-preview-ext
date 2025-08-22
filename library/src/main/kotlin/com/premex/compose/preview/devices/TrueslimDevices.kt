package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Trueslim device specifications for Android Compose previews.
 *
 * This extension provides Trueslim device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Trueslim.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Trueslim get() = object {
    /** Trueslim 5516D */
    val _5516D = "spec:width=480,height=960,unit=px,dpi=240"

    /** Trueslim T1586K */
    val T1586K = "spec:width=480,height=960,unit=px,dpi=200"

}
