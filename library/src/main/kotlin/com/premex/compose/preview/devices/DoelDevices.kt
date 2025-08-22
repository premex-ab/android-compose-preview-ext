package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Doel device specifications for Android Compose previews.
 *
 * This extension provides Doel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Doel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Doel get() = object {
    /** Doel TT 7.0 */
    val TT_7_0 = "spec:width=800,height=1280,unit=px,dpi=320"

}
