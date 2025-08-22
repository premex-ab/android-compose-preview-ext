package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SEBBE device specifications for Android Compose previews.
 *
 * This extension provides SEBBE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SEBBE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SEBBE: Any
  get() = object {
      /** DeviceSpec(manufacturer=SEBBE, code=S21_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEBBE, code=S21_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val S21_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SEBBE, code=S22_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEBBE, code=S22_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S22_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SEBBE, code=S23_EEA, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEBBE, code=S23_EEA, width=800,
      height=1332, dpi=160, isGoogleDevice=false).code */
      val S23_EEA = "spec:width=800,height=1332,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SEBBE, code=S23_EEA_A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEBBE, code=S23_EEA_A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S23_EEA_A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SEBBE, code=S23_T_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEBBE, code=S23_T_EEA, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val S23_T_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SEBBE, code=S23_T_US, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEBBE, code=S23_T_US, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val S23_T_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SEBBE, code=S23_US, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEBBE, code=S23_US, width=800,
      height=1332, dpi=160, isGoogleDevice=false).code */
      val S23_US = "spec:width=800,height=1332,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SEBBE, code=S23_US_B, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEBBE, code=S23_US_B, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S23_US_B = "spec:width=800,height=1280,unit=px,dpi=160"

  }
