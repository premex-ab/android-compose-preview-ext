package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUXI device specifications for Android Compose previews.
 *
 * This extension provides SUXI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUXI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUXI: Any
  get() = object {
      /** DeviceSpec(manufacturer=SUXI, code=T700, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUXI, code=T700, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T700 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SUXI, code=T900, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUXI, code=T900, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T900 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
