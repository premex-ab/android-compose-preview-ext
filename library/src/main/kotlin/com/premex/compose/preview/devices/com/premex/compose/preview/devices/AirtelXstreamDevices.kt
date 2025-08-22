package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Airtel-Xstream device specifications for Android Compose previews.
 *
 * This extension provides Airtel-Xstream device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AirtelXstream.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AirtelXstream: Any
  get() = object {
      /** DeviceSpec(manufacturer=Airtel-Xstream, code=UIW4078ATL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Airtel-Xstream, code=UIW4078ATL,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val UIW4078ATL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Airtel-Xstream, code=VIP7220SIAI, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Airtel-Xstream, code=VIP7220SIAI,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val VIP7220SIAI = "spec:width=720,height=1280,unit=px,dpi=320"

  }
