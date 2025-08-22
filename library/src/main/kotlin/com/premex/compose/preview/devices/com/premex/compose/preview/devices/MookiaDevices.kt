package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mookia device specifications for Android Compose previews.
 *
 * This extension provides Mookia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mookia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mookia: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mookia, code=FF-P30, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mookia, code=FF-P30, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val FF_P30 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mookia, code=M10A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mookia, code=M10A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mookia, code=MM10A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mookia, code=MM10A, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MM10A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mookia, code=MM-35, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mookia, code=MM-35, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MM_35 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mookia, code=MM-35_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mookia, code=MM-35_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MM_35_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
