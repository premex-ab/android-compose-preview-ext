package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Unowhy device specifications for Android Compose previews.
 *
 * This extension provides Unowhy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Unowhy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Unowhy get() = object {
    /** Unowhy QOOQ */
    val QOOQ = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Unowhy S10G001S4M_EEA */
    val S10G001S4M_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Unowhy SQOOL-V4 */
    val SQOOL_V4 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Unowhy UNOWHY */
    val UNOWHY = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Unowhy UNOWHY */
    val UNOWHY_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Unowhy Y10G001S4M_EEA */
    val Y10G001S4M_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Unowhy Y10G007S4M_EEA */
    val Y10G007S4M_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Unowhy Y10G007S4MI_EEA */
    val Y10G007S4MI_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Unowhy Y10_Premium */
    val Y10_PREMIUM = "spec:width=1200,height=1920,unit=px,dpi=240"

}
