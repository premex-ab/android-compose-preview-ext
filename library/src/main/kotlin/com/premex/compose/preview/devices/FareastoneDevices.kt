package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fareastone device specifications for Android Compose previews.
 *
 * This extension provides Fareastone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fareastone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fareastone get() = object {
    /** Fareastone Smart 509 */
    val SMART_509 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Fareastone Smart 550 */
    val SMART_550 = "spec:width=720,height=1280,unit=px,dpi=320"

}
