package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tomstar device specifications for Android Compose previews.
 *
 * This extension provides Tomstar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tomstar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tomstar: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tomstar, code=A1000, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tomstar, code=A1000, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A1000 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Tomstar, code=A1020, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tomstar, code=A1020, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A1020 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Tomstar, code=A1110, width=800, height=1280, dpi=204,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tomstar, code=A1110, width=800,
      height=1280, dpi=204, isGoogleDevice=false).code */
      val A1110 = "spec:width=800,height=1280,unit=px,dpi=204"

  }
