package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zonmai device specifications for Android Compose previews.
 *
 * This extension provides Zonmai device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zonmai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zonmai get() = object {
    /** Zonmai MX2_EEA */
    val MX2_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
