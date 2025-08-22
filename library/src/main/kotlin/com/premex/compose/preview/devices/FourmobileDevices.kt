package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fourmobile device specifications for Android Compose previews.
 *
 * This extension provides Fourmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fourmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fourmobile get() = object {
    /** Fourmobile S186_Sky_3 */
    val S186_SKY_3 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Fourmobile S710 Ruby */
    val S710_RUBY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Fourmobile Sapphire */
    val SAPPHIRE = "spec:width=1080,height=2160,unit=px,dpi=480"

}
