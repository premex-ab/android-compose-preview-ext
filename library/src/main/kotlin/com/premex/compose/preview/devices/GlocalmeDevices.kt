package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Glocalme device specifications for Android Compose previews.
 *
 * This extension provides Glocalme device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Glocalme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Glocalme get() = object {
    /** Glocalme P3S18 */
    val P3S18 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Glocalme S20i */
    val S20I = "spec:width=1080,height=2280,unit=px,dpi=480"

}
