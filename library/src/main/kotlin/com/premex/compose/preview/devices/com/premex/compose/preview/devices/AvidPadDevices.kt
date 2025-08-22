package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AvidPad device specifications for Android Compose previews.
 *
 * This extension provides AvidPad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AvidPad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AvidPad: Any
  get() = object {
      /** DeviceSpec(manufacturer=AvidPad, code=A30, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AvidPad, code=A30, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val A30 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AvidPad, code=A30PRO, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AvidPad, code=A30PRO, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val A30PRO = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AvidPad, code=A60, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AvidPad, code=A60, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A60 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AvidPad, code=S30, width=800, height=1340, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AvidPad, code=S30, width=800,
      height=1340, dpi=240, isGoogleDevice=false).code */
      val S30 = "spec:width=800,height=1340,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AvidPad, code=S60, width=1200, height=2000, dpi=284,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AvidPad, code=S60, width=1200,
      height=2000, dpi=284, isGoogleDevice=false).code */
      val S60 = "spec:width=1200,height=2000,unit=px,dpi=284"

      /** DeviceSpec(manufacturer=AvidPad, code=S80, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AvidPad, code=S80, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val S80 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
