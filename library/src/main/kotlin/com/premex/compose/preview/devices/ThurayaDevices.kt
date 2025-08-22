package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Thuraya device specifications for Android Compose previews.
 *
 * This extension provides Thuraya device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Thuraya.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Thuraya get() = object {
    /** Thuraya Thuraya X5-Touch */
    val THURAYA_X5_TOUCH = "spec:width=1080,height=1920,unit=px,dpi=480"

}
