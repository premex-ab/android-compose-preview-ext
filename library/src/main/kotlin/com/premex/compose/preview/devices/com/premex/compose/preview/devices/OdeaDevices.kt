package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Odea device specifications for Android Compose previews.
 *
 * This extension provides Odea device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Odea.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Odea: Any
  get() = object {
      /** DeviceSpec(manufacturer=Odea, code=A10_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Odea, code=A10_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val A10_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Odea, code=A10_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Odea, code=A10_ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val A10_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Odea, code=A11_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Odea, code=A11_ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val A11_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Odea, code=A12_ROW, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Odea, code=A12_ROW, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val A12_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Odea, code=S11_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Odea, code=S11_EEA, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val S11_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Odea, code=S11_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Odea, code=S11_ROW, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val S11_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
