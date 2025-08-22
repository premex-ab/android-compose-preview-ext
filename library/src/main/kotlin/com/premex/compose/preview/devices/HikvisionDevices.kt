package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hikvision device specifications for Android Compose previews.
 *
 * This extension provides Hikvision device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hikvision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hikvision get() = object {
    /** Hikvision DS_D5C75RB_A */
    val DS_D5C75RB_A = "spec:width=2160,height=3840,unit=px,dpi=640"

    /** Hikvision DS-MDT202 */
    val DS_MDT202 = "spec:width=720,height=1440,unit=px,dpi=320"

}
