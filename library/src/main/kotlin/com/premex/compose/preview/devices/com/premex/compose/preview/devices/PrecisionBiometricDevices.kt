package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PrecisionBiometric device specifications for Android Compose previews.
 *
 * This extension provides PrecisionBiometric device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PrecisionBiometric.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PrecisionBiometric: Any
  get() = object {
      /** DeviceSpec(manufacturer=PrecisionBiometric, code=PBTAB100-1G3, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PrecisionBiometric,
      code=PBTAB100-1G3, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PBTAB100_1G3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PrecisionBiometric, code=PBTAB100-2G4, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PrecisionBiometric,
      code=PBTAB100-2G4, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PBTAB100_2G4 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
