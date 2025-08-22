package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SEMP device specifications for Android Compose previews.
 *
 * This extension provides SEMP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SEMP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SEMP: Any
  get() = object {
      /** DeviceSpec(manufacturer=SEMP, code=GO3C, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEMP, code=GO3C, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val GO3C = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SEMP, code=GO3C_Plus, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEMP, code=GO3C_Plus, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val GO3C_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SEMP, code=GO3E, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEMP, code=GO3E, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val GO3E = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SEMP, code=GO5E, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEMP, code=GO5E, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GO5E = "spec:width=720,height=1440,unit=px,dpi=320"

  }
