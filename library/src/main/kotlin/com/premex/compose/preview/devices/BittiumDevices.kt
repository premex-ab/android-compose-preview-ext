package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bittium device specifications for Android Compose previews.
 *
 * This extension provides Bittium device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bittium.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bittium get() = object {
    /** Bittium Bittium Tough Mobile 2 */
    val BITTIUM_TOUGH_MOBILE_2 = "spec:width=1080,height=1920,unit=px,dpi=420"

}
