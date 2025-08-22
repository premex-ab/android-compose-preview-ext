package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZETATV device specifications for Android Compose previews.
 *
 * This extension provides ZETATV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZETATV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZETATV: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZETATV, code=DV8545-C-KUT, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZETATV, code=DV8545-C-KUT,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8545_C_KUT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
