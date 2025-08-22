package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ricoh device specifications for Android Compose previews.
 *
 * This extension provides Ricoh device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ricoh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ricoh get() = object {
    /** Ricoh AXX10 */
    val AXX10 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
