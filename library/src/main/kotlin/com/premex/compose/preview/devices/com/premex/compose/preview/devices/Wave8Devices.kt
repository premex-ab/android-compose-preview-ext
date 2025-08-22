package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wave_8 device specifications for Android Compose previews.
 *
 * This extension provides Wave_8 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wave8.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wave8: Any
  get() = object {
      /** DeviceSpec(manufacturer=Wave_8, code=Wave_8_10, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wave_8, code=Wave_8_10, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val WAVE_8_10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Wave_8, code=Wave_8_7, width=720, height=1280, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wave_8, code=Wave_8_7, width=720,
      height=1280, dpi=300, isGoogleDevice=false).code */
      val WAVE_8_7 = "spec:width=720,height=1280,unit=px,dpi=300"

  }
