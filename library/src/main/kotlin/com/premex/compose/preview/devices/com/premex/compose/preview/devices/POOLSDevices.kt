package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POOLS device specifications for Android Compose previews.
 *
 * This extension provides POOLS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.POOLS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.POOLS: Any
  get() = object {
      /** DeviceSpec(manufacturer=POOLS, code=POOLS_The_DOLLAR, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POOLS, code=POOLS_The_DOLLAR,
      width=1080, height=2220, dpi=440, isGoogleDevice=false).code */
      val POOLS_THE_DOLLAR = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
