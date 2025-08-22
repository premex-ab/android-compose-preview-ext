package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sappa device specifications for Android Compose previews.
 *
 * This extension provides Sappa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sappa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sappa: Any
  get() = object {
      /** DeviceSpec(manufacturer=Sappa, code=SEI904SAP, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sappa, code=SEI904SAP, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI904SAP = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
