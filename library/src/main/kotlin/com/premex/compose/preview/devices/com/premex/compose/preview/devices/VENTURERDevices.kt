package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VENTURER device specifications for Android Compose previews.
 *
 * This extension provides VENTURER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VENTURER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VENTURER: Any
  get() = object {
      /** DeviceSpec(manufacturer=VENTURER, code=CT9A03W23, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=CT9A03W23,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val CT9A03W23 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VENTURER, code=CT9A06P23, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=CT9A06P23,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val CT9A06P23 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VENTURER, code=VCT9B06Q22, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=VCT9B06Q22,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val VCT9B06Q22 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VENTURER, code=VCT9B06Q23, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=VCT9B06Q23,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val VCT9B06Q23 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VENTURER, code=VCT9B06Q23EU, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=VCT9B06Q23EU,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val VCT9B06Q23EU = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VENTURER, code=VCT9F0A68R23EU, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=VCT9F0A68R23EU,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val VCT9F0A68R23EU = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VENTURER, code=VCT9F78Q22, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=VCT9F78Q22,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val VCT9F78Q22 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VENTURER, code=VCT9F78Q22EU, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=VCT9F78Q22EU,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val VCT9F78Q22EU = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VENTURER, code=VCT9F78Q22-A0, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=VCT9F78Q22-A0,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val VCT9F78Q22_A0 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VENTURER, code=VCT9F78Q22-A1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=VCT9F78Q22-A1,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val VCT9F78Q22_A1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VENTURER, code=VCT9F78Q22-E, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=VCT9F78Q22-E,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val VCT9F78Q22_E = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VENTURER, code=VCT9F8A68RD, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=VCT9F8A68RD,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val VCT9F8A68RD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VENTURER, code=VCT9T48Q34, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=VCT9T48Q34,
      width=1080, height=1920, dpi=213, isGoogleDevice=false).code */
      val VCT9T48Q34 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VENTURER, code=VCT9T48Q34EU, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENTURER, code=VCT9T48Q34EU,
      width=1080, height=1920, dpi=213, isGoogleDevice=false).code */
      val VCT9T48Q34EU = "spec:width=1080,height=1920,unit=px,dpi=213"

  }
