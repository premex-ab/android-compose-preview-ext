package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ark device specifications for Android Compose previews.
 *
 * This extension provides Ark device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ark.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ark get() = object {
    /** Ark Benefit_M9 */
    val BENEFIT_M9 = "spec:width=720,height=1440,unit=px,dpi=320"

}
