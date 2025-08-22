package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pcsmart device specifications for Android Compose previews.
 *
 * This extension provides Pcsmart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pcsmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pcsmart get() = object {
    /** Pcsmart PCSGOB10LTE-V2 */
    val PCSGOB10LTE_V2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pcsmart PCSGOB10MVA-A */
    val PCSGOB10MVA_A = "spec:width=800,height=1280,unit=px,dpi=160"

}
