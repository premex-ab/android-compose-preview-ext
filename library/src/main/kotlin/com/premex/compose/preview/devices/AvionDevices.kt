package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Avion device specifications for Android Compose previews.
 *
 * This extension provides Avion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Avion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Avion get() = object {
    /** Avion Avion A10 */
    val AVION_A10 = "spec:width=720,height=1440,unit=px,dpi=320"

}
