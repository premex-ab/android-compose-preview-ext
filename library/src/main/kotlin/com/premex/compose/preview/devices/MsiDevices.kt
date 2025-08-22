package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Msi device specifications for Android Compose previews.
 *
 * This extension provides Msi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Msi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Msi get() = object {
    /** Msi ND52-Gen2 */
    val ND52_GEN2 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
