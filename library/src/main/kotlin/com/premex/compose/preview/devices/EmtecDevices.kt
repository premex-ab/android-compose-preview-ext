package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Emtec device specifications for Android Compose previews.
 *
 * This extension provides Emtec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Emtec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Emtec get() = object {
    /** Emtec PBSKD7001 */
    val PBSKD7001 = "spec:width=600,height=1024,unit=px,dpi=160"

}
