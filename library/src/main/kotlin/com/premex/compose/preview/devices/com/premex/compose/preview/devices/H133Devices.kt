package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * H133 device specifications for Android Compose previews.
 *
 * This extension provides H133 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.H133.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.H133: Any
  get() = object {
      /** DeviceSpec(manufacturer=H133, code=Betacrux, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=H133, code=Betacrux, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val BETACRUX = "spec:width=800,height=1280,unit=px,dpi=160"

  }
