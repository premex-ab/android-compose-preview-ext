package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Gigaset device specifications for Android Compose previews.
 *
 * This extension provides Gigaset device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gigaset.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gigaset: Any
  get() = object {
      /** DeviceSpec(manufacturer=Gigaset, code=FG6Q, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=FG6Q, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val FG6Q = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=Gigaset_GS270, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=Gigaset_GS270,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIGASET_GS270 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gigaset, code=Gigaset_GS270_plus, width=1080, height=1920,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset,
      code=Gigaset_GS270_plus, width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIGASET_GS270_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gigaset, code=Gigaset_GS4, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=Gigaset_GS4,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val GIGASET_GS4 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gigaset, code=GS100, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS100, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GS100 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=GS110, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS110, width=600,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val GS110 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Gigaset, code=GS160, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS160, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GS160 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=GS170, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS170, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GS170 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=GS180, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS180, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GS180 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=GS185, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS185, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GS185 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=GS190, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS190, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val GS190 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=GS195, width=1080, height=2246, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS195, width=1080,
      height=2246, dpi=400, isGoogleDevice=false).code */
      val GS195 = "spec:width=1080,height=2246,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=Gigaset, code=GS280, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS280, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val GS280 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gigaset, code=GS290, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS290, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val GS290 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gigaset, code=GS3, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS3, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val GS3 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=GS370, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS370, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GS370 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=GS370_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS370_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val GS370_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=GS5, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS5, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val GS5 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gigaset, code=GS5_LITE, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS5_LITE, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val GS5_LITE = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gigaset, code=GS5_Senior, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS5_Senior,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val GS5_SENIOR = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gigaset, code=GS80, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GS80, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val GS80 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Gigaset, code=GX290, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GX290, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val GX290 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=GX4, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GX4, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val GX4 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=GX4_PRO, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GX4_PRO, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val GX4_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gigaset, code=GX6, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GX6, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val GX6 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gigaset, code=GX6_PRO, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=GX6_PRO, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val GX6_PRO = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gigaset, code=lion_s, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=lion_s, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val LION_S = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Gigaset, code=maxwell_10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=maxwell_10,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MAXWELL_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Gigaset, code=ME, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=ME, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ME = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gigaset, code=MEpro, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=MEpro, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val MEPRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gigaset, code=UY8, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gigaset, code=UY8, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val UY8 = "spec:width=768,height=1024,unit=px,dpi=160"

  }
