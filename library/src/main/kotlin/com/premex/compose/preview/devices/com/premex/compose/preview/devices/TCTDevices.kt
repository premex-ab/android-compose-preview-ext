package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TCT device specifications for Android Compose previews.
 *
 * This extension provides TCT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TCT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TCT: Any
  get() = object {
      /** DeviceSpec(manufacturer=TCT, code=Alpha, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=Alpha, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ALPHA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCT, code=Beetle_GSM, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=Beetle_GSM, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val BEETLE_GSM = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCT, code=California, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=California, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CALIFORNIA = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCT, code=Diablo, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=Diablo, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val DIABLO = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCT, code=DIABLOXPLUS, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=DIABLOXPLUS, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val DIABLOXPLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCT, code=Megane_GSM, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=Megane_GSM, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MEGANE_GSM = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCT, code=POP7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=POP7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val POP7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCT, code=Rav4, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=Rav4, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val RAV4 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCT, code=SCRIBEPRO, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=SCRIBEPRO, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SCRIBEPRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCT, code=Vodafone_875, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=Vodafone_875, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val VODAFONE_875 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCT, code=Yaris35_GSM, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=Yaris35_GSM, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val YARIS35_GSM = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCT, code=YarisL_GSM, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=YarisL_GSM, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val YARISL_GSM = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCT, code=YARISXL, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=YARISXL, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val YARISXL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCT, code=YARIS_55, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=YARIS_55, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val YARIS_55 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCT, code=Yaris_M_GSM, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCT, code=Yaris_M_GSM, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val YARIS_M_GSM = "spec:width=480,height=800,unit=px,dpi=240"

  }
