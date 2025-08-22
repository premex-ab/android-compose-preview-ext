package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Selecline device specifications for Android Compose previews.
 *
 * This extension provides Selecline device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Selecline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Selecline: Any
  get() = object {
      /** DeviceSpec(manufacturer=Selecline, code=SP19403, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Selecline, code=SP19403, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val SP19403 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Selecline, code=SP19504, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Selecline, code=SP19504, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SP19504 = "spec:width=480,height=960,unit=px,dpi=240"

  }
