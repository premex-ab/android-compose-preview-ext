package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Rhino device specifications for Android Compose previews.
 *
 * This extension provides Rhino device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rhino.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rhino: Any
  get() = object {
      /** DeviceSpec(manufacturer=Rhino, code=pace, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rhino, code=pace, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val PACE = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Rhino, code=portal, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rhino, code=portal, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val PORTAL = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Rhino, code=Rhino_M10p, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rhino, code=Rhino_M10p, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RHINO_M10P = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Rhino, code=Rhino_T8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rhino, code=Rhino_T8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val RHINO_T8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
