package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Melefon device specifications for Android Compose previews.
 *
 * This extension provides Melefon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Melefon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Melefon get() = object {
    /** Melefon Good */
    val GOOD = "spec:width=480,height=960,unit=px,dpi=240"

}
