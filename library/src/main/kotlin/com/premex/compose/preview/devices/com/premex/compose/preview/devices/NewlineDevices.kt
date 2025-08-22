package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Newline device specifications for Android Compose previews.
 *
 * This extension provides Newline device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Newline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Newline: Any
  get() = object {
      /** DeviceSpec(manufacturer=Newline, code=rk3588_t, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newline, code=rk3588_t, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Newline, code=velvet, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newline, code=velvet, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val VELVET = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Newline, code=Z24, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newline, code=Z24, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val Z24 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
