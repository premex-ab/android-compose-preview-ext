package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mitac device specifications for Android Compose previews.
 *
 * This extension provides Mitac device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mitac.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mitac get() = object {
    /** Mitac  hera_pro_eea  */
    val HERA_PRO_EEA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Mitac N630 */
    val N630 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mitac N635 */
    val N635 = "spec:width=600,height=1024,unit=px,dpi=160"

}
