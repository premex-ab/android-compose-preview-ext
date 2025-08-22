package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Specktron device specifications for Android Compose previews.
 *
 * This extension provides Specktron device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Specktron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Specktron: Any
  get() = object {
      /** DeviceSpec(manufacturer=Specktron, code=CDX, width=2160, height=3840, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Specktron, code=CDX, width=2160,
      height=3840, dpi=420, isGoogleDevice=false).code */
      val CDX = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
