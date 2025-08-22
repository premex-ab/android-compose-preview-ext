package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Camfone device specifications for Android Compose previews.
 *
 * This extension provides Camfone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Camfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Camfone: Any
  get() = object {
      /** DeviceSpec(manufacturer=Camfone, code=Hero_13, width=240, height=282, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Camfone, code=Hero_13, width=240,
      height=282, dpi=120, isGoogleDevice=false).code */
      val HERO_13 = "spec:width=240,height=282,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=Camfone, code=Honey_Y2s, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Camfone, code=Honey_Y2s, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val HONEY_Y2S = "spec:width=720,height=1520,unit=px,dpi=320"

  }
