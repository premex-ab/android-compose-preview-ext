package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Extreme device specifications for Android Compose previews.
 *
 * This extension provides Extreme device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Extreme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Extreme: Any
  get() = object {
      /** DeviceSpec(manufacturer=Extreme, code=Infinity, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Extreme, code=Infinity, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val INFINITY = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
