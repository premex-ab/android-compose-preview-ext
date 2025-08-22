package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HIGHSCREEN device specifications for Android Compose previews.
 *
 * This extension provides HIGHSCREEN device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HIGHSCREEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HIGHSCREEN: Any
  get() = object {
      /** DeviceSpec(manufacturer=HIGHSCREEN, code=PowerFiveMaxLite, width=1080, height=2160,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIGHSCREEN,
      code=PowerFiveMaxLite, width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val POWERFIVEMAXLITE = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
