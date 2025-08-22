package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sebbe device specifications for Android Compose previews.
 *
 * This extension provides Sebbe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sebbe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sebbe get() = object {
    /** Sebbe S21_EEA */
    val S21_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Sebbe S22_EEA */
    val S22_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sebbe S22-EEA */
    val S22_EEA_800X1280 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Sebbe S22_T_EEA */
    val S22_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sebbe S22_T_US */
    val S22_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sebbe S23_EEA */
    val S23_EEA = "spec:width=800,height=1332,unit=px,dpi=160"

    /** Sebbe S23_EEA_A */
    val S23_EEA_A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sebbe S23_T_EEA */
    val S23_T_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Sebbe S23_T_US */
    val S23_T_US = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Sebbe S23_US */
    val S23_US = "spec:width=800,height=1332,unit=px,dpi=160"

    /** Sebbe S23_US_B */
    val S23_US_B = "spec:width=800,height=1280,unit=px,dpi=160"

}
