package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * xl device specifications for Android Compose previews.
 *
 * This extension provides xl device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xl: Any
  get() = object {
      /** DeviceSpec(manufacturer=xl, code=STI6xxx, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xl, code=STI6xxx, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val STI6XXX = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
