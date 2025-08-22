package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Globalsec device specifications for Android Compose previews.
 *
 * This extension provides Globalsec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Globalsec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Globalsec get() = object {
    /** Globalsec  BW819E_CR  */
    val BW819E_CR = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Globalsec BW819E_SK */
    val BW819E_SK = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Globalsec TAB_TEN */
    val TAB_TEN = "spec:width=1200,height=1920,unit=px,dpi=280"

}
