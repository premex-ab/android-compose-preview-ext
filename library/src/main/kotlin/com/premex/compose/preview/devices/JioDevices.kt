package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jio device specifications for Android Compose previews.
 *
 * This extension provides Jio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jio get() = object {
    /** Jio JioPhone Next */
    val JIOPHONE_NEXT = "spec:width=720,height=1440,unit=px,dpi=320"

}
