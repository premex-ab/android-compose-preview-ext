package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zeeker device specifications for Android Compose previews.
 *
 * This extension provides Zeeker device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zeeker.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zeeker get() = object {
    /** Zeeker ZEEKER_P10_RU */
    val ZEEKER_P10_RU = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Zeeker ZEEKER_T100_EEA */
    val ZEEKER_T100_EEA = "spec:width=1080,height=2160,unit=px,dpi=480"

}
