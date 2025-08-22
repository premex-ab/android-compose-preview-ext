package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Exclusiv device specifications for Android Compose previews.
 *
 * This extension provides Exclusiv device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Exclusiv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Exclusiv: Any
  get() = object {
      /** DeviceSpec(manufacturer=Exclusiv, code=patrick, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Exclusiv, code=patrick, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PATRICK = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
