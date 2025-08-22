package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Archos device specifications for Android Compose previews.
 *
 * This extension provides Archos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Archos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Archos: Any
  get() = object {
      /** DeviceSpec(manufacturer=Archos, code=ac101bcv, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=ac101bcv, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val AC101BCV = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Archos, code=ac101cpl, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=ac101cpl, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AC101CPL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Archos, code=ac101dne, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=ac101dne, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val AC101DNE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Archos, code=ac101ma, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=ac101ma, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val AC101MA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Archos, code=ac101xel, width=600, height=1024, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=ac101xel, width=600,
      height=1024, dpi=120, isGoogleDevice=false).code */
      val AC101XEL = "spec:width=600,height=1024,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=Archos, code=ac50heplus, width=720, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=ac50heplus, width=720,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val AC50HEPLUS = "spec:width=720,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Archos, code=AC50PL4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=AC50PL4G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AC50PL4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Archos, code=ac55heplus, width=720, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=ac55heplus, width=720,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val AC55HEPLUS = "spec:width=720,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Archos, code=ac94fff, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=ac94fff, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AC94FFF = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Archos, code=act101hd24g, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=act101hd24g,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ACT101HD24G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Archos, code=act105fhd4g, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=act105fhd4g,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val ACT105FHD4G = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Archos, code=act105fhdwful, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=act105fhdwful,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val ACT105FHDWFUL = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Archos, code=hometablet, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Archos, code=hometablet, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HOMETABLET = "spec:width=600,height=1024,unit=px,dpi=160"

  }
