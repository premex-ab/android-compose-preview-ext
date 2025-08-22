package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Prixton device specifications for Android Compose previews.
 *
 * This extension provides Prixton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Prixton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Prixton: Any
  get() = object {
      /** DeviceSpec(manufacturer=Prixton, code=Expert, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prixton, code=Expert, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EXPERT = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prixton, code=T9120, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prixton, code=T9120, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T9120 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
