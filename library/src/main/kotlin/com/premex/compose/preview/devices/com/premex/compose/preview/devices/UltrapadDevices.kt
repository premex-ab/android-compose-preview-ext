package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ultrapad device specifications for Android Compose previews.
 *
 * This extension provides Ultrapad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ultrapad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ultrapad: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ultrapad, code=UP10_SH36LAG, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ultrapad, code=UP10_SH36LAG,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val UP10_SH36LAG = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
