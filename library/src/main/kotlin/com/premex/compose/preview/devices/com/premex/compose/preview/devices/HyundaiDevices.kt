package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hyundai device specifications for Android Compose previews.
 *
 * This extension provides Hyundai device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hyundai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hyundai: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hyundai, code=bangbae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=bangbae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hyundai, code=e501, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=e501, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val E501 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hyundai, code=guandu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=guandu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hyundai, code=H25568K, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=H25568K, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val H25568K = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hyundai, code=HT0703K, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT0703K, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HT0703K = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=HT0704K08, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT0704K08, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HT0704K08 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=HT0705W08, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT0705W08, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HT0705W08 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=HT0802W16, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT0802W16, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HT0802W16 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=HT1003X16, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT1003X16, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HT1003X16 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=HT1004L16, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT1004L16, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HT1004L16 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=HT1004X16, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT1004X16, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HT1004X16 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=HT10LA2MSGNA01, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT10LA2MSGNA01,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val HT10LA2MSGNA01 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Hyundai, code=HT10LB2MBKLTM, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT10LB2MBKLTM,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val HT10LB2MBKLTM = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=HT10LB3MBKLTM, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT10LB3MBKLTM,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HT10LB3MBKLTM = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=HT10LB3MBKWW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT10LB3MBKWW,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HT10LB3MBKWW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=HT10LC1MBKLTM, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT10LC1MBKLTM,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val HT10LC1MBKLTM = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Hyundai, code=HT10LC1MBKLTM01, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT10LC1MBKLTM01,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HT10LC1MBKLTM01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=HT1G50K, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT1G50K, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val HT1G50K = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hyundai, code=HT2G50KBK, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT2G50KBK, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val HT2G50KBK = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hyundai, code=HT2G57K, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT2G57K, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HT2G57K = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hyundai, code=HT2G57L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT2G57L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HT2G57L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hyundai, code=HT3G60L, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT3G60L, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val HT3G60L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hyundai, code=HT7WB1RBK, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT7WB1RBK, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HT7WB1RBK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=HT7WC1PBK, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT7WC1PBK, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HT7WC1PBK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=HT8LA1RBKNA01, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT8LA1RBKNA01,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val HT8LA1RBKNA01 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hyundai, code=HT8LAB1PBKLTM, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT8LAB1PBKLTM,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val HT8LAB1PBKLTM = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hyundai, code=HT8LB1PBK01, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT8LB1PBK01,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HT8LB1PBK01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=HT8WB1RBK02, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT8WB1RBK02,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HT8WB1RBK02 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=HT8WB1RBK02A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT8WB1RBK02A,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HT8WB1RBK02A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=HT8WB1RBK03, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HT8WB1RBK03,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HT8WB1RBK03 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=HY65PA1401NA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HY65PA1401NA,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HY65PA1401NA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hyundai, code=HY65PA1402NA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HY65PA1402NA,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HY65PA1402NA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hyundai, code=HY65PB1401NA, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HY65PB1401NA,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val HY65PB1401NA = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hyundai, code=HyTab_Plus_10LC2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=HyTab_Plus_10LC2,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HYTAB_PLUS_10LC2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=ikebukuro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=komagome, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=komagome, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=Koral_10WB1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=Koral_10WB1,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KORAL_10WB1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=Koral_10X3, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=Koral_10X3,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KORAL_10X3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=Koral_10XL, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=Koral_10XL,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val KORAL_10XL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=Koral_7W4X, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=Koral_7W4X,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val KORAL_7W4X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=Koral_7WB1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=Koral_7WB1,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val KORAL_7WB1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=Koral_7WC1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=Koral_7WC1,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val KORAL_7WC1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=Koral_7WD1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=Koral_7WD1,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val KORAL_7WD1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=Koral_8WC1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=Koral_8WC1,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KORAL_8WC1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=longshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=longshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hyundai, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=redwood, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=redwood, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=samseong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hyundai, code=shinjuku, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=shinjuku, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHINJUKU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hyundai, code=sindorim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=sindorim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hyundai, code=10LA2, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=10LA2, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val _10LA2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Hyundai, code=10LB1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=10LB1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _10LB1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=10LC1, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=10LC1, width=1200,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val _10LC1 = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=Hyundai, code=7LB1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=7LB1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val _7LB1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyundai, code=8LAB1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyundai, code=8LAB1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val _8LAB1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
