package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * REDLINE device specifications for Android Compose previews.
 *
 * This extension provides REDLINE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.REDLINE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.REDLINE: Any
  get() = object {
      /** DeviceSpec(manufacturer=REDLINE, code=Space_A10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=REDLINE, code=Space_A10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SPACE_A10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=REDLINE, code=Space_A8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=REDLINE, code=Space_A8, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val SPACE_A8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=REDLINE, code=Space_M10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=REDLINE, code=Space_M10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SPACE_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=REDLINE, code=Space_M10Pro, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=REDLINE, code=Space_M10Pro,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val SPACE_M10PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
