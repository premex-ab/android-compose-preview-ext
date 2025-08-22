package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Phoenixnote device specifications for Android Compose previews.
 *
 * This extension provides Phoenixnote device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Phoenixnote.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Phoenixnote get() = object {
    /** Phoenixnote PPS2022-P156 */
    val PPS2022_P156 = "spec:width=1080,height=1920,unit=px,dpi=160"

}
