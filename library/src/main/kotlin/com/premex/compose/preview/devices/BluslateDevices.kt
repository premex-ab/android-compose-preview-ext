package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bluslate device specifications for Android Compose previews.
 *
 * This extension provides Bluslate device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bluslate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bluslate get() = object {
    /** Bluslate Bluslate8 */
    val BLUSLATE8 = "spec:width=800,height=1280,unit=px,dpi=240"

}
