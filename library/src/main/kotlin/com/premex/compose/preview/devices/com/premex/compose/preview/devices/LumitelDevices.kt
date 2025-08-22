package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Lumitel device specifications for Android Compose previews.
 *
 * This extension provides Lumitel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lumitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lumitel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Lumitel, code=L9502, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lumitel, code=L9502, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val L9502 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lumitel, code=L9503, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lumitel, code=L9503, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val L9503 = "spec:width=480,height=960,unit=px,dpi=240"

  }
