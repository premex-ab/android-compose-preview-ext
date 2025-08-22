package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Opay device specifications for Android Compose previews.
 *
 * This extension provides Opay device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Opay.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Opay get() = object {
    /** Opay M1 Lite */
    val M1_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

}
