package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AHA device specifications for Android Compose previews.
 *
 * This extension provides AHA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AHA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AHA: Any
  get() = object {
      /** DeviceSpec(manufacturer=AHA, code=AHA_ULTRA_RK3588, width=2160, height=3840, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AHA, code=AHA_ULTRA_RK3588,
      width=2160, height=3840, dpi=420, isGoogleDevice=false).code */
      val AHA_ULTRA_RK3588 = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
