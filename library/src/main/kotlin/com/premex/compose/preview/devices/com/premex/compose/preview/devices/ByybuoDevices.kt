package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Byybuo device specifications for Android Compose previews.
 *
 * This extension provides Byybuo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Byybuo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Byybuo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Byybuo, code=A10_EU, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Byybuo, code=A10_EU, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A10_EU = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Byybuo, code=A10_L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Byybuo, code=A10_L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A10_L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Byybuo, code=SmartPad_A10_EU, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Byybuo, code=SmartPad_A10_EU,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SMARTPAD_A10_EU = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Byybuo, code=SmartPad_A10_L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Byybuo, code=SmartPad_A10_L,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SMARTPAD_A10_L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Byybuo, code=SmartPad_A70W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Byybuo, code=SmartPad_A70W,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SMARTPAD_A70W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Byybuo, code=SmartPad_A70W_EU, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Byybuo, code=SmartPad_A70W_EU,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SMARTPAD_A70W_EU = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Byybuo, code=SmartPad_K7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Byybuo, code=SmartPad_K7,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SMARTPAD_K7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Byybuo, code=SmartPad_K7_EU, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Byybuo, code=SmartPad_K7_EU,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SMARTPAD_K7_EU = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Byybuo, code=SmartPad_T20, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Byybuo, code=SmartPad_T20,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val SMARTPAD_T20 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
