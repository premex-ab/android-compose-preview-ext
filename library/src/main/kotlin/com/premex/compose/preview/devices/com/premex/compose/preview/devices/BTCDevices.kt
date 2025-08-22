package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BTC device specifications for Android Compose previews.
 *
 * This extension provides BTC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BTC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BTC: Any
  get() = object {
      /** DeviceSpec(manufacturer=BTC, code=S5548, width=480, height=960, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BTC, code=S5548, width=480,
      height=960, dpi=160, isGoogleDevice=false).code */
      val S5548 = "spec:width=480,height=960,unit=px,dpi=160"

  }
