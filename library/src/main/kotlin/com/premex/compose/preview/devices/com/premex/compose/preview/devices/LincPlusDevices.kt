package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LincPlus device specifications for Android Compose previews.
 *
 * This extension provides LincPlus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LincPlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LincPlus: Any
  get() = object {
      /** DeviceSpec(manufacturer=LincPlus, code=T4, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LincPlus, code=T4, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val T4 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LincPlus, code=T4_EU, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LincPlus, code=T4_EU, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val T4_EU = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
