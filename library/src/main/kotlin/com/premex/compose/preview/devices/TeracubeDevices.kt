package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Teracube device specifications for Android Compose previews.
 *
 * This extension provides Teracube device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Teracube.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Teracube get() = object {
    /** Teracube Teracube 2e */
    val TERACUBE_2E = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Teracube Teracube 2s */
    val TERACUBE_2S = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Teracube Teracube_One */
    val TERACUBE_ONE = "spec:width=1080,height=2280,unit=px,dpi=480"

}
