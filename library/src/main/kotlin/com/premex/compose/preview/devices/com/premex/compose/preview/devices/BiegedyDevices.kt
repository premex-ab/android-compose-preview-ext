package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Biegedy device specifications for Android Compose previews.
 *
 * This extension provides Biegedy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Biegedy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Biegedy: Any
  get() = object {
      /** DeviceSpec(manufacturer=Biegedy, code=B21_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Biegedy, code=B21_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val B21_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Biegedy, code=B22_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Biegedy, code=B22_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val B22_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Biegedy, code=B22_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Biegedy, code=B22_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val B22_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Biegedy, code=B23_U_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Biegedy, code=B23_U_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val B23_U_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Biegedy, code=B29_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Biegedy, code=B29_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val B29_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Biegedy, code=B29_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Biegedy, code=B29_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val B29_US = "spec:width=800,height=1280,unit=px,dpi=213"

  }
