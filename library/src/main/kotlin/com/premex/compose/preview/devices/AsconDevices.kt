package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ascon device specifications for Android Compose previews.
 *
 * This extension provides Ascon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ascon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ascon get() = object {
    /** Ascon AT14 */
    val AT14 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
