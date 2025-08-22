package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Teamgee device specifications for Android Compose previews.
 *
 * This extension provides Teamgee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Teamgee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Teamgee get() = object {
    /** Teamgee Touch-Screen-Monitor */
    val TOUCH_SCREEN_MONITOR = "spec:width=1080,height=1920,unit=px,dpi=216"

}
