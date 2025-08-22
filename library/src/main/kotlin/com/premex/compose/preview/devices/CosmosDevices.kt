package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cosmos device specifications for Android Compose previews.
 *
 * This extension provides Cosmos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cosmos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cosmos get() = object {
    /** Cosmos  Aries_8in */
    val ARIES_8IN = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Cosmos Lynx_10in */
    val LYNX_10IN = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Cosmos Nova_10in */
    val NOVA_10IN = "spec:width=800,height=1280,unit=px,dpi=213"

}
