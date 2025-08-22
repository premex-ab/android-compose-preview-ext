package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Anya device specifications for Android Compose previews.
 *
 * This extension provides Anya device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Anya.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Anya get() = object {
    /** Anya Anya_S558 */
    val ANYA_S558 = "spec:width=480,height=960,unit=px,dpi=220"

}
