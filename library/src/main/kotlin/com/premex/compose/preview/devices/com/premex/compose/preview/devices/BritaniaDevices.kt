package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Britania device specifications for Android Compose previews.
 *
 * This extension provides Britania device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Britania.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Britania: Any
  get() = object {
      /** DeviceSpec(manufacturer=Britania, code=sunnyvale, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Britania, code=sunnyvale,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Britania, code=SW6H, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Britania, code=SW6H, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
