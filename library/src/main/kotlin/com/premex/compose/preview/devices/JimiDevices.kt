package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jimi device specifications for Android Compose previews.
 *
 * This extension provides Jimi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jimi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jimi get() = object {
    /** Jimi Senwa S471 */
    val SENWA_S471 = "spec:width=480,height=800,unit=px,dpi=240"

}
