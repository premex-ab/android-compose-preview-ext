package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nobby device specifications for Android Compose previews.
 *
 * This extension provides Nobby device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nobby.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nobby: Any
  get() = object {
      /** DeviceSpec(manufacturer=Nobby, code=Nobby_S300_Pro, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nobby, code=Nobby_S300_Pro,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val NOBBY_S300_PRO = "spec:width=480,height=960,unit=px,dpi=240"

  }
