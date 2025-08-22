package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Travelwifi device specifications for Android Compose previews.
 *
 * This extension provides Travelwifi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Travelwifi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Travelwifi get() = object {
    /** Travelwifi Sapphire Tablet */
    val SAPPHIRE_TABLET = "spec:width=1200,height=1920,unit=px,dpi=320"

}
