package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Geappliances device specifications for Android Compose previews.
 *
 * This extension provides Geappliances device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Geappliances.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Geappliances get() = object {
    /** Geappliances Kitchen Hub */
    val KITCHEN_HUB = "spec:width=1080,height=1920,unit=px,dpi=240"

}
