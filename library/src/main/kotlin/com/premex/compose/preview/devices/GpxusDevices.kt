package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gpxus device specifications for Android Compose previews.
 *
 * This extension provides Gpxus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gpxus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gpxus get() = object {
    /** Gpxus TBDV1093 */
    val TBDV1093 = "spec:width=800,height=1280,unit=px,dpi=160"

}
