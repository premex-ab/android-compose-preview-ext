package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vankyo device specifications for Android Compose previews.
 *
 * This extension provides Vankyo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vankyo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vankyo get() = object {
    /** Vankyo MatrixPad-X36 */
    val MATRIXPAD_X36 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vankyo P10 */
    val P10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vankyo P31 */
    val P31 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Vankyo P31-E */
    val P31_E = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Vankyo P40 */
    val P40 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Vankyo QTAB1010X */
    val QTAB1010X = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vankyo S10 */
    val S10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vankyo S10_EEA */
    val S10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vankyo S10_ROW */
    val S10_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vankyo S20 */
    val S20 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Vankyo S20_2020 */
    val S20_2020 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Vankyo S20_EEA */
    val S20_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Vankyo S21 */
    val S21 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vankyo S30 */
    val S30 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Vankyo S30_EEA */
    val S30_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Vankyo S7 */
    val S7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vankyo S7_EEA */
    val S7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vankyo s8 */
    val S8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vankyo S8_EEA */
    val S8_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vankyo Vankyo_S10 */
    val VANKYO_S10 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Vankyo Vankyo_S10_EEA */
    val VANKYO_S10_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Vankyo VANKYO_S7 */
    val VANKYO_S7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vankyo VANKYO_S7_EEA */
    val VANKYO_S7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vankyo VANKYO_S8 */
    val VANKYO_S8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vankyo VANKYO_S8_EEA */
    val VANKYO_S8_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vankyo Z1 */
    val Z1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vankyo Z10 */
    val Z10 = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Vankyo Z1_EEA */
    val Z1_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vankyo Z4 */
    val Z4 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vankyo Z4_EEA */
    val Z4_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
