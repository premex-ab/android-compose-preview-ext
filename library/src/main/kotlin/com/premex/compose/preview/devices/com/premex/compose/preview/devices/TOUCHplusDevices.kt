package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOUCH-plus device specifications for Android Compose previews.
 *
 * This extension provides TOUCH-plus device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TOUCHplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TOUCHplus: Any
  get() = object {
      /** DeviceSpec(manufacturer=TOUCH-plus, code=1100AS, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOUCH-plus, code=1100AS, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val _1100AS = "spec:width=800,height=1280,unit=px,dpi=180"

  }
