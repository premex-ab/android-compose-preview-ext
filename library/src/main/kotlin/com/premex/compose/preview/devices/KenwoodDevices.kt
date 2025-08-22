package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kenwood device specifications for Android Compose previews.
 *
 * This extension provides Kenwood device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kenwood.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kenwood get() = object {
    /** Kenwood KWSA80K */
    val KWSA80K = "spec:width=1080,height=1920,unit=px,dpi=480"

}
