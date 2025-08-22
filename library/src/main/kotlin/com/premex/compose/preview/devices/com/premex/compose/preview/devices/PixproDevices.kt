package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Pixpro device specifications for Android Compose previews.
 *
 * This extension provides Pixpro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pixpro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pixpro: Any
  get() = object {
      /** DeviceSpec(manufacturer=Pixpro, code=VT10_Rugged, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixpro, code=VT10_Rugged,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val VT10_RUGGED = "spec:width=800,height=1280,unit=px,dpi=180"

  }
