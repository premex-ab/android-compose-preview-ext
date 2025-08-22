package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Olike device specifications for Android Compose previews.
 *
 * This extension provides Olike device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Olike.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Olike: Any
  get() = object {
      /** DeviceSpec(manufacturer=Olike, code=E1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Olike, code=E1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val E1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Olike, code=E3, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Olike, code=E3, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val E3 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
