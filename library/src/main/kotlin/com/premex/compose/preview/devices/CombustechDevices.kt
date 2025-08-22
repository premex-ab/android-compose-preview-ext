package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Combustech device specifications for Android Compose previews.
 *
 * This extension provides Combustech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Combustech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Combustech get() = object {
    /** Combustech COMBUSTECH-IFPD */
    val COMBUSTECH_IFPD = "spec:width=2160,height=3840,unit=px,dpi=480"

}
