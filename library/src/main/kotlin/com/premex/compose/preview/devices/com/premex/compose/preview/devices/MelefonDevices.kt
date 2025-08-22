package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Melefon device specifications for Android Compose previews.
 *
 * This extension provides Melefon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Melefon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Melefon: Any
  get() = object {
      /** DeviceSpec(manufacturer=Melefon, code=Good, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Melefon, code=Good, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val GOOD = "spec:width=480,height=960,unit=px,dpi=240"

  }
