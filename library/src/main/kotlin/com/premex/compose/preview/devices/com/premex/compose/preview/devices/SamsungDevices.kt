package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SAMSUNG device specifications for Android Compose previews.
 *
 * This extension provides SAMSUNG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Samsung.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Samsung: Any
  get() = object {
      /** DeviceSpec(manufacturer=SAMSUNG, code=SAMSUNG_INTERACTIVE_DISPLAY, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SAMSUNG,
      code=SAMSUNG_INTERACTIVE_DISPLAY, width=2160, height=3840, dpi=480, isGoogleDevice=false).code
      */
      val SAMSUNG_INTERACTIVE_DISPLAY = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
