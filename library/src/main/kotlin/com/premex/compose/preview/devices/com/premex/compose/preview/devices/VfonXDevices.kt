package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VfonX device specifications for Android Compose previews.
 *
 * This extension provides VfonX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VfonX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VfonX: Any
  get() = object {
      /** DeviceSpec(manufacturer=VfonX, code=GP8, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VfonX, code=GP8, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val GP8 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
