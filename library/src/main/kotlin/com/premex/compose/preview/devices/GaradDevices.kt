package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Garad device specifications for Android Compose previews.
 *
 * This extension provides Garad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Garad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Garad get() = object {
    /** Garad GARAD_fire */
    val GARAD_FIRE = "spec:width=480,height=960,unit=px,dpi=240"

}
