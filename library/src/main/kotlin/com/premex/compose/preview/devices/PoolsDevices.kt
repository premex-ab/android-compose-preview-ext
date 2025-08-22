package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pools device specifications for Android Compose previews.
 *
 * This extension provides Pools device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pools.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pools get() = object {
    /** Pools POOLS The DOLLAR */
    val POOLS_THE_DOLLAR = "spec:width=1080,height=2220,unit=px,dpi=440"

}
