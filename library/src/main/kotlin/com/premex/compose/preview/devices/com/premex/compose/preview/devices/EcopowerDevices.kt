package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ecopower device specifications for Android Compose previews.
 *
 * This extension provides Ecopower device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ecopower.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ecopower: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ecopower, code=EP-A100, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ecopower, code=EP-A100, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val EP_A100 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
