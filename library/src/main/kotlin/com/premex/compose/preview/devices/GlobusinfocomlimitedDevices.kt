package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Globusinfocomlimited device specifications for Android Compose previews.
 *
 * This extension provides Globusinfocomlimited device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Globusinfocomlimited.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Globusinfocomlimited get() = object {
    /** Globusinfocomlimited GS04-Series */
    val GS04_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

}
