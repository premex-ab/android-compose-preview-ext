package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Casper device specifications for Android Compose previews.
 *
 * This extension provides Casper device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Casper.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Casper: Any
  get() = object {
      /** DeviceSpec(manufacturer=Casper, code=barking, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=barking, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=BBL7551TC, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=BBL7551TC, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BBL7551TC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Casper, code=beaudry, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=beaudry, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BEAUDRY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Casper, code=CASPER_L10_4_5G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=CASPER_L10_4_5G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val CASPER_L10_4_5G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Casper, code=Casper_S38, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=Casper_S38, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CASPER_S38 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Casper, code=CASPER_VIA_A2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=CASPER_VIA_A2,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val CASPER_VIA_A2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=CASPER_VIA_G1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=CASPER_VIA_G1,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val CASPER_VIA_G1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=CASPER_VIA_G1_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=CASPER_VIA_G1_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val CASPER_VIA_G1_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=CASPER_VIA_M3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=CASPER_VIA_M3,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CASPER_VIA_M3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=L20, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=L20, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val L20 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Casper, code=S20, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=S20, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val S20 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Casper, code=VIA_A1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_A1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VIA_A1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Casper, code=VIA_A1_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_A1_1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VIA_A1_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Casper, code=VIA_A3, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_A3, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val VIA_A3 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Casper, code=VIA_A3_Plus, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_A3_Plus,
      width=1080, height=2246, dpi=480, isGoogleDevice=false).code */
      val VIA_A3_PLUS = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Casper, code=VIA_A40, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_A40, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val VIA_A40 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Casper, code=VIA_E3, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_E3, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val VIA_E3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_E30, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_E30, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VIA_E30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_E4, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_E4, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val VIA_E4 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_F1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_F1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VIA_F1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Casper, code=VIA_F20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_F20, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VIA_F20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_F3, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_F3, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val VIA_F3 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Casper, code=VIA_F30, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_F30, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VIA_F30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_F30_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_F30_Plus,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val VIA_F30_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_G3, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_G3, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val VIA_G3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_G5, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_G5, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val VIA_G5 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Casper, code=VIA_L30, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_L30, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val VIA_L30 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Casper, code=VIA_L30_0, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_L30_0, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val VIA_L30_0 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Casper, code=VIA_L40, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_L40, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val VIA_L40 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Casper, code=VIA_L50, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_L50, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val VIA_L50 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Casper, code=VIA_M30, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_M30, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VIA_M30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_M30_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_M30_Plus,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val VIA_M30_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_M35, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_M35, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VIA_M35 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_M4, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_M4, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val VIA_M4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_M40, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_M40, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VIA_M40 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_P2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_P2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VIA_P2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_P3, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_P3, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val VIA_P3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_S, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_S, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val VIA_S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Casper, code=VIA_S10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_S10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VIA_S10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Casper, code=VIA_S30, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_S30, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val VIA_S30 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Casper, code=VIA_S30_0, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_S30_0, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val VIA_S30_0 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Casper, code=VIA_S40, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_S40, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val VIA_S40 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Casper, code=VIA_S48, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_S48, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VIA_S48 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Casper, code=VIA_S48_0, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_S48_0, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VIA_S48_0 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Casper, code=VIA_S50, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_S50, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val VIA_S50 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Casper, code=VIA-T7D, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA-T7D, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VIA_T7D = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Casper, code=VIA_X20, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_X20, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val VIA_X20 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Casper, code=VIA_X30, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_X30, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val VIA_X30 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Casper, code=VIA_X30_Plus, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_X30_Plus,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val VIA_X30_PLUS = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Casper, code=VIA_X40, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_X40, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val VIA_X40 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Casper, code=VIA_X45, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casper, code=VIA_X45, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val VIA_X45 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
