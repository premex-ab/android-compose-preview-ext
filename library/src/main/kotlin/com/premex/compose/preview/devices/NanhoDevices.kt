package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nanho device specifications for Android Compose previews.
 *
 * This extension provides Nanho device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nanho.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nanho get() = object {
    /** Nanho F101 */
    val F101 = "spec:width=720,height=1280,unit=px,dpi=320"

}
