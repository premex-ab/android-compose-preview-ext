package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Azomtech device specifications for Android Compose previews.
 *
 * This extension provides Azomtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Azomtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Azomtech get() = object {
    /** Azomtech Desert2 */
    val DESERT2 = "spec:width=1080,height=2310,unit=px,dpi=480"

    /** Azomtech River1 */
    val RIVER1 = "spec:width=1080,height=2400,unit=px,dpi=480"

}
