package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Verizonwireless device specifications for Android Compose previews.
 *
 * This extension provides Verizonwireless device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Verizonwireless.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Verizonwireless get() = object {
    /** Verizonwireless 5059S */
    val _5059S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Verizonwireless Ellipsis 10 */
    val ELLIPSIS_10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Verizonwireless Ellipsis ® 10 HD */
    val ELLIPSIS_10_HD = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Verizonwireless Ellipsis 7 (QMV7A) */
    val ELLIPSIS_7_QMV7A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Verizonwireless Ellipsis 8 */
    val ELLIPSIS_8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Verizonwireless Ellipsis 8 HD */
    val ELLIPSIS_8_HD = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Verizonwireless Gizo Tab */
    val GIZO_TAB = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Verizonwireless QTAQZ3KID */
    val QTAQZ3KID = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Verizonwireless TCL TAB Pro 5G */
    val TCL_TAB_PRO_5G = "spec:width=1200,height=2000,unit=px,dpi=320"

}
