package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Flytech device specifications for Android Compose previews.
 *
 * This extension provides Flytech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Flytech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Flytech get() = object {
    /** Flytech T101 */
    val T101 = "spec:width=800,height=1280,unit=px,dpi=213"

}
