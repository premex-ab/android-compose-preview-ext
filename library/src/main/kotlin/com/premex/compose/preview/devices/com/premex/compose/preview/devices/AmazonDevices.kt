package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Amazon device specifications for Android Compose previews.
 *
 * This extension provides Amazon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Amazon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Amazon: Any
  get() = object {
      /** DeviceSpec(manufacturer=Amazon, code=douglas, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amazon, code=douglas, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DOUGLAS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Amazon, code=karnak, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amazon, code=karnak, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KARNAK = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Amazon, code=maverick, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amazon, code=maverick, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val MAVERICK = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Amazon, code=mustang, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amazon, code=mustang, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MUSTANG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Amazon, code=onyx, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amazon, code=onyx, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ONYX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Amazon, code=suez, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amazon, code=suez, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SUEZ = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Amazon, code=trona, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amazon, code=trona, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TRONA = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
