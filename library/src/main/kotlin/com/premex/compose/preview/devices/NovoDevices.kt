package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Novo device specifications for Android Compose previews.
 *
 * This extension provides Novo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Novo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Novo get() = object {
    /** Novo Bonvi Pro */
    val BONVI_PRO = "spec:width=1080,height=2220,unit=px,dpi=440"

}
