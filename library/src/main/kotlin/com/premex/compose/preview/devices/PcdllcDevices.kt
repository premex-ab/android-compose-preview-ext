package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pcdllc device specifications for Android Compose previews.
 *
 * This extension provides Pcdllc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pcdllc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pcdllc get() = object {
    /** Pcdllc Bengal Max */
    val BENGAL_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Pcdllc P65 */
    val P65 = "spec:width=720,height=1600,unit=px,dpi=320"

}
