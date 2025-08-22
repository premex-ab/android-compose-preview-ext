package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ubiquiti device specifications for Android Compose previews.
 *
 * This extension provides Ubiquiti device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ubiquiti.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ubiquiti get() = object {
    /** Ubiquiti UVP */
    val UVP = "spec:width=640,height=960,unit=px,dpi=240"

    /** Ubiquiti UVP Executive */
    val UVP_EXECUTIVE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ubiquiti UVP Pro */
    val UVP_PRO = "spec:width=640,height=960,unit=px,dpi=240"

}
