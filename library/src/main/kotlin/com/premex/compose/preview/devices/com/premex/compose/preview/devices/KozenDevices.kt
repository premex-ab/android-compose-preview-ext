package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kozen device specifications for Android Compose previews.
 *
 * This extension provides Kozen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kozen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kozen: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kozen, code=D1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kozen, code=D1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val D1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kozen, code=T05, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kozen, code=T05, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val T05 = "spec:width=480,height=800,unit=px,dpi=240"

  }
