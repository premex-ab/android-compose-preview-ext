package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Miramage device specifications for Android Compose previews.
 *
 * This extension provides Miramage device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Miramage.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Miramage: Any
  get() = object {
      /** DeviceSpec(manufacturer=Miramage, code=barking, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Miramage, code=barking, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Miramage, code=beaudry, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Miramage, code=beaudry, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BEAUDRY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Miramage, code=surface, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Miramage, code=surface, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val SURFACE = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
