package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LANIX device specifications for Android Compose previews.
 *
 * This extension provides LANIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LANIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LANIX: Any
  get() = object {
      /** DeviceSpec(manufacturer=LANIX, code=Alpha_950, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Alpha_950, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ALPHA_950 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=Alpha_950XL, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Alpha_950XL, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ALPHA_950XL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=IliumPad_RX10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=IliumPad_RX10,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ILIUMPAD_RX10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LANIX, code=IliumPad_RX10v3, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=IliumPad_RX10v3,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val ILIUMPAD_RX10V3 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=ILIUMPAD_RX10v5, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=ILIUMPAD_RX10v5,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ILIUMPAD_RX10V5 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LANIX, code=IliumPad_RX7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=IliumPad_RX7,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ILIUMPAD_RX7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_Alpha7, width=720, height=1528, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_Alpha7,
      width=720, height=1528, dpi=280, isGoogleDevice=false).code */
      val ILIUM_ALPHA7 = "spec:width=720,height=1528,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_Alpha_1s, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_Alpha_1s,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val ILIUM_ALPHA_1S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_Alpha_3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_Alpha_3,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ILIUM_ALPHA_3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_Alpha_5s, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_Alpha_5s,
      width=720, height=1520, dpi=280, isGoogleDevice=false).code */
      val ILIUM_ALPHA_5S = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_L1100, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_L1100, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ILIUM_L1100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_L1120, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_L1120, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ILIUM_L1120 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_L1400, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_L1400,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ILIUM_L1400 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LANIX, code=ILIUM_L200, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=ILIUM_L200, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ILIUM_L200 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_L620, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_L620, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ILIUM_L620 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_L910, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_L910, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ILIUM_L910 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_L920, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_L920, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ILIUM_L920 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_LT520, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_LT520, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ILIUM_LT520 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_M1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_M1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ILIUM_M1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_M3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_M3, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ILIUM_M3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_M5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_M5, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ILIUM_M5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_M5s, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_M5s, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ILIUM_M5S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_M7, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_M7, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ILIUM_M7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_M7s, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_M7s, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ILIUM_M7S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_M7V, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_M7V, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ILIUM_M7V = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_M9, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_M9, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ILIUM_M9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_M9s, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_M9s, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ILIUM_M9S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_M9V, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_M9V, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val ILIUM_M9V = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=iLium_Pad_E10Si_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=iLium_Pad_E10Si_1,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ILIUM_PAD_E10SI_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_PAD_RX8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_PAD_RX8,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ILIUM_PAD_RX8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LANIX, code=ILIUM_PAD_RX8_v5, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=ILIUM_PAD_RX8_v5,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ILIUM_PAD_RX8_V5 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LANIX, code=ILIUM_X110, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=ILIUM_X110, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val ILIUM_X110 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_X200, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_X200, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ILIUM_X200 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_X210, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_X210, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ILIUM_X210 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_X220, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_X220, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ILIUM_X220 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_X500B, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_X500B, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ILIUM_X500B = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_X510, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_X510, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ILIUM_X510 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_X520, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_X520, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ILIUM_X520 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=Ilium_X710, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=Ilium_X710, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ILIUM_X710 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANIX, code=M1R, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=M1R, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val M1R = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LANIX, code=RX7V4, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=RX7V4, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RX7V4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LANIX, code=RX7_v3, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=RX7_v3, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RX7_V3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LANIX, code=stanford, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=stanford, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LANIX, code=X1S, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=X1S, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val X1S = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LANIX, code=X230, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=X230, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val X230 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=X240, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=X240, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val X240 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=X5, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=X5, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val X5 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LANIX, code=X530, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=X530, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val X530 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=X540, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=X540, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val X540 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANIX, code=X550, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=X550, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val X550 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LANIX, code=X7, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=X7, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val X7 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LANIX, code=zhongshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANIX, code=zhongshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
