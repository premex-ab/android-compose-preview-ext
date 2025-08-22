package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Etera device specifications for Android Compose previews.
 *
 * This extension provides Etera device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Etera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Etera get() = object {
    /** Etera  E980 */
    val E980 = "spec:width=240,height=320,unit=px,dpi=120"

}
