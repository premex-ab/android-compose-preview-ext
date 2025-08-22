package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Digicel device specifications for Android Compose previews.
 *
 * This extension provides Digicel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Digicel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Digicel get() = object {
    /** Digicel Digicel DL4 */
    val DIGICEL_DL4 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Digicel Digi K1 */
    val DIGI_K1 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Digicel DL3 */
    val DL3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Digicel DL3Plus */
    val DL3PLUS = "spec:width=720,height=1520,unit=px,dpi=360"

    /** Digicel DL3PlusPro */
    val DL3PLUSPRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Digicel DL4_Plus */
    val DL4_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Digicel DL4s_TC */
    val DL4S_TC = "spec:width=480,height=960,unit=px,dpi=200"

    /** Digicel DL5_Pro  */
    val DL5_PRO = "spec:width=480,height=960,unit=px,dpi=213"

}
