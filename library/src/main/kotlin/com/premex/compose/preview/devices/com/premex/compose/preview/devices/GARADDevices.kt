package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GARAD device specifications for Android Compose previews.
 *
 * This extension provides GARAD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GARAD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GARAD: Any
  get() = object {
      /** DeviceSpec(manufacturer=GARAD, code=GARAD_fire, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GARAD, code=GARAD_fire, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val GARAD_FIRE = "spec:width=480,height=960,unit=px,dpi=240"

  }
