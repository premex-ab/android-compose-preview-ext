package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Advan device specifications for Android Compose previews.
 *
 * This extension provides Advan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Advan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Advan get() = object {
    /** Advan ADVANNASAPro */
    val ADVANNASAPRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Advan ADVAN_X1 */
    val ADVAN_X1 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Advan Sketsa3 */
    val SKETSA3 = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Advan TAB A8 */
    val TAB_A8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Advan VX_LITE */
    val VX_LITE = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Advan VX NEO */
    val VX_NEO = "spec:width=800,height=1280,unit=px,dpi=320"

}
