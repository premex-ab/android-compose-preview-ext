package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Secureye device specifications for Android Compose previews.
 *
 * This extension provides Secureye device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Secureye.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Secureye get() = object {
    /** Secureye  S-SAB220 */
    val S_SAB220 = "spec:width=600,height=1024,unit=px,dpi=160"

}
