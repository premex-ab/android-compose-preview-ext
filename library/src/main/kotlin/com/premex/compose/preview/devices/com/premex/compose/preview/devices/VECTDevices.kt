package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VECT device specifications for Android Compose previews.
 *
 * This extension provides VECT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VECT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VECT: Any
  get() = object {
      /** DeviceSpec(manufacturer=VECT, code=rk3588_t, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VECT, code=rk3588_t, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
