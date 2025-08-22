package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Avtek device specifications for Android Compose previews.
 *
 * This extension provides Avtek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Avtek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Avtek get() = object {
    /** Avtek TS_8_1_Mate_G */
    val TS_8_1_MATE_G = "spec:width=2160,height=3840,unit=px,dpi=480"

}
