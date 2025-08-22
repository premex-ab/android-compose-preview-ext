package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Datsun device specifications for Android Compose previews.
 *
 * This extension provides Datsun device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Datsun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Datsun get() = object {
    /** Datsun Datsun_D5001 */
    val DATSUN_D5001 = "spec:width=480,height=960,unit=px,dpi=240"

}
