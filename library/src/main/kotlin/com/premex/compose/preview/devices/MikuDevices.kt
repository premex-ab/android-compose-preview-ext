package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Miku device specifications for Android Compose previews.
 *
 * This extension provides Miku device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Miku.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Miku get() = object {
    /** Miku TAB63A */
    val TAB63A = "spec:width=1200,height=1920,unit=px,dpi=240"

}
