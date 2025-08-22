package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Pokini device specifications for Android Compose previews.
 *
 * This extension provides Pokini device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pokini.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pokini: Any
  get() = object {
      /** DeviceSpec(manufacturer=Pokini, code=K6, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pokini, code=K6, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val K6 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
