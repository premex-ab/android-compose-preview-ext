package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Acepad device specifications for Android Compose previews.
 *
 * This extension provides Acepad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Acepad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Acepad: Any
  get() = object {
      /** DeviceSpec(manufacturer=Acepad, code=A130, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Acepad, code=A130, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A130 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Acepad, code=A131, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Acepad, code=A131, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val A131 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Acepad, code=A131_14, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Acepad, code=A131_14, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A131_14 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Acepad, code=A140, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Acepad, code=A140, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val A140 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Acepad, code=A145, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Acepad, code=A145, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val A145 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Acepad, code=A150, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Acepad, code=A150, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val A150 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Acepad, code=A150_14, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Acepad, code=A150_14, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val A150_14 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Acepad, code=A170, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Acepad, code=A170, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val A170 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Acepad, code=A171_14, width=1200, height=2000, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Acepad, code=A171_14, width=1200,
      height=2000, dpi=213, isGoogleDevice=false).code */
      val A171_14 = "spec:width=1200,height=2000,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Acepad, code=Acepad_HIGH_EEA, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Acepad, code=Acepad_HIGH_EEA,
      width=1600, height=2560, dpi=320, isGoogleDevice=false).code */
      val ACEPAD_HIGH_EEA = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Acepad, code=AX1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Acepad, code=AX1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AX1 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
