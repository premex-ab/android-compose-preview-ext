package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kefeya device specifications for Android Compose previews.
 *
 * This extension provides Kefeya device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kefeya.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kefeya get() = object {
    /** Kefeya Touch-Screen-Monitor */
    val TOUCH_SCREEN_MONITOR = "spec:width=1080,height=1920,unit=px,dpi=216"

}
