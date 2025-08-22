package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jusyea device specifications for Android Compose previews.
 *
 * This extension provides Jusyea device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jusyea.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jusyea get() = object {
    /** Jusyea J10_EEA */
    val J10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Jusyea J10_US */
    val J10_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Jusyea J5_EEA */
    val J5_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Jusyea J6_EEA */
    val J6_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Jusyea J8 */
    val J8 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Jusyea J8_EEA */
    val J8_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Jusyea J8_EEA_T */
    val J8_EEA_T = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Jusyea J8_T */
    val J8_T = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Jusyea J9_EEA */
    val J9_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

}
