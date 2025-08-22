package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Goodtel device specifications for Android Compose previews.
 *
 * This extension provides Goodtel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Goodtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Goodtel get() = object {
    /** Goodtel G10_EEA */
    val G10_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Goodtel G10_T_EEA */
    val G10_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Goodtel G10_T_US */
    val G10_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Goodtel G10_US */
    val G10_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Goodtel G2_A_EEA */
    val G2_A_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Goodtel G2_T_EEA */
    val G2_T_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Goodtel G2_T_US */
    val G2_T_US = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Goodtel G3 */
    val G3 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Goodtel G3_US */
    val G3_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Goodtel G7 */
    val G7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Goodtel G7_EEA */
    val G7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Goodtel G7_EEA_T */
    val G7_EEA_T = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Goodtel G7_T */
    val G7_T = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Goodtel G9_EEA */
    val G9_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Goodtel G9_US */
    val G9_US = "spec:width=1200,height=2000,unit=px,dpi=240"

}
