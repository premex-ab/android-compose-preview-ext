package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cvte device specifications for Android Compose previews.
 *
 * This extension provides Cvte device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cvte.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cvte get() = object {
    /** Cvte CVTE SA12 */
    val CVTE_SA12 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
