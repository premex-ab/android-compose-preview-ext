package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Daria device specifications for Android Compose previews.
 *
 * This extension provides Daria device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Daria.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Daria get() = object {
    /** Daria hormoz */
    val HORMOZ = "spec:width=1220,height=2712,unit=px,dpi=480"

    /** Daria qoqnoos */
    val QOQNOOS = "spec:width=1080,height=2436,unit=px,dpi=440"

    /** Daria zahedan */
    val ZAHEDAN = "spec:width=1080,height=2400,unit=px,dpi=440"

}
