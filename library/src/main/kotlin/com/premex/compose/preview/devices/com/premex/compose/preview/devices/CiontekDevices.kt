package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ciontek device specifications for Android Compose previews.
 *
 * This extension provides Ciontek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ciontek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ciontek: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ciontek, code=CS20, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ciontek, code=CS20, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CS20 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Ciontek, code=CS30, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ciontek, code=CS30, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CS30 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Ciontek, code=CS50, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ciontek, code=CS50, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CS50 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Ciontek, code=CS50C, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ciontek, code=CS50C, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CS50C = "spec:width=720,height=1440,unit=px,dpi=320"

  }
