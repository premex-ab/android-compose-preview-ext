package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iiyama device specifications for Android Compose previews.
 *
 * This extension provides iiyama device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iiyama.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iiyama: Any
  get() = object {
      /** DeviceSpec(manufacturer=iiyama, code=rk3588_t, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iiyama, code=rk3588_t, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iiyama, code=TEXX13A, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iiyama, code=TEXX13A, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val TEXX13A = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
