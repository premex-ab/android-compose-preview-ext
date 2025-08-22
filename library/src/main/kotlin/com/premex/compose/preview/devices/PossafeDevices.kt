package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Possafe device specifications for Android Compose previews.
 *
 * This extension provides Possafe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Possafe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Possafe get() = object {
    /** Possafe OrderGo5_EEA */
    val ORDERGO5_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Possafe OrderGo_6_TR */
    val ORDERGO_6_TR = "spec:width=720,height=1440,unit=px,dpi=320"

}
