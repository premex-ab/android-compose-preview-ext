package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Senwa device specifications for Android Compose previews.
 *
 * This extension provides Senwa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Senwa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Senwa get() = object {
    /** Senwa LS5018FP */
    val LS5018FP = "spec:width=480,height=960,unit=px,dpi=213"

    /** Senwa LS5518H */
    val LS5518H = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Senwa LS5718 */
    val LS5718 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Senwa Senwa_LS5018F */
    val SENWA_LS5018F = "spec:width=480,height=960,unit=px,dpi=240"

    /** Senwa Senwa_S40 */
    val SENWA_S40 = "spec:width=480,height=800,unit=px,dpi=220"

}
