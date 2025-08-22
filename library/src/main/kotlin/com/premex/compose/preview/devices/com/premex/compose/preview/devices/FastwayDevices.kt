package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fastway device specifications for Android Compose previews.
 *
 * This extension provides Fastway device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fastway.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fastway: Any
  get() = object {
      /** DeviceSpec(manufacturer=Fastway, code=DV8545-C-KIF, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fastway, code=DV8545-C-KIF,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8545_C_KIF = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
