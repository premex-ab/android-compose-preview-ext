package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Turk_Telekom device specifications for Android Compose previews.
 *
 * This extension provides Turk_Telekom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TurkTelekom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TurkTelekom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Turk_Telekom, code=ZTE_Blade_V580, width=1080, height=1920,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Turk_Telekom,
      code=ZTE_Blade_V580, width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ZTE_BLADE_V580 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Turk_Telekom, code=722T, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Turk_Telekom, code=722T, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val _722T = "spec:width=480,height=800,unit=px,dpi=240"

  }
