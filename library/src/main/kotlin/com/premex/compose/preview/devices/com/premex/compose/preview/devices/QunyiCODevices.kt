package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * qunyiCO device specifications for Android Compose previews.
 *
 * This extension provides qunyiCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QunyiCO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QunyiCO: Any
  get() = object {
      /** DeviceSpec(manufacturer=qunyiCO, code=Y10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=qunyiCO, code=Y10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Y10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=qunyiCO, code=Y10_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=qunyiCO, code=Y10_1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Y10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=qunyiCO, code=Y10_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=qunyiCO, code=Y10_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Y10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=qunyiCO, code=Y7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=qunyiCO, code=Y7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Y7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=qunyiCO, code=Y7_0, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=qunyiCO, code=Y7_0, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Y7_0 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=qunyiCO, code=Y7_0_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=qunyiCO, code=Y7_0_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Y7_0_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=qunyiCO, code=Y7_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=qunyiCO, code=Y7_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Y7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
