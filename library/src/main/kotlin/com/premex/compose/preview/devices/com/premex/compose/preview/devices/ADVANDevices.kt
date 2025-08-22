package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ADVAN device specifications for Android Compose previews.
 *
 * This extension provides ADVAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ADVAN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ADVAN: Any
  get() = object {
      /** DeviceSpec(manufacturer=ADVAN, code=ADVANNASAPro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVANNASAPro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val ADVANNASAPRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_5041, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_5041, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ADVAN_5041 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_5059, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_5059, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ADVAN_5059 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_5060, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_5060, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ADVAN_5060 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_5061, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_5061, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ADVAN_5061 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_5501, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_5501, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ADVAN_5501 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_5701, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_5701, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ADVAN_5701 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_A8, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_A8, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ADVAN_A8 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_E1C4G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_E1C4G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val ADVAN_E1C4G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_E1C_3G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_E1C_3G,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val ADVAN_E1C_3G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_E1C_NXT, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_E1C_NXT,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val ADVAN_E1C_NXT = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_G2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_G2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ADVAN_G2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_G2_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_G2_Pro,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ADVAN_G2_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_G3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_G3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ADVAN_G3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_G3_Pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_G3_Pro,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val ADVAN_G3_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_G5, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_G5, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val ADVAN_G5 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_G5_Elite, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_G5_Elite,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val ADVAN_G5_ELITE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_G5_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_G5_Plus,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val ADVAN_G5_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_G9, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_G9, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ADVAN_G9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_GX, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_GX, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val ADVAN_GX = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_G_Tab, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_G_Tab, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ADVAN_G_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_i4U, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_i4U, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ADVAN_I4U = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_i55D, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_i55D, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ADVAN_I55D = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_i55K, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_i55K, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ADVAN_I55K = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_i5C_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_i5C_Plus,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ADVAN_I5C_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_i5D, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_i5D, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ADVAN_I5D = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_I5E, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_I5E, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ADVAN_I5E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_i5G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_i5G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ADVAN_I5G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_i6C, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_i6C, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ADVAN_I6C = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_I7D, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_I7D, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val ADVAN_I7D = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_i_Lite, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_i_Lite,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val ADVAN_I_LITE = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_i_Tab, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_i_Tab, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val ADVAN_I_TAB = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_M4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_M4, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ADVAN_M4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_NASA, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_NASA, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ADVAN_NASA = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_NASA_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_NASA_Plus,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ADVAN_NASA_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_S40, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_S40, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ADVAN_S40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_S4Z, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_S4Z, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ADVAN_S4Z = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_S50_Prime, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_S50_Prime,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ADVAN_S50_PRIME = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_S5E_FULL_VIEW, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_S5E_FULL_VIEW,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ADVAN_S5E_FULL_VIEW = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_S6_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_S6_Plus,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ADVAN_S6_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_S7C, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_S7C, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val ADVAN_S7C = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_SKETSA3, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_SKETSA3,
      width=800, height=1280, dpi=210, isGoogleDevice=false).code */
      val ADVAN_SKETSA3 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_SKETSA_2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_SKETSA_2,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ADVAN_SKETSA_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_10, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_10,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val ADVAN_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_7, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_7, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val ADVAN_TAB_7 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_8, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val ADVAN_TAB_8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_A8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_A8,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ADVAN_TAB_A8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_A8_PLUS, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_A8_PLUS,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val ADVAN_TAB_A8_PLUS = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_Gallilea, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_Gallilea,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ADVAN_TAB_GALLILEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_VX, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_VX,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val ADVAN_TAB_VX = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_VX_LITE, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_TAB_VX_LITE,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val ADVAN_TAB_VX_LITE = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_VX_NEO, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_VX_NEO,
      width=800, height=1280, dpi=320, isGoogleDevice=false).code */
      val ADVAN_VX_NEO = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_X1, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_X1, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val ADVAN_X1 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_X7_Pro, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_X7_Pro,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val ADVAN_X7_PRO = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVAN, code=ADVAN_XTAB, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=ADVAN_XTAB, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val ADVAN_XTAB = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=ADVAN, code=i10, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=i10, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val I10 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVAN, code=i5C, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=i5C, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val I5C = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ADVAN, code=T2J, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=T2J, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T2J = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVAN, code=X7_Max, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVAN, code=X7_Max, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val X7_MAX = "spec:width=600,height=1024,unit=px,dpi=213"

  }
