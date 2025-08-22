package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Stream device specifications for Android Compose previews.
 *
 * This extension provides Stream device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Stream.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Stream: Any
  get() = object {
      /** DeviceSpec(manufacturer=Stream, code=DV8555-Altice, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Stream, code=DV8555-Altice,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8555_ALTICE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
