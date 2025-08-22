package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nvidia device specifications for Android Compose previews.
 *
 * This extension provides Nvidia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nvidia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nvidia get() = object {
    /** Nvidia Shield */
    val SHIELD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nvidia SHIELD Tablet */
    val SHIELD_TABLET = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Nvidia TegraNote */
    val TEGRANOTE = "spec:width=800,height=1280,unit=px,dpi=213"

}
