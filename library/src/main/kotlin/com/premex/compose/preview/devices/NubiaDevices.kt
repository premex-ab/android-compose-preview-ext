package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nubia device specifications for Android Compose previews.
 *
 * This extension provides Nubia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nubia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nubia get() = object {
    /** Nubia nubia_NB1001 */
    val NUBIA_NB1001 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Nubia NX503A */
    val NX503A = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Nubia REDMAGIC 10 Air */
    val REDMAGIC_10_AIR = "spec:width=1116,height=2480,unit=px,dpi=480"

}
