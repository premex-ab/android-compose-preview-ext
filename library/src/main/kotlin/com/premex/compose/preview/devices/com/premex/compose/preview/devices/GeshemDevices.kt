package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Geshem device specifications for Android Compose previews.
 *
 * This extension provides Geshem device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Geshem.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Geshem: Any
  get() = object {
      /** DeviceSpec(manufacturer=Geshem, code=GS0882T, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Geshem, code=GS0882T, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val GS0882T = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Geshem, code=GS0883T, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Geshem, code=GS0883T, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val GS0883T = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Geshem, code=GS1081T, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Geshem, code=GS1081T, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val GS1081T = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Geshem, code=GS109M2A, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Geshem, code=GS109M2A, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val GS109M2A = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Geshem, code=GS109M3A, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Geshem, code=GS109M3A, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val GS109M3A = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Geshem, code=GS81TE, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Geshem, code=GS81TE, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val GS81TE = "spec:width=800,height=1280,unit=px,dpi=240"

  }
