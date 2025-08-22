package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NETGREEN device specifications for Android Compose previews.
 *
 * This extension provides NETGREEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NETGREEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NETGREEN: Any
  get() = object {
      /** DeviceSpec(manufacturer=NETGREEN, code=M11QF8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NETGREEN, code=M11QF8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M11QF8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NETGREEN, code=M15QF6, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NETGREEN, code=M15QF6, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M15QF6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NETGREEN, code=M15QF6AR, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NETGREEN, code=M15QF6AR, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M15QF6AR = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NETGREEN, code=M16QF11, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NETGREEN, code=M16QF11, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M16QF11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NETGREEN, code=M16QF11AR, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NETGREEN, code=M16QF11AR,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M16QF11AR = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NETGREEN, code=M16QF9AR, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NETGREEN, code=M16QF9AR,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val M16QF9AR = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NETGREEN, code=M16QF9ES, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NETGREEN, code=M16QF9ES,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val M16QF9ES = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
