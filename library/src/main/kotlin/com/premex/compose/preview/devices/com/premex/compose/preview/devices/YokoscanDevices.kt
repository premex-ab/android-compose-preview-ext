package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Yokoscan device specifications for Android Compose previews.
 *
 * This extension provides Yokoscan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yokoscan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yokoscan: Any
  get() = object {
      /** DeviceSpec(manufacturer=Yokoscan, code=TC60_EEA, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yokoscan, code=TC60_EEA, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TC60_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

  }
