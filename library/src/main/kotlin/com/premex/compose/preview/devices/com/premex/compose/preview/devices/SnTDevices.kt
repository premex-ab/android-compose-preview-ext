package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SnT device specifications for Android Compose previews.
 *
 * This extension provides SnT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SnT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SnT: Any
  get() = object {
      /** DeviceSpec(manufacturer=SnT, code=C20, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SnT, code=C20, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val C20 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SnT, code=8788_7, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SnT, code=8788_7, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _8788_7 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
