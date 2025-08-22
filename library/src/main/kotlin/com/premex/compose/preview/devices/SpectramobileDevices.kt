package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Spectramobile device specifications for Android Compose previews.
 *
 * This extension provides Spectramobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Spectramobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Spectramobile get() = object {
    /** Spectramobile Spectra J1 */
    val SPECTRA_J1 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Spectramobile Spectra J1 PRO */
    val SPECTRA_J1_PRO = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Spectramobile SpectraTab1 */
    val SPECTRATAB1 = "spec:width=800,height=1280,unit=px,dpi=213"

}
