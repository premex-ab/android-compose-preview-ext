package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Winro device specifications for Android Compose previews.
 *
 * This extension provides Winro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Winro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Winro get() = object {
    /** Winro Voni10 */
    val VONI10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
