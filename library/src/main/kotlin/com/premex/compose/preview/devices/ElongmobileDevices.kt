package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Elongmobile device specifications for Android Compose previews.
 *
 * This extension provides Elongmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Elongmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Elongmobile get() = object {
    /** Elongmobile 6AT */
    val _6AT = "spec:width=480,height=960,unit=px,dpi=240"

    /** Elongmobile 6CS */
    val _6CS = "spec:width=240,height=296,unit=px,dpi=120"

}
