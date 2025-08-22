package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ibridge device specifications for Android Compose previews.
 *
 * This extension provides Ibridge device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ibridge.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ibridge get() = object {
    /** Ibridge South Korea */
    val SOUTH_KOREA = "spec:width=1200,height=2000,unit=px,dpi=240"

}
