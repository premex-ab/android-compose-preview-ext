package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Selectron device specifications for Android Compose previews.
 *
 * This extension provides Selectron device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Selectron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Selectron: Any
  get() = object {
      /** DeviceSpec(manufacturer=Selectron, code=T101G, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Selectron, code=T101G, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T101G = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
