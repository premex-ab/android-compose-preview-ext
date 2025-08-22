package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Surfans device specifications for Android Compose previews.
 *
 * This extension provides Surfans device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Surfans.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Surfans: Any
  get() = object {
      /** DeviceSpec(manufacturer=Surfans, code=K10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Surfans, code=K10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Surfans, code=K7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Surfans, code=K7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Surfans, code=K7S, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Surfans, code=K7S, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val K7S = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Surfans, code=Y57A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Surfans, code=Y57A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Y57A = "spec:width=600,height=1024,unit=px,dpi=160"

  }
