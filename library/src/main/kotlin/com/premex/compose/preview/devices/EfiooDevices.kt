package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Efioo device specifications for Android Compose previews.
 *
 * This extension provides Efioo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Efioo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Efioo get() = object {
    /** Efioo efiootabn7a */
    val EFIOOTABN7A = "spec:width=600,height=1024,unit=px,dpi=213"

}
