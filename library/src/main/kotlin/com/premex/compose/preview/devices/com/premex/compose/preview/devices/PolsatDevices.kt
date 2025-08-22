package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Polsat device specifications for Android Compose previews.
 *
 * This extension provides Polsat device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Polsat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Polsat: Any
  get() = object {
      /** DeviceSpec(manufacturer=Polsat, code=m391_polsat, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polsat, code=m391_polsat,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val M391_POLSAT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
