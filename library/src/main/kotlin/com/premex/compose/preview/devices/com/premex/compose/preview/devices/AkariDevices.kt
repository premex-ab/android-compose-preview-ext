package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Akari device specifications for Android Compose previews.
 *
 * This extension provides Akari device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Akari.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Akari: Any
  get() = object {
      /** DeviceSpec(manufacturer=Akari, code=DV8035, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Akari, code=DV8035, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DV8035 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Akari, code=DV8219, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Akari, code=DV8219, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val DV8219 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
