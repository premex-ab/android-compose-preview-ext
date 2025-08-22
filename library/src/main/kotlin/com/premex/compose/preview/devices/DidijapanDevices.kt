package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Didijapan device specifications for Android Compose previews.
 *
 * This extension provides Didijapan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Didijapan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Didijapan get() = object {
    /** Didijapan DDT-001 */
    val DDT_001 = "spec:width=720,height=1280,unit=px,dpi=240"

}
