package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Syco device specifications for Android Compose previews.
 *
 * This extension provides Syco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Syco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Syco get() = object {
    /** Syco RS-403_EEA */
    val RS_403_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Syco  RS-442_EEA */
    val RS_442_EEA = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Syco SYCO RS-404 */
    val SYCO_RS_404 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Syco SYCO_RT-401 */
    val SYCO_RT_401 = "spec:width=800,height=1280,unit=px,dpi=213"

}
