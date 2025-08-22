package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUGAR device specifications for Android Compose previews.
 *
 * This extension provides SUGAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUGAR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUGAR: Any
  get() = object {
      /** DeviceSpec(manufacturer=SUGAR, code=i9071ae, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=i9071ae, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val I9071AE = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SUGAR, code=p101bs, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=p101bs, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val P101BS = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=SUGAR, code=p201as, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=p201as, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P201AS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=p210cn, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=p210cn, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val P210CN = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=p312cs_tw, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=p312cs_tw, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val P312CS_TW = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SUGAR, code=p611bn, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=p611bn, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val P611BN = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SUGAR, code=p700as, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=p700as, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val P700AS = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SUGAR, code=s9121, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=s9121, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val S9121 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SUGAR, code=SUGAR_C12, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=SUGAR_C12, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SUGAR_C12 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=SUGAR_C60, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=SUGAR_C60, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val SUGAR_C60 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=SUGAR_P1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=SUGAR_P1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SUGAR_P1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=SUGAR_P11, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=SUGAR_P11, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SUGAR_P11 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=SUGAR_S50, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=SUGAR_S50, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SUGAR_S50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=SUGAR_S55, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=SUGAR_S55, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SUGAR_S55 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=SUGAR_Y12s, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=SUGAR_Y12s, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SUGAR_Y12S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SUGAR, code=SUGAR_Y13s, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=SUGAR_Y13s, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SUGAR_Y13S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SUGAR, code=SUGAR_Y16, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=SUGAR_Y16, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SUGAR_Y16 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=SUGAR_Y18, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=SUGAR_Y18, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SUGAR_Y18 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=v12bns, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=v12bns, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V12BNS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=v730_64, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=v730_64, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val V730_64 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=v830_64, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=v830_64, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val V830_64 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUGAR, code=x600as, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=x600as, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val X600AS = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SUGAR, code=x600as_hk, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=x600as_hk, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val X600AS_HK = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SUGAR, code=x800as, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUGAR, code=x800as, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val X800AS = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
