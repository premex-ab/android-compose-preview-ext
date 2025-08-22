package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Meberry device specifications for Android Compose previews.
 *
 * This extension provides Meberry device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meberry.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meberry: Any
  get() = object {
      /** DeviceSpec(manufacturer=Meberry, code=M7, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meberry, code=M7, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M7 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Meberry, code=M7Pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meberry, code=M7Pro, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M7PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Meberry, code=M7_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meberry, code=M7_EEA, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val M7_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Meberry, code=M7_US, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meberry, code=M7_US, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val M7_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Meberry, code=M8_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meberry, code=M8_EEA, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val M8_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Meberry, code=M8_US, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meberry, code=M8_US, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val M8_US = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
