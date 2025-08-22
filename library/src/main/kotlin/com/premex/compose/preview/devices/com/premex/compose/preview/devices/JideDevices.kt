package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Jide device specifications for Android Compose previews.
 *
 * This extension provides Jide device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jide.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jide: Any
  get() = object {
      /** DeviceSpec(manufacturer=Jide, code=rm1g, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jide, code=rm1g, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val RM1G = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
