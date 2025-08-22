package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Excotek device specifications for Android Compose previews.
 *
 * This extension provides Excotek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Excotek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Excotek get() = object {
    /** Excotek X20-T616 */
    val X20_T616 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
