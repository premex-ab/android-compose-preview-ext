package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bridgestonemobilitysolutions device specifications for Android Compose previews.
 *
 * This extension provides Bridgestonemobilitysolutions device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bridgestonemobilitysolutions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bridgestonemobilitysolutions get() = object {
    /** Bridgestonemobilitysolutions PRO X */
    val PRO_X = "spec:width=800,height=1280,unit=px,dpi=200"

}
