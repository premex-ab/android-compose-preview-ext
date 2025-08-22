package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ordissimo device specifications for Android Compose previews.
 *
 * This extension provides Ordissimo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ordissimo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ordissimo get() = object {
    /** Ordissimo Celia */
    val CELIA = "spec:width=1200,height=1920,unit=px,dpi=272"

    /** Ordissimo LeNumero2Mini EEA */
    val LENUMERO2MINI_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ordissimo Ordissimo LeNumero2 */
    val ORDISSIMO_LENUMERO2 = "spec:width=1080,height=2340,unit=px,dpi=480"

}
