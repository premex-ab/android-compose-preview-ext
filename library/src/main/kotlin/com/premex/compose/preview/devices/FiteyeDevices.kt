package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fiteye device specifications for Android Compose previews.
 *
 * This extension provides Fiteye device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fiteye.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fiteye get() = object {
    /** Fiteye Mobile smart screen */
    val MOBILE_SMART_SCREEN = "spec:width=1080,height=1920,unit=px,dpi=280"

}
