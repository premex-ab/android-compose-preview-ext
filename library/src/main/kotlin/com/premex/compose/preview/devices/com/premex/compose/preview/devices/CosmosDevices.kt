package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cosmos device specifications for Android Compose previews.
 *
 * This extension provides Cosmos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cosmos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cosmos: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cosmos, code=Lynx_10in, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cosmos, code=Lynx_10in, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val LYNX_10IN = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
