package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bergstrom device specifications for Android Compose previews.
 *
 * This extension provides Bergstrom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bergstrom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bergstrom get() = object {
    /** Bergstrom 666770 */
    val _666770 = "spec:width=720,height=1440,unit=px,dpi=360"

    /** Bergstrom H634_BLK */
    val H634_BLK = "spec:width=480,height=854,unit=px,dpi=200"

    /** Bergstrom P187 */
    val P187 = "spec:width=720,height=1440,unit=px,dpi=360"

}
