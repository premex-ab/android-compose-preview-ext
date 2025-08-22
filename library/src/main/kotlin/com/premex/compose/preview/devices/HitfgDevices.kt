package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hitfg device specifications for Android Compose previews.
 *
 * This extension provides Hitfg device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hitfg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hitfg get() = object {
    /** Hitfg Boost Max */
    val BOOST_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

}
