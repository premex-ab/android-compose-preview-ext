package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bluslate device specifications for Android Compose previews.
 *
 * This extension provides Bluslate device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bluslate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bluslate: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bluslate, code=Bluslate8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluslate, code=Bluslate8,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val BLUSLATE8 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
