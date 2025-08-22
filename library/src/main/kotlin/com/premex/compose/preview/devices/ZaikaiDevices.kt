package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zaikai device specifications for Android Compose previews.
 *
 * This extension provides Zaikai device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zaikai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zaikai get() = object {
    /** Zaikai Mannat_Smart_Board */
    val MANNAT_SMART_BOARD = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Zaikai ZAIKAI */
    val ZAIKAI = "spec:width=2160,height=3840,unit=px,dpi=480"

}
