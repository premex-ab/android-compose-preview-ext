package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SkyDevices device specifications for Android Compose previews.
 *
 * This extension provides SkyDevices device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SkyDevices.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SkyDevices: Any
  get() = object {
      /** DeviceSpec(manufacturer=SkyDevices, code=Elite_6Pro, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Elite_6Pro,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val ELITE_6PRO = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SkyDevices, code=Elite_D65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Elite_D65,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val ELITE_D65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SkyDevices, code=Elite_P5, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Elite_P5,
      width=480, height=854, dpi=213, isGoogleDevice=false).code */
      val ELITE_P5 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SkyDevices, code=Elite_P55, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Elite_P55,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ELITE_P55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SkyDevices, code=Elite_P55BMaxB, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Elite_P55BMaxB,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val ELITE_P55BMAXB = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SkyDevices, code=ELITE_P55LIFE, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=ELITE_P55LIFE,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val ELITE_P55LIFE = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SkyDevices, code=Elite_P55MANAL, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Elite_P55MANAL,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val ELITE_P55MANAL = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SkyDevices, code=ELITE_P55Max, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=ELITE_P55Max,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ELITE_P55MAX = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SkyDevices, code=Elite_P55MAXA, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Elite_P55MAXA,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val ELITE_P55MAXA = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SkyDevices, code=Elite_P55MUSAN, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Elite_P55MUSAN,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val ELITE_P55MUSAN = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SkyDevices, code=Elite_P55MxUS, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Elite_P55MxUS,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val ELITE_P55MXUS = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SkyDevices, code=ELITE_P55US, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=ELITE_P55US,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val ELITE_P55US = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SkyDevices, code=Elite_P55_CMax, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Elite_P55_CMax,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val ELITE_P55_CMAX = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SkyDevices, code=Elite_P55_Max_D, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Elite_P55_Max_D,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val ELITE_P55_MAX_D = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SkyDevices, code=Elite_V55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Elite_V55,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ELITE_V55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SkyDevices, code=Platinum_H5_PLUS, width=720, height=1280,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices,
      code=Platinum_H5_PLUS, width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val PLATINUM_H5_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SkyDevices, code=Platinum_J5, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Platinum_J5,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val PLATINUM_J5 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SkyDevices, code=Platinum_J5US, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=Platinum_J5US,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val PLATINUM_J5US = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SkyDevices, code=SKY_B63, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=SKY_B63,
      width=720, height=1520, dpi=280, isGoogleDevice=false).code */
      val SKY_B63 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SkyDevices, code=SKY_B632NUS, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=SKY_B632NUS,
      width=720, height=1520, dpi=280, isGoogleDevice=false).code */
      val SKY_B632NUS = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SkyDevices, code=SKY_B63CUW, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=SKY_B63CUW,
      width=720, height=1520, dpi=280, isGoogleDevice=false).code */
      val SKY_B63CUW = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SkyDevices, code=SKY_B63HA, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=SKY_B63HA,
      width=720, height=1520, dpi=280, isGoogleDevice=false).code */
      val SKY_B63HA = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SkyDevices, code=SKY_B63NAL, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=SKY_B63NAL,
      width=720, height=1520, dpi=280, isGoogleDevice=false).code */
      val SKY_B63NAL = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SkyDevices, code=SKY_B63NUSA, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=SKY_B63NUSA,
      width=720, height=1520, dpi=280, isGoogleDevice=false).code */
      val SKY_B63NUSA = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SkyDevices, code=SKY_D63, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=SKY_D63,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val SKY_D63 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SkyDevices, code=SKY_PAD10MXUSNA, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyDevices, code=SKY_PAD10MXUSNA,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val SKY_PAD10MXUSNA = "spec:width=800,height=1280,unit=px,dpi=200"

  }
