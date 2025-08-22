package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nuans device specifications for Android Compose previews.
 *
 * This extension provides Nuans device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nuans.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nuans get() = object {
    /** Nuans NEO [Reloaded] */
    val NEO_RELOADED = "spec:width=1080,height=1920,unit=px,dpi=420"

}
