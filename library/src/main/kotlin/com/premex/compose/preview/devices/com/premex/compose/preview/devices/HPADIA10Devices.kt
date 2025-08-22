package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HPADIA10 device specifications for Android Compose previews.
 *
 * This extension provides HPADIA10 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HPADIA10.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HPADIA10: Any
  get() = object {
      /** DeviceSpec(manufacturer=HPADIA10, code=GACRUX, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HPADIA10, code=GACRUX, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GACRUX = "spec:width=800,height=1280,unit=px,dpi=160"

  }
