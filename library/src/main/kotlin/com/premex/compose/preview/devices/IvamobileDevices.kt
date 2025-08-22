package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ivamobile device specifications for Android Compose previews.
 *
 * This extension provides Ivamobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ivamobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ivamobile get() = object {
    /** Ivamobile LAMCY L400 */
    val LAMCY_L400 = "spec:width=480,height=960,unit=px,dpi=240"

}
