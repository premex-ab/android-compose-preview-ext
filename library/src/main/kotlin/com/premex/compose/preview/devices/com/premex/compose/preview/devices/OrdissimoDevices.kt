package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ordissimo device specifications for Android Compose previews.
 *
 * This extension provides Ordissimo device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ordissimo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ordissimo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ordissimo, code=Celia, width=1200, height=1920, dpi=272,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ordissimo, code=Celia, width=1200,
      height=1920, dpi=272, isGoogleDevice=false).code */
      val CELIA = "spec:width=1200,height=1920,unit=px,dpi=272"

      /** DeviceSpec(manufacturer=Ordissimo, code=LeNumero2, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ordissimo, code=LeNumero2,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val LENUMERO2 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Ordissimo, code=LeNumero2Mini, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ordissimo, code=LeNumero2Mini,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val LENUMERO2MINI = "spec:width=720,height=1440,unit=px,dpi=320"

  }
