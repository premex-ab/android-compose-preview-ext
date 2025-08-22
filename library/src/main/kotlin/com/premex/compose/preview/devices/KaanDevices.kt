package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kaan device specifications for Android Compose previews.
 *
 * This extension provides Kaan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kaan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kaan get() = object {
    /** Kaan A1 */
    val A1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kaan KAAN_N2 */
    val KAAN_N2 = "spec:width=720,height=1440,unit=px,dpi=320"

}
