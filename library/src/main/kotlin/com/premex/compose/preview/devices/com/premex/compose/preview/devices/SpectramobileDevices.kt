package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Spectramobile device specifications for Android Compose previews.
 *
 * This extension provides Spectramobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Spectramobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Spectramobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Spectramobile, code=Spectra_J1, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Spectramobile, code=Spectra_J1,
      width=720, height=1612, dpi=280, isGoogleDevice=false).code */
      val SPECTRA_J1 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Spectramobile, code=Spectra_J1P, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Spectramobile, code=Spectra_J1P,
      width=720, height=1612, dpi=280, isGoogleDevice=false).code */
      val SPECTRA_J1P = "spec:width=720,height=1612,unit=px,dpi=280"

  }
