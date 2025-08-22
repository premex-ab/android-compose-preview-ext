package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nodropout device specifications for Android Compose previews.
 *
 * This extension provides Nodropout device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nodropout.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nodropout get() = object {
    /** Nodropout T25 */
    val T25 = "spec:width=800,height=1280,unit=px,dpi=240"

}
