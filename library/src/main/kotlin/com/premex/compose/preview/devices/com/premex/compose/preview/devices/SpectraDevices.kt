package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Spectra device specifications for Android Compose previews.
 *
 * This extension provides Spectra device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Spectra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Spectra: Any
  get() = object {
      /** DeviceSpec(manufacturer=Spectra, code=bcat, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Spectra, code=bcat, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BCAT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Spectra, code=MobileMapper6, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Spectra, code=MobileMapper6,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val MOBILEMAPPER6 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
