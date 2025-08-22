package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ClearTouch device specifications for Android Compose previews.
 *
 * This extension provides ClearTouch device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ClearTouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ClearTouch: Any
  get() = object {
      /** DeviceSpec(manufacturer=ClearTouch, code=rk3588_t, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ClearTouch, code=rk3588_t,
      width=2160, height=3840, dpi=480, isGoogleDevice=false).code */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
