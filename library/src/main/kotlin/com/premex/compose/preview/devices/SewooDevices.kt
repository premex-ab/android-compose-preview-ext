package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sewoo device specifications for Android Compose previews.
 *
 * This extension provides Sewoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sewoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sewoo get() = object {
    /** Sewoo NBP_65 */
    val NBP_65 = "spec:width=720,height=1280,unit=px,dpi=320"

}
