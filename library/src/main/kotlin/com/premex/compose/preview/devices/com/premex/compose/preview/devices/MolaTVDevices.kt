package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mola_TV device specifications for Android Compose previews.
 *
 * This extension provides Mola_TV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MolaTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MolaTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mola_TV, code=DV8235_P, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mola_TV, code=DV8235_P, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8235_P = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
