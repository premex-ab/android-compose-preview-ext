package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Haehne device specifications for Android Compose previews.
 *
 * This extension provides Haehne device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Haehne.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Haehne get() = object {
    /** Haehne A863K_EEA */
    val A863K_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

}
