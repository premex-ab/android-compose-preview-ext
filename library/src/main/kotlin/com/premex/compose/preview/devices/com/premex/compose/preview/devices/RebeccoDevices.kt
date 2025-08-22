package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Rebecco device specifications for Android Compose previews.
 *
 * This extension provides Rebecco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rebecco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rebecco: Any
  get() = object {
      /** DeviceSpec(manufacturer=Rebecco, code=K30_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rebecco, code=K30_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K30_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Rebecco, code=K30_ROW, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rebecco, code=K30_ROW, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K30_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Rebecco, code=K50_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rebecco, code=K50_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Rebecco, code=K50_ROW, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rebecco, code=K50_ROW, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K50_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Rebecco, code=K50_ROW_B, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rebecco, code=K50_ROW_B, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K50_ROW_B = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Rebecco, code=K70i_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rebecco, code=K70i_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K70I_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Rebecco, code=K70_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rebecco, code=K70_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K70_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Rebecco, code=K70_ROW, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rebecco, code=K70_ROW, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K70_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Rebecco, code=K80_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rebecco, code=K80_ROW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K80_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Rebecco, code=M30_Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rebecco, code=M30_Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M30_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
