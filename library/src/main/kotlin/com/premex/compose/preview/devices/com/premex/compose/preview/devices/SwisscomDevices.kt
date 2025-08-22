package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Swisscom device specifications for Android Compose previews.
 *
 * This extension provides Swisscom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Swisscom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Swisscom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Swisscom, code=IP1800, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Swisscom, code=IP1800, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val IP1800 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Swisscom, code=IP2000, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Swisscom, code=IP2000, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val IP2000 = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Swisscom, code=IP2300, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Swisscom, code=IP2300, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val IP2300 = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
