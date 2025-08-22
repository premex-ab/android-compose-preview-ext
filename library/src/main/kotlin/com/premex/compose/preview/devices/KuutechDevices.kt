package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kuutech device specifications for Android Compose previews.
 *
 * This extension provides Kuutech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kuutech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kuutech get() = object {
    /** Kuutech UPAD2021_EEA */
    val UPAD2021_EEA = "spec:width=1600,height=2176,unit=px,dpi=320"

}
