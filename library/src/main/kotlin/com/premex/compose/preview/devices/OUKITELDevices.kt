package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OUKITEL device specifications for Android Compose previews.
 *
 * This extension provides OUKITEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OUKITEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OUKITEL: Any
  get() = object {
      /** OUKITEL C10 */
      val C10 = "spec:width=480,height=960,unit=px,dpi=240"

      /** OUKITEL C11 */
      val C11 = "spec:width=480,height=960,unit=px,dpi=240"

      /** OUKITEL C11_Pro */
      val C11_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL C11_S */
      val C11_S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL C12 */
      val C12 = "spec:width=480,height=996,unit=px,dpi=240"

      /** OUKITEL C12_Plus */
      val C12_PLUS = "spec:width=480,height=996,unit=px,dpi=240"

      /** OUKITEL C12_Pro */
      val C12_PRO = "spec:width=480,height=996,unit=px,dpi=240"

      /** OUKITEL C13_Pro */
      val C13_PRO = "spec:width=480,height=996,unit=px,dpi=240"

      /** OUKITEL C15_Pro */
      val C15_PRO = "spec:width=600,height=1280,unit=px,dpi=240"

      /** OUKITEL C16 */
      val C16 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** OUKITEL C16_Pro */
      val C16_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** OUKITEL C17_Pro */
      val C17_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OUKITEL C18_Pro */
      val C18_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL C19 */
      val C19 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OUKITEL C19_Pro */
      val C19_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OUKITEL C1_Pro */
      val C1_PRO = "spec:width=576,height=1280,unit=px,dpi=213"

      /** OUKITEL C21 */
      val C21 = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** OUKITEL C21_Plus */
      val C21_PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OUKITEL C21_Pro */
      val C21_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OUKITEL C22 */
      val C22 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** OUKITEL C23_Pro */
      val C23_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL C25 */
      val C25 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL C31 */
      val C31 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL C31_Pro */
      val C31_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL C32 */
      val C32 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OUKITEL C33 */
      val C33 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL C35 */
      val C35 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OUKITEL C36 */
      val C36 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** OUKITEL C37 */
      val C37 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** OUKITEL C38 */
      val C38 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** OUKITEL C50 */
      val C50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL C51 */
      val C51 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL C53 */
      val C53 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** OUKITEL C57_Pro */
      val C57_PRO = "spec:width=576,height=1280,unit=px,dpi=240"

      /** OUKITEL C57_S */
      val C57_S = "spec:width=576,height=1280,unit=px,dpi=240"

      /** OUKITEL C58 */
      val C58 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL C58_Pro */
      val C58_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL C59_Pro */
      val C59_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** OUKITEL C61_Pro */
      val C61_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** OUKITEL C65 */
      val C65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL C65_Pro */
      val C65_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL C8 */
      val C8 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** OUKITEL C8_4G */
      val C8_4G = "spec:width=640,height=1280,unit=px,dpi=320"

      /** OUKITEL C9 */
      val C9 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** OUKITEL G1 */
      val G1 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** OUKITEL G2 */
      val G2 = "spec:width=576,height=1152,unit=px,dpi=260"

      /** OUKITEL K10 */
      val K10 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** OUKITEL K10000_Max */
      val K10000_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OUKITEL K10000_Mix */
      val K10000_MIX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** OUKITEL K10000_Pro */
      val K10000_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OUKITEL K12 */
      val K12 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** OUKITEL K13_Pro */
      val K13_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OUKITEL K15_Plus */
      val K15_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL K15_Pro */
      val K15_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL K16 */
      val K16 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** OUKITEL K3 */
      val K3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OUKITEL K3_Pro */
      val K3_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OUKITEL K5 */
      val K5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL K5000 */
      val K5000 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL K6 */
      val K6 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** OUKITEL K6000_Plus */
      val K6000_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OUKITEL K7_Power */
      val K7_POWER = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL K7_Pro */
      val K7_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL K8 */
      val K8 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** OUKITEL K8000 */
      val K8000 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** OUKITEL K9 */
      val K9 = "spec:width=1080,height=2244,unit=px,dpi=480"

      /** OUKITEL K9_Pro */
      val K9_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** OUKITEL MIX_2 */
      val MIX_2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** OUKITEL OK6000_Plus */
      val OK6000_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OUKITEL OKT1 */
      val OKT1 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** OUKITEL OKT3 */
      val OKT3 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** OUKITEL OT11 */
      val OT11 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** OUKITEL OT12 */
      val OT12 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** OUKITEL OT5 */
      val OT5 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** OUKITEL OT5_S */
      val OT5_S = "spec:width=1200,height=2000,unit=px,dpi=300"

      /** OUKITEL OT6 */
      val OT6 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** OUKITEL OT6_Kids */
      val OT6_KIDS = "spec:width=800,height=1280,unit=px,dpi=180"

      /** OUKITEL OT6_Pro */
      val OT6_PRO = "spec:width=800,height=1280,unit=px,dpi=180"

      /** OUKITEL OT8 */
      val OT8 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** OUKITEL OT9 */
      val OT9 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** OUKITEL OUKITEL_C1 */
      val OUKITEL_C1 = "spec:width=576,height=1280,unit=px,dpi=213"

      /** OUKITEL OUKITEL_C59 */
      val OUKITEL_C59 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** OUKITEL OUKITEL_C61 */
      val OUKITEL_C61 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** OUKITEL OUKITEL_G5 */
      val OUKITEL_G5 = "spec:width=576,height=1152,unit=px,dpi=213"

      /** OUKITEL OUKITEL_K7 */
      val OUKITEL_K7 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** OUKITEL OUKITEL_P1 */
      val OUKITEL_P1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** OUKITEL OUKITEL_WP1 */
      val OUKITEL_WP1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL OUKITEL_WP36 */
      val OUKITEL_WP36 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** OUKITEL OUKITEL_WP38 */
      val OUKITEL_WP38 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** OUKITEL P07 */
      val P07 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** OUKITEL RT1 */
      val RT1 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** OUKITEL RT2 */
      val RT2 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** OUKITEL RT3 */
      val RT3 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** OUKITEL RT3_EEA */
      val RT3_EEA = "spec:width=800,height=1280,unit=px,dpi=240"

      /** OUKITEL RT3_Pro */
      val RT3_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** OUKITEL RT5 */
      val RT5 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** OUKITEL RT6 */
      val RT6 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** OUKITEL RT7_TITAN */
      val RT7_TITAN = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** OUKITEL RT8 */
      val RT8 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** OUKITEL RT9 */
      val RT9 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** OUKITEL S105B */
      val S105B = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OUKITEL S109 */
      val S109 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** OUKITEL S111 */
      val S111 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL S115 */
      val S115 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** OUKITEL S118 */
      val S118 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL U11_Plus */
      val U11_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OUKITEL U18 */
      val U18 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** OUKITEL U20_Plus */
      val U20_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OUKITEL U22 */
      val U22 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** OUKITEL U23 */
      val U23 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** OUKITEL U25_Pro */
      val U25_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OUKITEL WP10 */
      val WP10 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OUKITEL WP100_TITAN */
      val WP100_TITAN = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OUKITEL WP12 */
      val WP12 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL WP12_Pro */
      val WP12_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL WP13 */
      val WP13 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL WP15 */
      val WP15 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL WP15_S */
      val WP15_S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL WP16 */
      val WP16 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OUKITEL WP17 */
      val WP17 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OUKITEL WP18_EEA */
      val WP18_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL WP18_P_R_EEA */
      val WP18_P_R_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL WP19 */
      val WP19 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OUKITEL WP19_Pro */
      val WP19_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OUKITEL WP2 */
      val WP2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** OUKITEL WP20 */
      val WP20 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL WP200_Pro */
      val WP200_PRO = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** OUKITEL WP20_Pro */
      val WP20_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL WP21 */
      val WP21 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OUKITEL WP21_U */
      val WP21_U = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OUKITEL WP23_Plus */
      val WP23_PLUS = "spec:width=576,height=1280,unit=px,dpi=240"

      /** OUKITEL WP27 */
      val WP27 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OUKITEL WP28_E */
      val WP28_E = "spec:width=576,height=1280,unit=px,dpi=240"

      /** OUKITEL WP28_S */
      val WP28_S = "spec:width=576,height=1280,unit=px,dpi=240"

      /** OUKITEL WP300 */
      val WP300 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OUKITEL WP30_Pro */
      val WP30_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OUKITEL WP32 */
      val WP32 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL WP32_Pro_U */
      val WP32_PRO_U = "spec:width=576,height=1152,unit=px,dpi=260"

      /** OUKITEL WP33_Pro */
      val WP33_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** OUKITEL WP35 */
      val WP35 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** OUKITEL WP35_Pro */
      val WP35_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** OUKITEL WP35_S */
      val WP35_S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** OUKITEL WP36 */
      val WP36 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL WP36_Pro */
      val WP36_PRO = "spec:width=576,height=1280,unit=px,dpi=240"

      /** OUKITEL WP38 */
      val WP38 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OUKITEL WP39 */
      val WP39 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** OUKITEL WP39_Pro */
      val WP39_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** OUKITEL WP5 */
      val WP5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL WP50 */
      val WP50 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** OUKITEL WP5000 */
      val WP5000 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL WP52 */
      val WP52 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** OUKITEL WP55 */
      val WP55 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** OUKITEL WP5_Pro */
      val WP5_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OUKITEL WP6 */
      val WP6 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** OUKITEL WP7 */
      val WP7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** OUKITEL WP8_Pro */
      val WP8_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OUKITEL WP9 */
      val WP9 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** OUKITEL Y1000 */
      val Y1000 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OUKITEL Y4800 */
      val Y4800 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
