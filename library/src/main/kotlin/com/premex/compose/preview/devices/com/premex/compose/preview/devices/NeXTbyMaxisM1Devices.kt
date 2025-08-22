package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NeXTbyMaxis_M1 device specifications for Android Compose previews.
 *
 * This extension provides NeXTbyMaxis_M1 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NeXTbyMaxisM1.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NeXTbyMaxisM1: Any
  get() = object {
      /** DeviceSpec(manufacturer=NeXTbyMaxis_M1, code=VFD700, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NeXTbyMaxis_M1, code=VFD700,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val VFD700 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
