package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Selectron device specifications for Android Compose previews.
 *
 * This extension provides Selectron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Selectron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Selectron get() = object {
    /** Selectron T101G */
    val T101G = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Selectron T856G */
    val T856G = "spec:width=800,height=1280,unit=px,dpi=240"

}
