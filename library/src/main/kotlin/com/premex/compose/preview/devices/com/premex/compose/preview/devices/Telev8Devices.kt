package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Telev8 device specifications for Android Compose previews.
 *
 * This extension provides Telev8 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telev8.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telev8: Any
  get() = object {
      /** DeviceSpec(manufacturer=Telev8, code=MH700, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telev8, code=MH700, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MH700 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
