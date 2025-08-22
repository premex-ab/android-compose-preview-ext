package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ssadigital device specifications for Android Compose previews.
 *
 * This extension provides Ssadigital device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ssadigital.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ssadigital get() = object {
    /** Ssadigital MID-1015T */
    val MID_1015T = "spec:width=800,height=1280,unit=px,dpi=160"

}
