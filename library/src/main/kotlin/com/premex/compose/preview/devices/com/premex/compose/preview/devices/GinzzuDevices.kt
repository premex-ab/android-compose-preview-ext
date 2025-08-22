package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ginzzu device specifications for Android Compose previews.
 *
 * This extension provides Ginzzu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ginzzu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ginzzu: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ginzzu, code=RS8502, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ginzzu, code=RS8502, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RS8502 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Ginzzu, code=RS9602, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ginzzu, code=RS9602, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RS9602 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
