package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TTfone device specifications for Android Compose previews.
 *
 * This extension provides TTfone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TTfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TTfone: Any
  get() = object {
      /** DeviceSpec(manufacturer=TTfone, code=TTfone_TT20, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TTfone, code=TTfone_TT20,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val TTFONE_TT20 = "spec:width=480,height=800,unit=px,dpi=240"

  }
