package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * kiddoboo device specifications for Android Compose previews.
 *
 * This extension provides kiddoboo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kiddoboo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kiddoboo: Any
  get() = object {
      /** DeviceSpec(manufacturer=kiddoboo, code=KB101, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=kiddoboo, code=KB101, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val KB101 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
