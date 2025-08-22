package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Schok device specifications for Android Compose previews.
 *
 * This extension provides Schok device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Schok.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Schok: Any
  get() = object {
      /** DeviceSpec(manufacturer=Schok, code=freedom_turbo_XL, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Schok, code=freedom_turbo_XL,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val FREEDOM_TURBO_XL = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Schok, code=SFT5216, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Schok, code=SFT5216, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SFT5216 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Schok, code=SV55216, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Schok, code=SV55216, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SV55216 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Schok, code=SV67Q, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Schok, code=SV67Q, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SV67Q = "spec:width=720,height=1600,unit=px,dpi=320"

  }
