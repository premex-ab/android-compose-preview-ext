package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Jumper device specifications for Android Compose previews.
 *
 * This extension provides Jumper device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jumper.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jumper: Any
  get() = object {
      /** DeviceSpec(manufacturer=Jumper, code=EZpad_M10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jumper, code=EZpad_M10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val EZPAD_M10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Jumper, code=EZpad_M10S, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jumper, code=EZpad_M10S,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val EZPAD_M10S = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Jumper, code=EZpad_M11, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jumper, code=EZpad_M11, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val EZPAD_M11 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
