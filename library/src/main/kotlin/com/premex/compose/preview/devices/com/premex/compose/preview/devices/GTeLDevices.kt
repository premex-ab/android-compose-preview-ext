package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GTeL device specifications for Android Compose previews.
 *
 * This extension provides GTeL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTeL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTeL: Any
  get() = object {
      /** DeviceSpec(manufacturer=GTeL, code=Mx6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GTeL, code=Mx6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MX6 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
