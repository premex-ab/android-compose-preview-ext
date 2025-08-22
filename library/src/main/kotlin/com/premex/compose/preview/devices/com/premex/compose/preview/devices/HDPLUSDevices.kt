package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HD_PLUS device specifications for Android Compose previews.
 *
 * This extension provides HD_PLUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HDPLUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HDPLUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=HD_PLUS, code=SEI900HDPLUS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HD_PLUS, code=SEI900HDPLUS,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI900HDPLUS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
