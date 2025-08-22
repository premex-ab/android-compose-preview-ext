package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Legamaster device specifications for Android Compose previews.
 *
 * This extension provides Legamaster device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Legamaster.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Legamaster: Any
  get() = object {
      /** DeviceSpec(manufacturer=Legamaster, code=ETX, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Legamaster, code=ETX, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val ETX = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
