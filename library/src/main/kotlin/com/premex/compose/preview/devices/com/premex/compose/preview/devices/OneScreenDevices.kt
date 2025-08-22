package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OneScreen device specifications for Android Compose previews.
 *
 * This extension provides OneScreen device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OneScreen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OneScreen: Any
  get() = object {
      /** DeviceSpec(manufacturer=OneScreen, code=rk3588_t, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OneScreen, code=rk3588_t,
      width=2160, height=3840, dpi=480, isGoogleDevice=false).code */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OneScreen, code=Wandr, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OneScreen, code=Wandr, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val WANDR = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
