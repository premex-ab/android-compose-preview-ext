package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pritom device specifications for Android Compose previews.
 *
 * This extension provides Pritom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pritom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pritom get() = object {
    /** Pritom 1AZ2P_eea */
    val _1AZ2P_EEA = "spec:width=1080,height=1920,unit=px,dpi=280"

    /** Pritom K7 */
    val K7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom K7_A101 */
    val K7_A101 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom K7_A101_EEA */
    val K7_A101_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom K7_A102 */
    val K7_A102 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom K7Pro */
    val K7PRO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom K7Pro_EEA */
    val K7PRO_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom L10 */
    val L10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom L10_EEA */
    val L10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom L10_T07 */
    val L10_T07 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Pritom L10_T13 */
    val L10_T13 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8 */
    val L8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8_A01 */
    val L8_A01 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8_B01 */
    val L8_B01 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8_B02 */
    val L8_B02 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8_B02_EEA */
    val L8_B02_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8_B03 */
    val L8_B03 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8_C01 */
    val L8_C01 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8_C01_EEA */
    val L8_C01_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8_C02 */
    val L8_C02 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8_C02_EEA */
    val L8_C02_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8_EEA */
    val L8_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8_PRO */
    val L8_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8_PRO_EEA */
    val L8_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom L8-T01 */
    val L8_T01 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10 */
    val M10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10 */
    val M10_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_A01_EEA */
    val M10_A01_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_Air_EEA */
    val M10_AIR_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_B01 */
    val M10_B01 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_B01_EEA */
    val M10_B01_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_B05 */
    val M10_B05 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_B05_EEA */
    val M10_B05_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_B06 */
    val M10_B06 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_C01 */
    val M10_C01 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_C01_EEA */
    val M10_C01_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_C02 */
    val M10_C02 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_C02_EEA */
    val M10_C02_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_C03 */
    val M10_C03 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_C03_EEA */
    val M10_C03_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_C04 */
    val M10_C04 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_C04_EEA */
    val M10_C04_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_C05 */
    val M10_C05 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_C05_EEA */
    val M10_C05_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pritom M10_C05_Kids */
    val M10_C05_KIDS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_C06_Kids */
    val M10_C06_KIDS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_C07 */
    val M10_C07 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_Lite */
    val M10_LITE = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Pritom M10_Max */
    val M10_MAX = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Pritom M10_Max_EEA */
    val M10_MAX_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Pritom M10_PLUS_EEA */
    val M10_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_PRO */
    val M10_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_PRO_EEA */
    val M10_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_R01 */
    val M10_R01 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_R01_EEA */
    val M10_R01_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_R02 */
    val M10_R02 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_R02_EEA */
    val M10_R02_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_R03 */
    val M10_R03 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M10_R04 */
    val M10_R04 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M20 */
    val M20 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pritom M30 */
    val M30 = "spec:width=800,height=1280,unit=px,dpi=190"

    /** Pritom M30_EEA */
    val M30_EEA = "spec:width=800,height=1280,unit=px,dpi=190"

    /** Pritom P7 */
    val P7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom P7_A03 */
    val P7_A03 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom P7_A04 */
    val P7_A04 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom P7_A05 */
    val P7_A05 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom P7_A07 */
    val P7_A07 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom P7_EEA */
    val P7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom P7PLUS */
    val P7PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Pritom P7PLUS_EEA */
    val P7PLUS_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Pritom P7PRO */
    val P7PRO = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Pritom P7PRO_EEA */
    val P7PRO_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pritom S84 */
    val S84 = "spec:width=480,height=960,unit=px,dpi=198"

}
