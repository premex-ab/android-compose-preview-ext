package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TPS device specifications for Android Compose previews.
 *
 * This extension provides TPS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TPS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TPS: Any
  get() = object {
      /** DeviceSpec(manufacturer=TPS, code=K1091F, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TPS, code=K1091F, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val K1091F = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=TPS, code=TPS-SC10, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TPS, code=TPS-SC10, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val TPS_SC10 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
