package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yumkem device specifications for Android Compose previews.
 *
 * This extension provides Yumkem device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yumkem.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yumkem get() = object {
    /** Yumkem N10-EEA */
    val N10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Yumkem U221 */
    val U221 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yumkem U221-EEA */
    val U221_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yumkem U320 */
    val U320 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Yumkem U320-EEA */
    val U320_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

}
