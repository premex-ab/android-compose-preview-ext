package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Feonal device specifications for Android Compose previews.
 *
 * This extension provides Feonal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Feonal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Feonal get() = object {
    /** Feonal D105_EEA */
    val D105_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Feonal D106_EEA */
    val D106_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Feonal D115_EEA */
    val D115_EEA = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Feonal D118_EEA */
    val D118_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Feonal K118_EEA */
    val K118_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Feonal K711_EEA */
    val K711_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

}
