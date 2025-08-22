package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hellopro device specifications for Android Compose previews.
 *
 * This extension provides Hellopro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hellopro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hellopro get() = object {
    /** Hellopro PK81R */
    val PK81R = "spec:width=800,height=1280,unit=px,dpi=213"

}
