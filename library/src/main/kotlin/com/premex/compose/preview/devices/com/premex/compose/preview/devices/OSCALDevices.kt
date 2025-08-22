package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OSCAL device specifications for Android Compose previews.
 *
 * This extension provides OSCAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OSCAL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OSCAL: Any
  get() = object {
      /** DeviceSpec(manufacturer=OSCAL, code=C20, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=C20, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val C20 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=C20_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=C20_Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val C20_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=C30, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=C30, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=C30_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=C30_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C30_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=C60, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=C60, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C60 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=C70, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=C70, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val C70 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=C80, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=C80, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C80 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=ELITE_1, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=ELITE_1, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val ELITE_1 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=FLAT1C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=FLAT1C, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val FLAT1C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=FLAT_2, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=FLAT_2, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val FLAT_2 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=FLAT_2C, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=FLAT_2C, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val FLAT_2C = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=MARINE_1, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=MARINE_1, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val MARINE_1 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=MARINE_2, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=MARINE_2, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val MARINE_2 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=MODERN_8, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=MODERN_8, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MODERN_8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad13_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad13_EEA, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val PAD13_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad13_NEU, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad13_NEU, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val PAD13_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad15, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad15, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val PAD15 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad15_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad15_EEA, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val PAD15_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad15_RU, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad15_RU, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val PAD15_RU = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad16, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad16, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val PAD16 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad18, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad18, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val PAD18 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad60_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad60_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD60_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad60_NEU, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad60_NEU, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD60_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad70_NEU, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad70_NEU, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD70_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_100, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_100, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val PAD_100 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_10_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_10_EEA, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val PAD_10_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_10_NEU, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_10_NEU, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val PAD_10_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_10_RU, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_10_RU, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val PAD_10_RU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_5, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_5, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val PAD_5 = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_50_Kids, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_50_Kids, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PAD_50_KIDS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_50_WiFi, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_50_WiFi, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PAD_50_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_5_Kids, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_5_Kids, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val PAD_5_KIDS = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_60_Kids, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_60_Kids, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD_60_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_7, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_7, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD_7 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_70_WiFi, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_70_WiFi, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val PAD_70_WIFI = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_80_WiFi, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_80_WiFi,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val PAD_80_WIFI = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_9, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_9, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD_9 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OSCAL, code=Pad_90, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Pad_90, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD_90 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OSCAL, code=PILOT_1, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=PILOT_1, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val PILOT_1 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=PILOT_2, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=PILOT_2, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PILOT_2 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OSCAL, code=S60, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=S60, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S60 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=S60Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=S60Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S60PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=S70, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=S70, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val S70 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=S70_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=S70_Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val S70_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=S80, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=S80, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val S80 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OSCAL, code=Spider8, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Spider8, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val SPIDER8 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OSCAL, code=Tiger10, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Tiger10, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TIGER10 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OSCAL, code=Tiger12, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=Tiger12, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TIGER12 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OSCAL, code=TIGER_13, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OSCAL, code=TIGER_13, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val TIGER_13 = "spec:width=720,height=1604,unit=px,dpi=320"

  }
