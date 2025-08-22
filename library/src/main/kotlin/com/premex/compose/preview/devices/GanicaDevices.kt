package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ganica device specifications for Android Compose previews.
 *
 * This extension provides Ganica device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ganica.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ganica get() = object {
    /** Ganica HL_1088_A133P */
    val HL_1088_A133P = "spec:width=800,height=1280,unit=px,dpi=160"

}
