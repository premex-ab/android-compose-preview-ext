package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ascon device specifications for Android Compose previews.
 *
 * This extension provides ascon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ascon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ascon: Any
  get() = object {
      /** DeviceSpec(manufacturer=ascon, code=AT14, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ascon, code=AT14, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val AT14 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
