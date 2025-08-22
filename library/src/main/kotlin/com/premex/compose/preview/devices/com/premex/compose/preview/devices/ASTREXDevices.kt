package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ASTREX device specifications for Android Compose previews.
 *
 * This extension provides ASTREX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ASTREX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ASTREX: Any
  get() = object {
      /** DeviceSpec(manufacturer=ASTREX, code=VegaPro, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTREX, code=VegaPro, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val VEGAPRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ASTREX, code=Victory, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTREX, code=Victory, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val VICTORY = "spec:width=800,height=1280,unit=px,dpi=160"

  }
