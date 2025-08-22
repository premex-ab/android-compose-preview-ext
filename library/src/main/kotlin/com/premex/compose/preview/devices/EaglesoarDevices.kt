package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Eaglesoar device specifications for Android Compose previews.
 *
 * This extension provides Eaglesoar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Eaglesoar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Eaglesoar get() = object {
    /** Eaglesoar E10A_EEA */
    val E10A_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Eaglesoar E-764-EEA */
    val E_764_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Eaglesoar EE1010_EEA */
    val EE1010_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Eaglesoar EE10A */
    val EE10A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Eaglesoar EE-35_EEA */
    val EE_35_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Eaglesoar EE-P30_EEA */
    val EE_P30_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Eaglesoar Z_766_EEA */
    val Z_766_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

}
