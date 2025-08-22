package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Proton device specifications for Android Compose previews.
 *
 * This extension provides Proton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Proton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Proton: Any
  get() = object {
      /** DeviceSpec(manufacturer=Proton, code=P25_Ultra, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Proton, code=P25_Ultra, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val P25_ULTRA = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Proton, code=Proton_X10_Pro, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Proton, code=Proton_X10_Pro,
      width=720, height=1612, dpi=280, isGoogleDevice=false).code */
      val PROTON_X10_PRO = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Proton, code=Proton_X20_Pro, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Proton, code=Proton_X20_Pro,
      width=720, height=1612, dpi=280, isGoogleDevice=false).code */
      val PROTON_X20_PRO = "spec:width=720,height=1612,unit=px,dpi=280"

  }
