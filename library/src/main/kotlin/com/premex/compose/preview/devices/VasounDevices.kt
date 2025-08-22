package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vasoun device specifications for Android Compose previews.
 *
 * This extension provides Vasoun device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vasoun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vasoun get() = object {
    /** Vasoun L10_A01 */
    val L10_A01 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vasoun L10_A01_EEA */
    val L10_A01_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vasoun L10_A02 */
    val L10_A02 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vasoun L10_A03 */
    val L10_A03 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vasoun L10_A03_EEA */
    val L10_A03_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vasoun L10_A05 */
    val L10_A05 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vasoun L10_A05_EEA */
    val L10_A05_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vasoun L10-T02 */
    val L10_T02 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Vasoun L10-T02-EEA */
    val L10_T02_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Vasoun L10_T05 */
    val L10_T05 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Vasoun L10_T05_EEA */
    val L10_T05_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Vasoun L10_T06 */
    val L10_T06 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Vasoun L10_T06_EEA */
    val L10_T06_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Vasoun L10_T08 */
    val L10_T08 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Vasoun L10_T08_EEA */
    val L10_T08_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Vasoun L10_T10 */
    val L10_T10 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Vasoun L10_T10_EEA */
    val L10_T10_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Vasoun L10-T11 */
    val L10_T11 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Vasoun L10-T11-EEA */
    val L10_T11_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Vasoun M7 */
    val M7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vasoun M7_EEA */
    val M7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vasoun TAB12 */
    val TAB12 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Vasoun TAB12_EEA */
    val TAB12_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

}
