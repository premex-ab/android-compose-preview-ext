package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Paitanry device specifications for Android Compose previews.
 *
 * This extension provides Paitanry device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Paitanry.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Paitanry: Any
  get() = object {
      /** DeviceSpec(manufacturer=Paitanry, code=CH10PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Paitanry, code=CH10PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CH10PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Paitanry, code=CH10PROMAX, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Paitanry, code=CH10PROMAX,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val CH10PROMAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Paitanry, code=R16-PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Paitanry, code=R16-PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val R16_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Paitanry, code=SSK10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Paitanry, code=SSK10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SSK10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
