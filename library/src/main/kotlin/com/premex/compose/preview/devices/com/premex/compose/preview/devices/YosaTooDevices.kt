package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YosaToo device specifications for Android Compose previews.
 *
 * This extension provides YosaToo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YosaToo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YosaToo: Any
  get() = object {
      /** DeviceSpec(manufacturer=YosaToo, code=Y10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YosaToo, code=Y10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Y10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=YosaToo, code=Y101, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YosaToo, code=Y101, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Y101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YosaToo, code=Y102, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YosaToo, code=Y102, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Y102 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
