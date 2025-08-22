package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aqhh device specifications for Android Compose previews.
 *
 * This extension provides Aqhh device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aqhh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aqhh get() = object {
    /** Aqhh A75 */
    val A75 = "spec:width=800,height=1280,unit=px,dpi=200"

}
