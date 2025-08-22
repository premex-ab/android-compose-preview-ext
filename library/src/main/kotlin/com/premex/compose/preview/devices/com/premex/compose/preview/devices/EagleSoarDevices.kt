package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EagleSoar device specifications for Android Compose previews.
 *
 * This extension provides EagleSoar device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EagleSoar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EagleSoar: Any
  get() = object {
      /** DeviceSpec(manufacturer=EagleSoar, code=E10A_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EagleSoar, code=E10A_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val E10A_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EagleSoar, code=EE10A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EagleSoar, code=EE10A, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EE10A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EagleSoar, code=EE-35_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EagleSoar, code=EE-35_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val EE_35_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EagleSoar, code=EE-P30_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EagleSoar, code=EE-P30_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val EE_P30_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EagleSoar, code=E-764-EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EagleSoar, code=E-764-EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val E_764_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
