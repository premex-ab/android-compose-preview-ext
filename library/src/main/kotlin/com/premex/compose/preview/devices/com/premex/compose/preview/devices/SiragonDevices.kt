package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Siragon device specifications for Android Compose previews.
 *
 * This extension provides Siragon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Siragon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Siragon: Any
  get() = object {
      /** DeviceSpec(manufacturer=Siragon, code=Siragon_SP_7200, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=Siragon_SP_7200,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val SIRAGON_SP_7200 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Siragon, code=Siragon_SP_7300, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=Siragon_SP_7300,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val SIRAGON_SP_7300 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Siragon, code=SP-5250, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=SP-5250, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SP_5250 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Siragon, code=SP-5300, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=SP-5300, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SP_5300 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Siragon, code=SP-5450, width=444, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=SP-5450, width=444,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SP_5450 = "spec:width=444,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Siragon, code=SP-6000, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=SP-6000, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val SP_6000 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Siragon, code=SP-6150, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=SP-6150, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val SP_6150 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Siragon, code=SP-6200, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=SP-6200, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val SP_6200 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Siragon, code=SP-7050, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=SP-7050, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val SP_7050 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Siragon, code=SP_7250, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=SP_7250, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SP_7250 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Siragon, code=SP_7275, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=SP_7275, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val SP_7275 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Siragon, code=TB-5300, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=TB-5300, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TB_5300 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Siragon, code=TB_5400, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=TB_5400, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TB_5400 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Siragon, code=TB_7400, width=1440, height=2200, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Siragon, code=TB_7400, width=1440,
      height=2200, dpi=300, isGoogleDevice=false).code */
      val TB_7400 = "spec:width=1440,height=2200,unit=px,dpi=300"

  }
