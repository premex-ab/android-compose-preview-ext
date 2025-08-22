package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Geoelectron device specifications for Android Compose previews.
 *
 * This extension provides Geoelectron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Geoelectron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Geoelectron get() = object {
    /** Geoelectron P9IV_Handheld_EEA */
    val P9IV_HANDHELD_EEA = "spec:width=720,height=1280,unit=px,dpi=320"

}
