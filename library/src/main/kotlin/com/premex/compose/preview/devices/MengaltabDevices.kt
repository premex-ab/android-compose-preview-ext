package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mengaltab device specifications for Android Compose previews.
 *
 * This extension provides Mengaltab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mengaltab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mengaltab get() = object {
    /** Mengaltab ANZATECH */
    val ANZATECH = "spec:width=600,height=1024,unit=px,dpi=160"

}
