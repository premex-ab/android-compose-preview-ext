package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * surface device specifications for Android Compose previews.
 *
 * This extension provides surface device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Surface.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Surface: Any
  get() = object {
      /** DeviceSpec(manufacturer=surface, code=duo, width=1350, height=1800, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=surface, code=duo, width=1350,
      height=1800, dpi=400, isGoogleDevice=false).code */
      val DUO = "spec:width=1350,height=1800,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=surface, code=duo2, width=1344, height=1892, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=surface, code=duo2, width=1344,
      height=1892, dpi=400, isGoogleDevice=false).code */
      val DUO2 = "spec:width=1344,height=1892,unit=px,dpi=400"

  }
