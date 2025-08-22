package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Byjus device specifications for Android Compose previews.
 *
 * This extension provides Byjus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Byjus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Byjus get() = object {
    /** Byjus LRN10 */
    val LRN10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Byjus LRNS10GIL0 */
    val LRNS10GIL0 = "spec:width=800,height=1280,unit=px,dpi=160"

}
