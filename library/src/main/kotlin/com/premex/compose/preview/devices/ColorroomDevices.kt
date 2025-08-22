package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Colorroom device specifications for Android Compose previews.
 *
 * This extension provides Colorroom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Colorroom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Colorroom get() = object {
    /** Colorroom A30_Plus */
    val A30_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom A5 */
    val A5 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom C1 */
    val C1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom C10_ROW */
    val C10_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom C2 */
    val C2 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Colorroom C20 */
    val C20 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Colorroom C30_Pro */
    val C30_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom C3_Pro_EEA */
    val C3_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom C3_Pro_ROW */
    val C3_PRO_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom C3_ROW */
    val C3_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom C5 */
    val C5 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom C5_EEA */
    val C5_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom C5_Pro */
    val C5_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom E07 */
    val E07 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Colorroom  E20_EEA  */
    val E20_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Colorroom E20_ROW */
    val E20_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Colorroom E30_Pro */
    val E30_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom E5 */
    val E5 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom K07-pro */
    val K07_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Colorroom K10 */
    val K10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom K10C */
    val K10C = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom K12 */
    val K12 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Colorroom K12E */
    val K12E = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Colorroom K12-EEA */
    val K12_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Colorroom K12E_EEA */
    val K12E_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Colorroom K12E_ROW */
    val K12E_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Colorroom T30E */
    val T30E = "spec:width=800,height=1280,unit=px,dpi=213"

}
