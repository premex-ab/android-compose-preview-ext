package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Rixun device specifications for Android Compose previews.
 *
 * This extension provides Rixun device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rixun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rixun: Any
  get() = object {
      /** DeviceSpec(manufacturer=Rixun, code=T107, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rixun, code=T107, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val T107 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
