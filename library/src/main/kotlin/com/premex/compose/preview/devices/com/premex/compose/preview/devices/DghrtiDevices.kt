package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dghrti device specifications for Android Compose previews.
 *
 * This extension provides Dghrti device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dghrti.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dghrti: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dghrti, code=TAB20_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dghrti, code=TAB20_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB20_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Dghrti, code=TAB20_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dghrti, code=TAB20_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB20_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Dghrti, code=TAB30_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dghrti, code=TAB30_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB30_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Dghrti, code=TAB30_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dghrti, code=TAB30_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB30_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Dghrti, code=TAB50_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dghrti, code=TAB50_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Dghrti, code=TAB50_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dghrti, code=TAB50_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB50_US = "spec:width=800,height=1280,unit=px,dpi=160"

  }
