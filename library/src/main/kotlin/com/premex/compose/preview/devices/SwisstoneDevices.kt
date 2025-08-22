package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Swisstone device specifications for Android Compose previews.
 *
 * This extension provides Swisstone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Swisstone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Swisstone get() = object {
    /** Swisstone swisstone SD 510 */
    val SWISSTONE_SD_510 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Swisstone swisstone SD 530 */
    val SWISSTONE_SD_530 = "spec:width=720,height=1280,unit=px,dpi=320"

}
