package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Evertek device specifications for Android Compose previews.
 *
 * This extension provides Evertek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Evertek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Evertek: Any
  get() = object {
      /** DeviceSpec(manufacturer=Evertek, code=Evertek_M10_Pro, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Evertek, code=Evertek_M10_Pro,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val EVERTEK_M10_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Evertek, code=Hero, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Evertek, code=Hero, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val HERO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Evertek, code=M10, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Evertek, code=M10, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M10 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Evertek, code=M10_Lite, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Evertek, code=M10_Lite, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val M10_LITE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Evertek, code=M10_Nano, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Evertek, code=M10_Nano, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val M10_NANO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Evertek, code=M20, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Evertek, code=M20, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val M20 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Evertek, code=M20_Mini, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Evertek, code=M20_Mini, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val M20_MINI = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Evertek, code=M20_NANO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Evertek, code=M20_NANO, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val M20_NANO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Evertek, code=M20_Pro, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Evertek, code=M20_Pro, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val M20_PRO = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Evertek, code=M20_S, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Evertek, code=M20_S, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val M20_S = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Evertek, code=V5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Evertek, code=V5, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Evertek, code=V5_Nano, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Evertek, code=V5_Nano, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val V5_NANO = "spec:width=480,height=800,unit=px,dpi=240"

  }
