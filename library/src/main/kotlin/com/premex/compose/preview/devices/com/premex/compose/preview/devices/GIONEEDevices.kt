package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GIONEE device specifications for Android Compose previews.
 *
 * This extension provides GIONEE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GIONEE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GIONEE: Any
  get() = object {
      /** DeviceSpec(manufacturer=GIONEE, code=F10, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=F10, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val F10 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=F10_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=F10_Plus, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val F10_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=F205_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=F205_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val F205_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=F8_Neo, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=F8_Neo, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val F8_NEO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=F9, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=F9, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val F9 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=F9_Plus, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=F9_Plus, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val F9_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GiONEE_BBL7337A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GiONEE_BBL7337A,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_BBL7337A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GiONEE_BBL7505, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GiONEE_BBL7505,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_BBL7505 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GiONEE_BBL7515A, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GiONEE_BBL7515A,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_BBL7515A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_BBL7516A, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_BBL7516A,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_BBL7516A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_BBL7516A01, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_BBL7516A01,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_BBL7516A01 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_BJ17G16, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_BJ17G16,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val GIONEE_BJ17G16 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_F11, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_F11, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val GIONEE_F11 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_G1602A, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_G1602A,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_G1602A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_G1605A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_G1605A,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_G1605A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_GBL7358, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_GBL7358,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_GBL7358 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_GBL7359, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_GBL7359,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_GBL7359 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_GBL7360, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_GBL7360,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_GBL7360 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_GBL7370, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_GBL7370,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_GBL7370 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GiONEE_GBL7523, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GiONEE_GBL7523,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_GBL7523 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_GBL7529, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_GBL7529,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_GBL7529 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_GBL7553, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_GBL7553,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_GBL7553 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_H601, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_H601,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val GIONEE_H601 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_H603, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_H603,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val GIONEE_H603 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_M100, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_M100,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val GIONEE_M100 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_M11, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_M11,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val GIONEE_M11 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_M15, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_M15,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val GIONEE_M15 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_MAX, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_MAX, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val GIONEE_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_MAX_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_MAX_Pro,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val GIONEE_MAX_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_P12, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_P12, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val GIONEE_P12 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_P15, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_P15, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val GIONEE_P15 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G01, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G01,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_SW17G01 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G02, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G02,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_SW17G02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G03, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G03,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_SW17G03 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G04, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G04,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_SW17G04 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G07, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G07,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val GIONEE_SW17G07 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G09, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G09,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_SW17G09 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G13, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G13,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val GIONEE_SW17G13 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G15, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G15,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val GIONEE_SW17G15 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G18, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17G18,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val GIONEE_SW17G18 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17W04, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SW17W04,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_SW17W04 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWG1608, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWG1608,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_SWG1608 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWG1613, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWG1613,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_SWG1613 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWW1609, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWW1609,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_SWW1609 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWW1617, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWW1617,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_SWW1617 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWW1618, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWW1618,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_SWW1618 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWW1627, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWW1627,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_SWW1627 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWW1631, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_SWW1631,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_SWW1631 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBL5708, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBL5708,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_WBL5708 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBL7361, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBL7361,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_WBL7361 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBL7365, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBL7365,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_WBL7365 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBL7372, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBL7372,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_WBL7372 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBL7517, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBL7517,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_WBL7517 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBL7519, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBL7519,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_WBL7519 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBW5620, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=GIONEE_WBW5620,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_WBW5620 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=P15_Pro, width=720, height=1640, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=P15_Pro, width=720,
      height=1640, dpi=260, isGoogleDevice=false).code */
      val P15_PRO = "spec:width=720,height=1640,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=GIONEE, code=P61, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=P61, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P61 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GIONEE, code=S12_Lite, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GIONEE, code=S12_Lite, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S12_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

  }
