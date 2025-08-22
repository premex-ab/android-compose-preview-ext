package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kaicom device specifications for Android Compose previews.
 *
 * This extension provides Kaicom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kaicom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kaicom get() = object {
    /** Kaicom K901 */
    val K901 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Kaicom KAICOM W660 */
    val KAICOM_W660 = "spec:width=640,height=1136,unit=px,dpi=320"

}
