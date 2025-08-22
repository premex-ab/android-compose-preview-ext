package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Camfone device specifications for Android Compose previews.
 *
 * This extension provides Camfone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Camfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Camfone get() = object {
    /** Camfone Hero_13 */
    val HERO_13 = "spec:width=240,height=282,unit=px,dpi=120"

    /** Camfone Honey_Y2s */
    val HONEY_Y2S = "spec:width=720,height=1520,unit=px,dpi=320"

}
