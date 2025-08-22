package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mitsui device specifications for Android Compose previews.
 *
 * This extension provides Mitsui device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mitsui.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mitsui: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mitsui, code=MC32020, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mitsui, code=MC32020, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MC32020 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
