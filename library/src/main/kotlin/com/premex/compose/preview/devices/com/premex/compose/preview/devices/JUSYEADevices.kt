package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JUSYEA device specifications for Android Compose previews.
 *
 * This extension provides JUSYEA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JUSYEA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JUSYEA: Any
  get() = object {
      /** DeviceSpec(manufacturer=JUSYEA, code=J10_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUSYEA, code=J10_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val J10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUSYEA, code=J10_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUSYEA, code=J10_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val J10_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUSYEA, code=J5_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUSYEA, code=J5_EEA, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val J5_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=JUSYEA, code=J6_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUSYEA, code=J6_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val J6_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUSYEA, code=J8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUSYEA, code=J8, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val J8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUSYEA, code=J8_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUSYEA, code=J8_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val J8_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUSYEA, code=J8_EEA_T, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUSYEA, code=J8_EEA_T, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val J8_EEA_T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUSYEA, code=J8_T, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUSYEA, code=J8_T, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val J8_T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUSYEA, code=J9_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUSYEA, code=J9_EEA, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val J9_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
