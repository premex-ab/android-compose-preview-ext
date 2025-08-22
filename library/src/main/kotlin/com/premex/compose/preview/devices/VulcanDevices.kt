package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vulcan device specifications for Android Compose previews.
 *
 * This extension provides Vulcan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vulcan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vulcan get() = object {
    /** Vulcan Eternity_G57 */
    val ETERNITY_G57 = "spec:width=720,height=1440,unit=px,dpi=320"

}
