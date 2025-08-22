package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iqusz device specifications for Android Compose previews.
 *
 * This extension provides Iqusz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iqusz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iqusz get() = object {
    /** Iqusz  IQUSMARTEASYT10W  */
    val IQUSMARTEASYT10W = "spec:width=800,height=1280,unit=px,dpi=160"

}
