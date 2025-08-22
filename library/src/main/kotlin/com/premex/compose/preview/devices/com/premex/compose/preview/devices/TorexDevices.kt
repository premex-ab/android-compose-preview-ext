package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Torex device specifications for Android Compose previews.
 *
 * This extension provides Torex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Torex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Torex: Any
  get() = object {
      /** DeviceSpec(manufacturer=Torex, code=Torex8plus, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Torex, code=Torex8plus, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TOREX8PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
