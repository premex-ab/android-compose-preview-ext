package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SPECTRA device specifications for Android Compose previews.
 *
 * This extension provides SPECTRA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SPECTRA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SPECTRA: Any
  get() = object {
      /** DeviceSpec(manufacturer=SPECTRA, code=TAP-POS, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPECTRA, code=TAP-POS, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TAP_POS = "spec:width=480,height=960,unit=px,dpi=240"

  }
