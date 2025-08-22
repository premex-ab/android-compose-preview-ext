package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jide device specifications for Android Compose previews.
 *
 * This extension provides Jide device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jide.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jide get() = object {
    /** Jide Remix Mini */
    val REMIX_MINI = "spec:width=1080,height=2220,unit=px,dpi=440"

}
