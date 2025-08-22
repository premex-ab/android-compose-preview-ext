package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Everis device specifications for Android Compose previews.
 *
 * This extension provides Everis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Everis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Everis: Any
  get() = object {
      /** DeviceSpec(manufacturer=Everis, code=E0109, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Everis, code=E0109, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val E0109 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Everis, code=E0111, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Everis, code=E0111, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E0111 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Everis, code=E0112, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Everis, code=E0112, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val E0112 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Everis, code=E0113, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Everis, code=E0113, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E0113 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Everis, code=E0114, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Everis, code=E0114, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E0114 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Everis, code=E0117, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Everis, code=E0117, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E0117 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Everis, code=E0118, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Everis, code=E0118, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val E0118 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Everis, code=E0120, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Everis, code=E0120, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E0120 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
