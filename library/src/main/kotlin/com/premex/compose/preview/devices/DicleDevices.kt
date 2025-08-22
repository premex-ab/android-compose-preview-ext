package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dicle device specifications for Android Compose previews.
 *
 * This extension provides Dicle device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dicle.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dicle get() = object {
    /** Dicle DicleTab iPlay40 Pro */
    val DICLETAB_IPLAY40_PRO = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Dicle Dicle Tab Kpad */
    val DICLE_TAB_KPAD = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Dicle Dicle Tab Lite 10.5 M */
    val DICLE_TAB_LITE_10_5_M = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Dicle DTABC2 */
    val DTABC2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dicle DTABPLUS */
    val DTABPLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

}
