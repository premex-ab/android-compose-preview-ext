package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ziovo device specifications for Android Compose previews.
 *
 * This extension provides Ziovo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ziovo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ziovo get() = object {
    /** Ziovo Z118-EEA */
    val Z118_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ziovo Z118-U-EEA */
    val Z118_U_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ziovo Z118-US */
    val Z118_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ziovo Z118-U-US */
    val Z118_U_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ziovo Z128_EEA */
    val Z128_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Ziovo Z128_T_EEA */
    val Z128_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ziovo Z128_T_US */
    val Z128_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ziovo Z128_US */
    val Z128_US = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Ziovo Z138_EEA */
    val Z138_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ziovo Z138_US */
    val Z138_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ziovo Z168_EEA */
    val Z168_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ziovo Z168_U_EEA */
    val Z168_U_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ziovo Z168_US */
    val Z168_US = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ziovo Z168_U_US */
    val Z168_U_US = "spec:width=800,height=1280,unit=px,dpi=160"

}
