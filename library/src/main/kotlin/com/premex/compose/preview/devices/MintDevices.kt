package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mint device specifications for Android Compose previews.
 *
 * This extension provides Mint device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mint.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mint get() = object {
    /** Mint Emerald */
    val EMERALD = "spec:width=480,height=854,unit=px,dpi=240"

    /** Mint Mint Fusion */
    val MINT_FUSION = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mint Mint Triton */
    val MINT_TRITON = "spec:width=1080,height=2220,unit=px,dpi=440"

    /** Mint Pearl_Neo */
    val PEARL_NEO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Mint ULTRAMINTT_X5 */
    val ULTRAMINTT_X5 = "spec:width=720,height=1600,unit=px,dpi=320"

}
