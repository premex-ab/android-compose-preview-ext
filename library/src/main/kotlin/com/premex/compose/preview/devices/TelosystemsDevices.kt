package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Telosystems device specifications for Android Compose previews.
 *
 * This extension provides Telosystems device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Telosystems.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Telosystems get() = object {
    /** Telosystems TE580P */
    val TE580P = "spec:width=480,height=800,unit=px,dpi=240"

    /** Telosystems TE590P */
    val TE590P = "spec:width=480,height=800,unit=px,dpi=240"

}
