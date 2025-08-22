package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OMAX device specifications for Android Compose previews.
 *
 * This extension provides OMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OMAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OMAX: Any
  get() = object {
      /** DeviceSpec(manufacturer=OMAX, code=7PAN, width=2160, height=3840, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMAX, code=7PAN, width=2160,
      height=3840, dpi=420, isGoogleDevice=false).code */
      val _7PAN = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
