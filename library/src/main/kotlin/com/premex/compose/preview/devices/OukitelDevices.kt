package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Oukitel device specifications for Android Compose previews.
 *
 * This extension provides Oukitel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Oukitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Oukitel get() = object {
    /** Oukitel C10 */
    val C10 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Oukitel C11 */
    val C11 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Oukitel C11 Pro */
    val C11_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel C11 S */
    val C11_S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel C12 */
    val C12 = "spec:width=480,height=996,unit=px,dpi=240"

    /** Oukitel C12 Plus */
    val C12_PLUS = "spec:width=480,height=996,unit=px,dpi=240"

    /** Oukitel C12 Pro */
    val C12_PRO = "spec:width=480,height=996,unit=px,dpi=240"

    /** Oukitel C13 Pro */
    val C13_PRO = "spec:width=480,height=996,unit=px,dpi=240"

    /** Oukitel C15 Pro */
    val C15_PRO = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Oukitel C16 */
    val C16 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Oukitel C16 Pro */
    val C16_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Oukitel C17 Pro */
    val C17_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oukitel C18 Pro */
    val C18_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel C19 */
    val C19 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oukitel C19 Pro */
    val C19_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oukitel C1_Pro_EEA */
    val C1_PRO_EEA = "spec:width=576,height=1280,unit=px,dpi=213"

    /** Oukitel C21 */
    val C21 = "spec:width=1080,height=2310,unit=px,dpi=480"

    /** Oukitel C21_Plus_EEA */
    val C21_PLUS_EEA = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oukitel C21_Pro_EEA */
    val C21_PRO_EEA = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oukitel C22 */
    val C22 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Oukitel C23_Pro */
    val C23_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel C25_RU */
    val C25_RU = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel C31_EEA */
    val C31_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel C31_Pro_EEA */
    val C31_PRO_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel C32_EEA */
    val C32_EEA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Oukitel C33_EEA */
    val C33_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel C35_EEA */
    val C35_EEA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Oukitel C36_U_EEA */
    val C36_U_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Oukitel C37_EEA */
    val C37_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Oukitel C38_EEA */
    val C38_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Oukitel C50_ROW */
    val C50_ROW = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel C51_EEA */
    val C51_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel C53 */
    val C53 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Oukitel C57_Pro_EEA */
    val C57_PRO_EEA = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Oukitel C57_S_EEA */
    val C57_S_EEA = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Oukitel C58_EEA */
    val C58_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel C58_Pro_EEA */
    val C58_PRO_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel C59_Pro_EEA */
    val C59_PRO_EEA = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Oukitel C61_Pro_EEA */
    val C61_PRO_EEA = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Oukitel C65_EEA */
    val C65_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel C65_Pro_EEA */
    val C65_PRO_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel C8 */
    val C8 = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Oukitel C8 4G */
    val C8_4G = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Oukitel C9 */
    val C9 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Oukitel G1_EEA */
    val G1_EEA = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Oukitel G2-EEA */
    val G2_EEA = "spec:width=576,height=1152,unit=px,dpi=260"

    /** Oukitel K10 */
    val K10 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Oukitel K10000_Max */
    val K10000_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Oukitel K10000 Mix */
    val K10000_MIX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Oukitel K10000 Pro */
    val K10000_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Oukitel K12 */
    val K12 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Oukitel K13 Pro */
    val K13_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oukitel K15_Plus_RU */
    val K15_PLUS_RU = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel K15_Pro_EEA */
    val K15_PRO_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel K16_EEA */
    val K16_EEA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Oukitel K3 */
    val K3 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Oukitel K3 Pro */
    val K3_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Oukitel K5 */
    val K5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel K5000 */
    val K5000 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel K6 */
    val K6 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Oukitel K6000 Plus */
    val K6000_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Oukitel K7 */
    val K7 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Oukitel K7_Power */
    val K7_POWER = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel K7_Pro */
    val K7_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel K8 */
    val K8 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Oukitel K8000 */
    val K8000 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Oukitel K9 */
    val K9 = "spec:width=1080,height=2244,unit=px,dpi=480"

    /** Oukitel K9 Pro */
    val K9_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Oukitel MIX 2 */
    val MIX_2 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Oukitel OK6000 PLUS */
    val OK6000_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Oukitel OKT1 */
    val OKT1 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Oukitel OKT3 */
    val OKT3 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Oukitel OT11 */
    val OT11 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Oukitel OT12_EEA */
    val OT12_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Oukitel OT5_EEA */
    val OT5_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Oukitel OT5_S_EEA */
    val OT5_S_EEA = "spec:width=1200,height=2000,unit=px,dpi=300"

    /** Oukitel OT6_EEA */
    val OT6_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Oukitel OT6_Kids_EEA */
    val OT6_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Oukitel OT6_Pro_EEA */
    val OT6_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Oukitel OT8_EEA */
    val OT8_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Oukitel OT9 */
    val OT9 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Oukitel OUKITEL_C1_EEA */
    val OUKITEL_C1_EEA = "spec:width=576,height=1280,unit=px,dpi=213"

    /** Oukitel OUKITEL_C59_EEA */
    val OUKITEL_C59_EEA = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Oukitel OUKITEL_C61_EEA */
    val OUKITEL_C61_EEA = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Oukitel OUKITEL_G5_EEA */
    val OUKITEL_G5_EEA = "spec:width=576,height=1152,unit=px,dpi=213"

    /** Oukitel OUKITEL_P1_EEA */
    val OUKITEL_P1_EEA = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Oukitel P07_NFC_EEA */
    val P07_NFC_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Oukitel RT1_EEA */
    val RT1_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Oukitel RT2_EEA */
    val RT2_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Oukitel RT3_Pro_EEA */
    val RT3_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Oukitel RT3_S_EEA */
    val RT3_S_EEA = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Oukitel RT3_T_EEA */
    val RT3_T_EEA = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Oukitel RT5_EEA */
    val RT5_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Oukitel RT6_NFC_EEA */
    val RT6_NFC_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Oukitel RT7_TITAN_EEA */
    val RT7_TITAN_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Oukitel RT8_EEA */
    val RT8_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Oukitel RT9_EEA */
    val RT9_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Oukitel S105B_RU */
    val S105B_RU = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Oukitel S109_RU */
    val S109_RU = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Oukitel S115_EEA */
    val S115_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Oukitel S118_EEA */
    val S118_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel U11_Plus */
    val U11_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Oukitel U18 */
    val U18 = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Oukitel U20_Plus */
    val U20_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Oukitel U22 */
    val U22 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Oukitel U23 */
    val U23 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Oukitel U25 Pro */
    val U25_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Oukitel WP1 */
    val WP1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel WP10 */
    val WP10 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Oukitel WP100_TITAN_EEA */
    val WP100_TITAN_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Oukitel WP12 */
    val WP12 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel WP12_Pro_EEA */
    val WP12_PRO_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel WP13_RU */
    val WP13_RU = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel WP15 */
    val WP15 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel WP15 S */
    val WP15_S = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel WP16_RU */
    val WP16_RU = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oukitel WP17_EEA */
    val WP17_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Oukitel WP18 */
    val WP18 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel WP18_P_R_EEA */
    val WP18_P_R_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel WP19_EEA */
    val WP19_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Oukitel WP19_Pro_EEA */
    val WP19_PRO_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Oukitel WP2 */
    val WP2 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Oukitel WP200_Pro_EEA */
    val WP200_PRO_EEA = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Oukitel WP20_EEA */
    val WP20_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel WP20_Pro_EEA */
    val WP20_PRO_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel WP21_RU */
    val WP21_RU = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Oukitel WP21_U_EEA */
    val WP21_U_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Oukitel WP23 */
    val WP23 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel WP23_Plus_EEA */
    val WP23_PLUS_EEA = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Oukitel WP27_EEA */
    val WP27_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Oukitel WP28_E_EEA */
    val WP28_E_EEA = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Oukitel WP28_S_EEA */
    val WP28_S_EEA = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Oukitel WP300_EEA */
    val WP300_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Oukitel WP30_Pro_EEA */
    val WP30_PRO_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Oukitel WP32_EEA */
    val WP32_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel WP32_Pro_U_EEA */
    val WP32_PRO_U_EEA = "spec:width=576,height=1152,unit=px,dpi=260"

    /** Oukitel WP33_Pro_U_EEA */
    val WP33_PRO_U_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Oukitel WP35_EEA */
    val WP35_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Oukitel WP35_Pro_EEA */
    val WP35_PRO_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Oukitel WP35_S_EEA */
    val WP35_S_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Oukitel WP36_EEA */
    val WP36_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel WP36_Pro_EEA */
    val WP36_PRO_EEA = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Oukitel WP36_U_EEA */
    val WP36_U_EEA = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Oukitel WP38_EEA */
    val WP38_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oukitel WP38_U_EEA */
    val WP38_U_EEA = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Oukitel WP39_EEA */
    val WP39_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Oukitel WP39_Pro_EEA */
    val WP39_PRO_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Oukitel WP5 */
    val WP5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel WP5000 */
    val WP5000 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel WP50_EEA */
    val WP50_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Oukitel WP52_EEA */
    val WP52_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Oukitel WP55_EEA */
    val WP55_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Oukitel WP5 Pro */
    val WP5_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oukitel WP6_EEA */
    val WP6_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Oukitel WP7 */
    val WP7 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Oukitel WP8_Pro */
    val WP8_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oukitel WP9 */
    val WP9 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Oukitel Y1000 */
    val Y1000 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oukitel Y4800_EEA */
    val Y4800_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

}
