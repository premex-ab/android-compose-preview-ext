package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lifedigital device specifications for Android Compose previews.
 *
 * This extension provides Lifedigital device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lifedigital.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lifedigital get() = object {
    /** Lifedigital K3102_4G */
    val K3102_4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Lifedigital K3102_W */
    val K3102_W = "spec:width=800,height=1280,unit=px,dpi=160"

}
