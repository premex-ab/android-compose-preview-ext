package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vertu device specifications for Android Compose previews.
 *
 * This extension provides Vertu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vertu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vertu: Any
  get() = object {
      /** DeviceSpec(manufacturer=Vertu, code=alexa, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertu, code=alexa, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ALEXA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vertu, code=gambit, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertu, code=gambit, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GAMBIT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertu, code=odin, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertu, code=odin, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ODIN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vertu, code=titan, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertu, code=titan, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TITAN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vertu, code=tron, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertu, code=tron, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val TRON = "spec:width=1440,height=2560,unit=px,dpi=640"

  }
