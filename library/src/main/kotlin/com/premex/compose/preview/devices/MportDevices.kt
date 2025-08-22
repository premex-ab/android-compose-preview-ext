package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mport device specifications for Android Compose previews.
 *
 * This extension provides Mport device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mport.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mport get() = object {
    /** Mport MPORT-IFPD */
    val MPORT_IFPD = "spec:width=2160,height=3840,unit=px,dpi=480"

}
