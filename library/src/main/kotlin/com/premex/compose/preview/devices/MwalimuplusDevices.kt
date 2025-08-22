package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mwalimuplus device specifications for Android Compose previews.
 *
 * This extension provides Mwalimuplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mwalimuplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mwalimuplus get() = object {
    /** Mwalimuplus MP01A3G */
    val MP01A3G = "spec:width=800,height=1280,unit=px,dpi=213"

}
