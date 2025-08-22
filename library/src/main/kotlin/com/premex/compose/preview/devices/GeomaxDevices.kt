package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Geomax device specifications for Android Compose previews.
 *
 * This extension provides Geomax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Geomax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Geomax get() = object {
    /** Geomax GeoMax Zenius08 */
    val GEOMAX_ZENIUS08 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
