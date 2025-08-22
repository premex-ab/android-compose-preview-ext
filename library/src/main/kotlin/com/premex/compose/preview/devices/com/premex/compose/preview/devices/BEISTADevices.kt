package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BEISTA device specifications for Android Compose previews.
 *
 * This extension provides BEISTA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BEISTA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BEISTA: Any
  get() = object {
      /** DeviceSpec(manufacturer=BEISTA, code=K105, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BEISTA, code=K105, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K105 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BEISTA, code=T30-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BEISTA, code=T30-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T30_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BEISTA, code=X101, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BEISTA, code=X101, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BEISTA, code=X104, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BEISTA, code=X104, width=1200,
      height=1920, dpi=260, isGoogleDevice=false).code */
      val X104 = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=BEISTA, code=X104-EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BEISTA, code=X104-EEA, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val X104_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BEISTA, code=X80-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BEISTA, code=X80-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val X80_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
