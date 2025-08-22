package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DABLIU device specifications for Android Compose previews.
 *
 * This extension provides DABLIU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DABLIU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DABLIU: Any
  get() = object {
      /** DeviceSpec(manufacturer=DABLIU, code=rk3588_E13R, width=2160, height=3840, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DABLIU, code=rk3588_E13R,
      width=2160, height=3840, dpi=420, isGoogleDevice=false).code */
      val RK3588_E13R = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
