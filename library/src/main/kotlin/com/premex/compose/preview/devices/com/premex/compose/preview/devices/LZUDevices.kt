package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LZU device specifications for Android Compose previews.
 *
 * This extension provides LZU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LZU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LZU: Any
  get() = object {
      /** DeviceSpec(manufacturer=LZU, code=D113, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LZU, code=D113, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val D113 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LZU, code=D113_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LZU, code=D113_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val D113_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
