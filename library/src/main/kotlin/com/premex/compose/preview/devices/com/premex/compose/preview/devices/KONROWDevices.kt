package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KONROW device specifications for Android Compose previews.
 *
 * This extension provides KONROW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KONROW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KONROW: Any
  get() = object {
      /** DeviceSpec(manufacturer=KONROW, code=CITY, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=CITY, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val CITY = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONROW, code=CITY4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=CITY4, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val CITY4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONROW, code=CITY5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=CITY5, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CITY5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONROW, code=EASY5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=EASY5, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val EASY5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONROW, code=EASY62, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=EASY62, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val EASY62 = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONROW, code=EASY_5, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=EASY_5, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val EASY_5 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KONROW, code=EASY_K55, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=EASY_K55, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val EASY_K55 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KONROW, code=EASY_S55P, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=EASY_S55P, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val EASY_S55P = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONROW, code=EASY_S55P_2021, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=EASY_S55P_2021,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val EASY_S55P_2021 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KONROW, code=KONROW_SKY_LITE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=KONROW_SKY_LITE,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val KONROW_SKY_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONROW, code=KONROW_SKY_PLUS, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=KONROW_SKY_PLUS,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val KONROW_SKY_PLUS = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONROW, code=KTAB704, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=KTAB704, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KTAB704 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KONROW, code=K-TAB1005, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=K-TAB1005, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K_TAB1005 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KONROW, code=K-TAB703, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=K-TAB703, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K_TAB703 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KONROW, code=K-TAB801, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=K-TAB801, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K_TAB801 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KONROW, code=MUST, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=MUST, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val MUST = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONROW, code=NEOW, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=NEOW, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val NEOW = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=KONROW, code=SKY55, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=SKY55, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SKY55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONROW, code=SKY63, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=SKY63, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val SKY63 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONROW, code=SKY_55, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=SKY_55, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SKY_55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONROW, code=SOFT5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=SOFT5, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SOFT5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONROW, code=SOFT5P, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=SOFT5P, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SOFT5P = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONROW, code=SWEET5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONROW, code=SWEET5, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SWEET5 = "spec:width=480,height=854,unit=px,dpi=240"

  }
