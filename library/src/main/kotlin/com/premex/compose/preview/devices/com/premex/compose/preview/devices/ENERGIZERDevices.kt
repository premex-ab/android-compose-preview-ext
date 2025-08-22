package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ENERGIZER device specifications for Android Compose previews.
 *
 * This extension provides ENERGIZER device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ENERGIZER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ENERGIZER: Any
  get() = object {
      /** DeviceSpec(manufacturer=ENERGIZER, code=EnergyE500, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENERGIZER, code=EnergyE500,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ENERGYE500 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ENERGIZER, code=EnergyE500S_EU, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENERGIZER, code=EnergyE500S_EU,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ENERGYE500S_EU = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ENERGIZER, code=HARDCASEH500S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENERGIZER, code=HARDCASEH500S,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val HARDCASEH500S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ENERGIZER, code=PowerMaxP490, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENERGIZER, code=PowerMaxP490,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val POWERMAXP490 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ENERGIZER, code=PowerMaxP490S_AP, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENERGIZER, code=PowerMaxP490S_AP,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val POWERMAXP490S_AP = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ENERGIZER, code=PowerMaxP490S_EU, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENERGIZER, code=PowerMaxP490S_EU,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val POWERMAXP490S_EU = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ENERGIZER, code=PowerMaxP600S, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENERGIZER, code=PowerMaxP600S,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val POWERMAXP600S = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ENERGIZER, code=Ultimate_U710S, width=1080, height=2244, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENERGIZER, code=Ultimate_U710S,
      width=1080, height=2244, dpi=480, isGoogleDevice=false).code */
      val ULTIMATE_U710S = "spec:width=1080,height=2244,unit=px,dpi=480"

  }
