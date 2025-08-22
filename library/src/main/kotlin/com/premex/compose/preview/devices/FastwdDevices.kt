package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fastwd device specifications for Android Compose previews.
 *
 * This extension provides Fastwd device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fastwd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fastwd get() = object {
    /** Fastwd L231 */
    val L231 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Fastwd L231-EEA */
    val L231_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Fastwd L251-EEA */
    val L251_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Fastwd M20L */
    val M20L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Fastwd M518-EEA */
    val M518_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Fastwd Tablet */
    val TABLET = "spec:width=1200,height=2000,unit=px,dpi=240"

}
