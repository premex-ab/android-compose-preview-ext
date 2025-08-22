package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ETG device specifications for Android Compose previews.
 *
 * This extension provides ETG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ETG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ETG: Any
  get() = object {
      /** DeviceSpec(manufacturer=ETG, code=ETG-BT1121, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ETG, code=ETG-BT1121, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val ETG_BT1121 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
