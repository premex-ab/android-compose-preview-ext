package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Swaconnect device specifications for Android Compose previews.
 *
 * This extension provides Swaconnect device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Swaconnect.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Swaconnect get() = object {
    /** Swaconnect SWA310_NEU */
    val SWA310_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

}
