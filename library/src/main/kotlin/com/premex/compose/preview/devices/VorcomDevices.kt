package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vorcom device specifications for Android Compose previews.
 *
 * This extension provides Vorcom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vorcom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vorcom get() = object {
    /** Vorcom AVALON */
    val AVALON = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Vorcom QuartzLITE */
    val QUARTZLITE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vorcom QuartzPRO */
    val QUARTZPRO = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Vorcom S12_classic */
    val S12_CLASSIC = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vorcom S7-classic */
    val S7_CLASSIC = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vorcom S7-classic-10 */
    val S7_CLASSIC_10 = "spec:width=600,height=1022,unit=px,dpi=160"

    /** Vorcom S8Pro */
    val S8PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vorcom SXPRO_classic */
    val SXPRO_CLASSIC = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vorcom ULTRAPAD */
    val ULTRAPAD = "spec:width=1200,height=2000,unit=px,dpi=280"

}
