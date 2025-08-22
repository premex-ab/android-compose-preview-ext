package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Haier device specifications for Android Compose previews.
 *
 * This extension provides Haier device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Haier.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Haier: Any
  get() = object {
      /** DeviceSpec(manufacturer=Haier, code=A1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=A1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Haier, code=A3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=A3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=A4_Lite, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=A4_Lite, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A4_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Haier, code=broadway, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=broadway, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BROADWAY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Haier, code=burrard, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=burrard, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val BURRARD = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=daan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=daan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DAAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=deto, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=deto, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DETO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Haier, code=dupont, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=dupont, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DUPONT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=E13, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=E13, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val E13 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=E7, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=E7, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val E7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=E9, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=E9, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val E9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=Haier_L52, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=Haier_L52, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val HAIER_L52 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Haier, code=Haier_Leisure_L7, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=Haier_Leisure_L7,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val HAIER_LEISURE_L7 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Haier, code=hanyang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=hanyang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=HM-G553-FL, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=HM-G553-FL, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val HM_G553_FL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Haier, code=hongik, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=hongik, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGIK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=I4, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=I4, width=600,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val I4 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Haier, code=I6_Infinity, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=I6_Infinity, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val I6_INFINITY = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Haier, code=irvine, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=irvine, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val IRVINE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=jordan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=jordan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val JORDAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=LE32U5000A, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=LE32U5000A, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val LE32U5000A = "spec:width=720,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Haier, code=LE40U5000A, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=LE40U5000A, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val LE40U5000A = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Haier, code=LE43U5000A, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=LE43U5000A, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val LE43U5000A = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Haier, code=LE49U5000A, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=LE49U5000A, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val LE49U5000A = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Haier, code=M5352401, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=M5352401, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M5352401 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Haier, code=M53-52401, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=M53-52401, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M53_52401 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Haier, code=nippori, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=nippori, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Haier, code=omonia, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=omonia, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val OMONIA = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=P10, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=P10, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=P11, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=P11, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P11 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=P20, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=P20, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P20 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Haier, code=P20_Tablet_PC, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=P20_Tablet_PC,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val P20_TABLET_PC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Haier, code=PAD1042, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=PAD1042, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PAD1042 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Haier, code=S5_Silk, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=S5_Silk, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S5_SILK = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Haier, code=SW4H_FF, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=SW4H_FF, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=Tablet_P20, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=Tablet_P20, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val TABLET_P20 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Haier, code=Titan_T3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=Titan_T3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TITAN_T3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=Titan_T5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=Titan_T5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TITAN_T5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=uguisudani, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=uguisudani, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val UGUISUDANI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Haier, code=yongchun, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=yongchun, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YONGCHUN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haier, code=YQB, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haier, code=YQB, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YQB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
