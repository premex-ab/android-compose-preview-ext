package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bmpro device specifications for Android Compose previews.
 *
 * This extension provides Bmpro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bmpro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bmpro get() = object {
    /** Bmpro BMPRO7DI */
    val BMPRO7DI = "spec:width=600,height=1024,unit=px,dpi=160"

}
