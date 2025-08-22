package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FEONAL device specifications for Android Compose previews.
 *
 * This extension provides FEONAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FEONAL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FEONAL: Any
  get() = object {
      /** DeviceSpec(manufacturer=FEONAL, code=D105_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FEONAL, code=D105_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val D105_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FEONAL, code=D106_EEA, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FEONAL, code=D106_EEA, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val D106_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=FEONAL, code=D115_EEA, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FEONAL, code=D115_EEA, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val D115_EEA = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FEONAL, code=D118_EEA, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FEONAL, code=D118_EEA, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val D118_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=FEONAL, code=K118_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FEONAL, code=K118_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K118_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FEONAL, code=K711_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FEONAL, code=K711_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K711_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
