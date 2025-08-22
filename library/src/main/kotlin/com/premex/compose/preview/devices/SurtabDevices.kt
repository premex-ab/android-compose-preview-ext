package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Surtab device specifications for Android Compose previews.
 *
 * This extension provides Surtab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Surtab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Surtab get() = object {
    /** Surtab SURTAB */
    val SURTAB = "spec:width=720,height=1280,unit=px,dpi=160"

}
