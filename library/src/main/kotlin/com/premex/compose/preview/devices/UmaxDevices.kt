package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Umax device specifications for Android Compose previews.
 *
 * This extension provides Umax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Umax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Umax get() = object {
    /** Umax 10A_3G */
    val _10A_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umax 10A_LTE_eea */
    val _10A_LTE_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Umax 10C_LTE */
    val _10C_LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Umax 10C-LTE-A11 */
    val _10C_LTE_A11 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Umax 10C-PRO-LTE */
    val _10C_PRO_LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Umax 10L-PLUS */
    val _10L_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Umax 10T-LTE_EEA */
    val _10T_LTE_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Umax 11T-LTE-Pro_EEA */
    val _11T_LTE_PRO_EEA = "spec:width=1200,height=2000,unit=px,dpi=314"

    /** Umax 7A_3G */
    val _7A_3G = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Umax 7A_Plus_eea */
    val _7A_PLUS_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Umax 8A_Plus_eea */
    val _8A_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Umax 8C_LTE */
    val _8C_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umax 8L_PLUS_EEA */
    val _8L_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Umax MediaTek */
    val MEDIATEK = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Umax T8_3G_eea */
    val T8_3G_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Umax VisionBook10Q */
    val VISIONBOOK10Q = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Umax Visionbook_10Q_Pro */
    val VISIONBOOK_10Q_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

}
