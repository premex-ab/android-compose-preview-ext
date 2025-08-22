package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kodak device specifications for Android Compose previews.
 *
 * This extension provides Kodak device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kodak.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kodak: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kodak, code=KD10112TB, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kodak, code=KD10112TB, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KD10112TB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kodak, code=KodakEktra, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kodak, code=KodakEktra, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KODAKEKTRA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Kodak, code=Kodak_D40, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kodak, code=Kodak_D40, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val KODAK_D40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kodak, code=Kodak_D50L, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kodak, code=Kodak_D50L, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KODAK_D50L = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kodak, code=Kodak_D55L, width=444, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kodak, code=Kodak_D55L, width=444,
      height=960, dpi=213, isGoogleDevice=false).code */
      val KODAK_D55L = "spec:width=444,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kodak, code=Kodak_D60LX, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kodak, code=Kodak_D60LX, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val KODAK_D60LX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kodak, code=Kodak_D61L, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kodak, code=Kodak_D61L, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val KODAK_D61L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kodak, code=Kodak_D65LX, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kodak, code=Kodak_D65LX, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val KODAK_D65LX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kodak, code=Kodak_KD50, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kodak, code=Kodak_KD50, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KODAK_KD50 = "spec:width=480,height=960,unit=px,dpi=240"

  }
