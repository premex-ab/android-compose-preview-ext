package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * miracle_tap device specifications for Android Compose previews.
 *
 * This extension provides miracle_tap device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Miracletap.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Miracletap: Any
  get() = object {
      /** DeviceSpec(manufacturer=miracle_tap, code=miracle_tap_10, width=1200, height=1920,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=miracle_tap,
      code=miracle_tap_10, width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val MIRACLE_TAP_10 = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
