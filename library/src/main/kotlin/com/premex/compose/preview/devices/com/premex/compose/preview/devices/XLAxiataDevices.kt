package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XLAxiata device specifications for Android Compose previews.
 *
 * This extension provides XLAxiata device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XLAxiata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XLAxiata: Any
  get() = object {
      /** DeviceSpec(manufacturer=XLAxiata, code=DV8252, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XLAxiata, code=DV8252, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8252 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
