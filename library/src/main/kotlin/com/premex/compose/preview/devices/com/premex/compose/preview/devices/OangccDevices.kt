package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Oangcc device specifications for Android Compose previews.
 *
 * This extension provides Oangcc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Oangcc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Oangcc: Any
  get() = object {
      /** DeviceSpec(manufacturer=Oangcc, code=A13_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Oangcc, code=A13_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A13_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Oangcc, code=A13_US, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Oangcc, code=A13_US, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val A13_US = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Oangcc, code=A9-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Oangcc, code=A9-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A9_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Oangcc, code=A9_EEA, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Oangcc, code=A9_EEA, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val A9_EEA = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=Oangcc, code=A9_US, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Oangcc, code=A9_US, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val A9_US = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=Oangcc, code=Tab_A6, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Oangcc, code=Tab_A6, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_A6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Oangcc, code=Tab_A6_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Oangcc, code=Tab_A6_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_A6_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Oangcc, code=TAB_A8_EEA_T, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Oangcc, code=TAB_A8_EEA_T,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB_A8_EEA_T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Oangcc, code=TAB_A8_T, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Oangcc, code=TAB_A8_T, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB_A8_T = "spec:width=600,height=1024,unit=px,dpi=160"

  }
