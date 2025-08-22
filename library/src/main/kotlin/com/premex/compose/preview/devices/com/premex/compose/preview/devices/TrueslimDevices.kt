package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * trueslim device specifications for Android Compose previews.
 *
 * This extension provides trueslim device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trueslim.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trueslim: Any
  get() = object {
      /** DeviceSpec(manufacturer=trueslim, code=5516D, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=trueslim, code=5516D, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val _5516D = "spec:width=480,height=960,unit=px,dpi=240"

  }
