package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TVUp device specifications for Android Compose previews.
 *
 * This extension provides TVUp device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TVUp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TVUp: Any
  get() = object {
      /** DeviceSpec(manufacturer=TVUp, code=SEI300T, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TVUp, code=SEI300T, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI300T = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
