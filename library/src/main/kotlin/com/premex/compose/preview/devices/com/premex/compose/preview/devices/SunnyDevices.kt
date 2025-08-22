package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sunny device specifications for Android Compose previews.
 *
 * This extension provides Sunny device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sunny.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sunny: Any
  get() = object {
      /** DeviceSpec(manufacturer=Sunny, code=SN10016, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sunny, code=SN10016, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SN10016 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Sunny, code=SN7016, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sunny, code=SN7016, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val SN7016 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
