package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Geogeotechvision device specifications for Android Compose previews.
 *
 * This extension provides Geogeotechvision device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Geogeotechvision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Geogeotechvision get() = object {
    /** Geogeotechvision GEO10 */
    val GEO10 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
