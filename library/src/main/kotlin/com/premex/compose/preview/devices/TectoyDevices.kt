package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tectoy device specifications for Android Compose previews.
 *
 * This extension provides Tectoy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tectoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tectoy get() = object {
    /** Tectoy TECTOY ON 128GB */
    val TECTOY_ON_128GB = "spec:width=720,height=1520,unit=px,dpi=320"

}
