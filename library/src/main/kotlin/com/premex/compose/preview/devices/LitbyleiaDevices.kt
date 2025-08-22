package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Litbyleia device specifications for Android Compose previews.
 *
 * This extension provides Litbyleia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Litbyleia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Litbyleia get() = object {
    /** Litbyleia LUME */
    val LUME = "spec:width=1600,height=2560,unit=px,dpi=340"

}
