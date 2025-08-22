package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mascom device specifications for Android Compose previews.
 *
 * This extension provides Mascom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mascom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mascom get() = object {
    /** Mascom MASCOM SS289 */
    val MASCOM_SS289 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Mascom MASCOM WS517 */
    val MASCOM_WS517 = "spec:width=480,height=856,unit=px,dpi=240"

}
