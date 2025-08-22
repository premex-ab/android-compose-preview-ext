package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * fezawio device specifications for Android Compose previews.
 *
 * This extension provides fezawio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fezawio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fezawio: Any
  get() = object {
      /** DeviceSpec(manufacturer=fezawio, code=F10_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=fezawio, code=F10_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=fezawio, code=F10_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=fezawio, code=F10_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F10_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=fezawio, code=F11_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=fezawio, code=F11_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F11_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=fezawio, code=F11_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=fezawio, code=F11_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F11_US = "spec:width=800,height=1280,unit=px,dpi=160"

  }
