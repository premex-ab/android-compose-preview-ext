package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WALTON device specifications for Android Compose previews.
 *
 * This extension provides WALTON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WALTON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WALTON: Any
  get() = object {
      /** WALTON anaheim */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** WALTON guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** WALTON IAD */
      val IAD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** WALTON martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** WALTON mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** WALTON NEXG_N25 */
      val NEXG_N25 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** WALTON NEXG_N26 */
      val NEXG_N26 = "spec:width=720,height=1612,unit=px,dpi=480"

      /** WALTON NEXG_N27 */
      val NEXG_N27 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** WALTON NEXG_N71 */
      val NEXG_N71 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** WALTON NEXG_N71_Plus */
      val NEXG_N71_PLUS = "spec:width=720,height=1612,unit=px,dpi=280"

      /** WALTON NEXG_N72 */
      val NEXG_N72 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** WALTON NEXG_N73 */
      val NEXG_N73 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** WALTON NEXG_N74 */
      val NEXG_N74 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** WALTON NEXG_N8 */
      val NEXG_N8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** WALTON NEXG_N9 */
      val NEXG_N9 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** WALTON OrbitY20 */
      val ORBITY20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** WALTON Orbit_Y11 */
      val ORBIT_Y11 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WALTON ORBIT_Y12 */
      val ORBIT_Y12 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** WALTON ORBIT_Y13 */
      val ORBIT_Y13 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** WALTON ORBIT_Y70 */
      val ORBIT_Y70 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** WALTON PRIMO_D10 */
      val PRIMO_D10 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_D9 */
      val PRIMO_D9 = "spec:width=480,height=800,unit=px,dpi=240"

      /** WALTON PRIMO_E10 */
      val PRIMO_E10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WALTON Primo_E10_Plus */
      val PRIMO_E10_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** WALTON Primo_E11 */
      val PRIMO_E11 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WALTON Primo_E12 */
      val PRIMO_E12 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WALTON Primo_E8s */
      val PRIMO_E8S = "spec:width=480,height=854,unit=px,dpi=240"

      /** WALTON Primo_E9 */
      val PRIMO_E9 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WALTON PRIMO_EF10 */
      val PRIMO_EF10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WALTON Primo_EF7 */
      val PRIMO_EF7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_EF8_4G */
      val PRIMO_EF8_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_EF9 */
      val PRIMO_EF9 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_EM2 */
      val PRIMO_EM2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON PRIMO_F10 */
      val PRIMO_F10 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_F8 */
      val PRIMO_F8 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WALTON Primo_F8s */
      val PRIMO_F8S = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_F9 */
      val PRIMO_F9 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_G9 */
      val PRIMO_G9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WALTON Primo_GF6 */
      val PRIMO_GF6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WALTON Primo_GH10 */
      val PRIMO_GH10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** WALTON Primo_GH7 */
      val PRIMO_GH7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_GH7i */
      val PRIMO_GH7I = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_GH8 */
      val PRIMO_GH8 = "spec:width=720,height=1498,unit=px,dpi=320"

      /** WALTON Primo_GH9 */
      val PRIMO_GH9 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** WALTON Primo_GM3 */
      val PRIMO_GM3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_GM3_plus */
      val PRIMO_GM3_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_GM4 */
      val PRIMO_GM4 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** WALTON Primo_H10 */
      val PRIMO_H10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** WALTON Primo_H8_Pro */
      val PRIMO_H8_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** WALTON Primo_H9 */
      val PRIMO_H9 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** WALTON Primo_H9_Pro */
      val PRIMO_H9_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** WALTON Primo_HM5 */
      val PRIMO_HM5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** WALTON Primo_HM6 */
      val PRIMO_HM6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** WALTON Primo_HM7 */
      val PRIMO_HM7 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** WALTON PRIMO_N4 */
      val PRIMO_N4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** WALTON Primo_N5 */
      val PRIMO_N5 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** WALTON Primo_NF4 */
      val PRIMO_NF4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_NF4_2GB */
      val PRIMO_NF4_2GB = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_NF5 */
      val PRIMO_NF5 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** WALTON Primo_NH3i */
      val PRIMO_NH3I = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WALTON PRIMO_NH4 */
      val PRIMO_NH4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON PRIMO_NH5 */
      val PRIMO_NH5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WALTON Primo_NX6 */
      val PRIMO_NX6 = "spec:width=1440,height=3040,unit=px,dpi=560"

      /** WALTON Primo_R4_Plus */
      val PRIMO_R4_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WALTON Primo_R5 */
      val PRIMO_R5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WALTON Primo_R5_Plus */
      val PRIMO_R5_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WALTON Primo_R6 */
      val PRIMO_R6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** WALTON Primo_R6_Max */
      val PRIMO_R6_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** WALTON Primo_R8 */
      val PRIMO_R8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** WALTON Primo_R9 */
      val PRIMO_R9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** WALTON Primo_RM3 */
      val PRIMO_RM3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WALTON Primo_RM4 */
      val PRIMO_RM4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** WALTON Primo_RX7 */
      val PRIMO_RX7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** WALTON PRIMO_RX8 */
      val PRIMO_RX8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** WALTON Primo_RX8_Mini */
      val PRIMO_RX8_MINI = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** WALTON PRIMO_RX9 */
      val PRIMO_RX9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** WALTON Primo_S6 */
      val PRIMO_S6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WALTON Primo_S6_Dual */
      val PRIMO_S6_DUAL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WALTON Primo_S6_infinity */
      val PRIMO_S6_INFINITY = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WALTON Primo_S7 */
      val PRIMO_S7 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** WALTON Primo_S7_Pro */
      val PRIMO_S7_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** WALTON PRIMO_S8 */
      val PRIMO_S8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** WALTON Primo_X5 */
      val PRIMO_X5 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** WALTON Primo_ZX3 */
      val PRIMO_ZX3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** WALTON PRIMO_ZX4 */
      val PRIMO_ZX4 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** WALTON RX7_Mini */
      val RX7_MINI = "spec:width=720,height=1520,unit=px,dpi=320"

      /** WALTON SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** WALTON tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** WALTON umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** WALTON WALPAD8G_V2 */
      val WALPAD8G_V2 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** WALTON Walpad_10H */
      val WALPAD_10H = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** WALTON WALPAD_10H_Pro */
      val WALPAD_10H_PRO = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** WALTON WALPAD_8G */
      val WALPAD_8G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WALTON WBW5616WA */
      val WBW5616WA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WALTON XANON_X20 */
      val XANON_X20 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** WALTON XANON_X21 */
      val XANON_X21 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** WALTON XANON_X90 */
      val XANON_X90 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** WALTON XANON_X91 */
      val XANON_X91 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** WALTON yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** WALTON ZENX_1 */
      val ZENX_1 = "spec:width=720,height=1612,unit=px,dpi=480"

      /** WALTON zenx_2 */
      val ZENX_2 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** WALTON 10P */
      val _10P = "spec:width=1200,height=1920,unit=px,dpi=360"

  }
