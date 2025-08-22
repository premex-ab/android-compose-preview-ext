package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HighScreen device specifications for Android Compose previews.
 *
 * This extension provides HighScreen device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HighScreen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HighScreen: Any
  get() = object {
      /** DeviceSpec(manufacturer=HighScreen, code=Bay, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HighScreen, code=Bay, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BAY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HighScreen, code=BBL7353RV, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HighScreen, code=BBL7353RV,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BBL7353RV = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HighScreen, code=Expanse, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HighScreen, code=Expanse,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val EXPANSE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HighScreen, code=FestXL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HighScreen, code=FestXL, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FESTXL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HighScreen, code=FestXL-Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HighScreen, code=FestXL-Pro,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val FESTXL_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HighScreen, code=PowerFive, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HighScreen, code=PowerFive,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val POWERFIVE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HighScreen, code=PowerFour, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HighScreen, code=PowerFour,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val POWERFOUR = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HighScreen, code=PowerIceMax, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HighScreen, code=PowerIceMax,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val POWERICEMAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HighScreen, code=PowerRage, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HighScreen, code=PowerRage,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val POWERRAGE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HighScreen, code=PowerRageEvo, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HighScreen, code=PowerRageEvo,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val POWERRAGEEVO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HighScreen, code=PrimeL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HighScreen, code=PrimeL, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIMEL = "spec:width=720,height=1280,unit=px,dpi=320"

  }
