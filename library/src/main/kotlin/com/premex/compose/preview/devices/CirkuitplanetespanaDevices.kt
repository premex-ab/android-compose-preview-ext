package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cirkuitplanetespana device specifications for Android Compose previews.
 *
 * This extension provides Cirkuitplanetespana device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cirkuitplanetespana.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cirkuitplanetespana get() = object {
    /** Cirkuitplanetespana SMARTLIFE */
    val SMARTLIFE = "spec:width=800,height=1280,unit=px,dpi=160"

}
