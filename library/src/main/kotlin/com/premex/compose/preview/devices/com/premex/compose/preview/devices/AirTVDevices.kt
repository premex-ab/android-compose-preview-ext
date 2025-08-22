package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AirTV device specifications for Android Compose previews.
 *
 * This extension provides AirTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AirTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AirTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=AirTV, code=DV8535, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AirTV, code=DV8535, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8535 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AirTV, code=kunlun, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AirTV, code=kunlun, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KUNLUN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
