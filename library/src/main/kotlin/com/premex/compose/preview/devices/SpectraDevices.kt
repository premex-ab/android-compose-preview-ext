package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Spectra device specifications for Android Compose previews.
 *
 * This extension provides Spectra device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Spectra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Spectra get() = object {
    /** Spectra Spectra MobileMapper6 */
    val SPECTRA_MOBILEMAPPER6 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Spectra TAP-POS */
    val TAP_POS = "spec:width=480,height=960,unit=px,dpi=240"

}
