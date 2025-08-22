package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ascom device specifications for Android Compose previews.
 *
 * This extension provides Ascom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ascom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ascom get() = object {
    /** Ascom Ascom Myco 3 */
    val ASCOM_MYCO_3 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Ascom Ascom Myco 4 */
    val ASCOM_MYCO_4 = "spec:width=1080,height=2160,unit=px,dpi=440"

}
