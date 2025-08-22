package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * High_Q device specifications for Android Compose previews.
 *
 * This extension provides High_Q device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HighQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HighQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=High_Q, code=ELT0704H, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=High_Q, code=ELT0704H, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ELT0704H = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=High_Q, code=ELT0706H, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=High_Q, code=ELT0706H, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ELT0706H = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=High_Q, code=ELT0802H, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=High_Q, code=ELT0802H, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ELT0802H = "spec:width=800,height=1280,unit=px,dpi=160"

  }
