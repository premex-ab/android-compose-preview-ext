package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MEIZE device specifications for Android Compose previews.
 *
 * This extension provides MEIZE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MEIZE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MEIZE: Any
  get() = object {
      /** DeviceSpec(manufacturer=MEIZE, code=D105, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEIZE, code=D105, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val D105 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEIZE, code=D106, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEIZE, code=D106, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val D106 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=MEIZE, code=D115, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEIZE, code=D115, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val D115 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEIZE, code=D125_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEIZE, code=D125_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val D125_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEIZE, code=D126, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEIZE, code=D126, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val D126 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEIZE, code=D126_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEIZE, code=D126_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val D126_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
