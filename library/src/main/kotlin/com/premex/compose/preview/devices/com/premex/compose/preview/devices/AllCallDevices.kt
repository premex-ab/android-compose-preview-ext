package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AllCall device specifications for Android Compose previews.
 *
 * This extension provides AllCall device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AllCall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AllCall: Any
  get() = object {
      /** DeviceSpec(manufacturer=AllCall, code=AllCall_S1_X, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AllCall, code=AllCall_S1_X,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ALLCALL_S1_X = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AllCall, code=HERO_20_PRO, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AllCall, code=HERO_20_PRO,
      width=720, height=1640, dpi=280, isGoogleDevice=false).code */
      val HERO_20_PRO = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AllCall, code=MIX2, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AllCall, code=MIX2, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val MIX2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=AllCall, code=S5500, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AllCall, code=S5500, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S5500 = "spec:width=480,height=960,unit=px,dpi=240"

  }
