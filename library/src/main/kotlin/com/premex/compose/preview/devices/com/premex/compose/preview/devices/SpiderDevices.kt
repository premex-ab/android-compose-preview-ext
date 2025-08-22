package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Spider device specifications for Android Compose previews.
 *
 * This extension provides Spider device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Spider.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Spider: Any
  get() = object {
      /** DeviceSpec(manufacturer=Spider, code=Spider_A10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Spider, code=Spider_A10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SPIDER_A10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Spider, code=Spider_M10Pro, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Spider, code=Spider_M10Pro,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val SPIDER_M10PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
