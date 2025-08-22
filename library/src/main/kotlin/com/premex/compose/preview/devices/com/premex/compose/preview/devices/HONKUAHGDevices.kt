package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HONKUAHG device specifications for Android Compose previews.
 *
 * This extension provides HONKUAHG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HONKUAHG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HONKUAHG: Any
  get() = object {
      /** DeviceSpec(manufacturer=HONKUAHG, code=EV10, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HONKUAHG, code=EV10, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val EV10 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
