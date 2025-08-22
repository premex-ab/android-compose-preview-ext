package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ricoh device specifications for Android Compose previews.
 *
 * This extension provides Ricoh device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ricoh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ricoh: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ricoh, code=AXX10, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ricoh, code=AXX10, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val AXX10 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
