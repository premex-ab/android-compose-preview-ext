package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TREKSTOR device specifications for Android Compose previews.
 *
 * This extension provides TREKSTOR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TREKSTOR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TREKSTOR: Any
  get() = object {
      /** DeviceSpec(manufacturer=TREKSTOR, code=THMTKAW03232, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TREKSTOR, code=THMTKAW03232,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val THMTKAW03232 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
