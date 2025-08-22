package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Modecom device specifications for Android Compose previews.
 *
 * This extension provides Modecom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Modecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Modecom get() = object {
    /** Modecom ECHO LOLLY */
    val ECHO_LOLLY = "spec:width=480,height=800,unit=px,dpi=240"

    /** Modecom Horizon Lite Plus */
    val HORIZON_LITE_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

}
