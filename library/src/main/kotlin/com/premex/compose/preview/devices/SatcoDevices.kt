package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Satco device specifications for Android Compose previews.
 *
 * This extension provides Satco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Satco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Satco get() = object {
    /** Satco SATCO_Y-20 */
    val SATCO_Y_20 = "spec:width=720,height=1520,unit=px,dpi=320"

}
