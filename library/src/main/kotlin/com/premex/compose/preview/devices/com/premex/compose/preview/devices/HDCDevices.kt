package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HDC device specifications for Android Compose previews.
 *
 * This extension provides HDC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HDC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HDC: Any
  get() = object {
      /** DeviceSpec(manufacturer=HDC, code=H10_ONE, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HDC, code=H10_ONE, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val H10_ONE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HDC, code=H7_ONE, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HDC, code=H7_ONE, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val H7_ONE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HDC, code=T10I-4128, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HDC, code=T10I-4128, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T10I_4128 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HDC, code=T10_232, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HDC, code=T10_232, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T10_232 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HDC, code=T7I_232, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HDC, code=T7I_232, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T7I_232 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
