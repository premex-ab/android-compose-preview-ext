package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * polar device specifications for Android Compose previews.
 *
 * This extension provides polar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Polar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Polar: Any
  get() = object {
      /** DeviceSpec(manufacturer=polar, code=pike, width=240, height=240, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=polar, code=pike, width=240,
      height=240, dpi=240, isGoogleDevice=false).code */
      val PIKE = "spec:width=240,height=240,unit=px,dpi=240"

  }
