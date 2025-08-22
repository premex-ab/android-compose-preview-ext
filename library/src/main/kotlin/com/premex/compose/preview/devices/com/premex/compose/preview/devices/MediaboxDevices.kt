package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mediabox device specifications for Android Compose previews.
 *
 * This extension provides Mediabox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mediabox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mediabox: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mediabox, code=DV8235, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mediabox, code=DV8235, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8235 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mediabox, code=JFK, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mediabox, code=JFK, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val JFK = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
