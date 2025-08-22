package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sencor device specifications for Android Compose previews.
 *
 * This extension provides Sencor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sencor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sencor get() = object {
    /** Sencor 10_1Q205 */
    val _10_1Q205 = "spec:width=800,height=1280,unit=px,dpi=213"

}
