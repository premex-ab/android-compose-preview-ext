package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Crelander device specifications for Android Compose previews.
 *
 * This extension provides Crelander device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Crelander.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Crelander: Any
  get() = object {
      /** DeviceSpec(manufacturer=Crelander, code=A101, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crelander, code=A101, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val A101 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Crelander, code=T118, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crelander, code=T118, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T118 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Crelander, code=W30, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crelander, code=W30, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val W30 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Crelander, code=Z103, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crelander, code=Z103, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Z103 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
