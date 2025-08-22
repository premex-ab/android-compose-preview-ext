package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FASTWD device specifications for Android Compose previews.
 *
 * This extension provides FASTWD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FASTWD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FASTWD: Any
  get() = object {
      /** DeviceSpec(manufacturer=FASTWD, code=L231, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FASTWD, code=L231, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L231 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FASTWD, code=L231-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FASTWD, code=L231-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L231_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FASTWD, code=L251-EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FASTWD, code=L251-EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val L251_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FASTWD, code=M109-EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FASTWD, code=M109-EEA, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val M109_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FASTWD, code=M20L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FASTWD, code=M20L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M20L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FASTWD, code=M518-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FASTWD, code=M518-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M518_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
