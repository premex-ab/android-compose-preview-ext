package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SGIN device specifications for Android Compose previews.
 *
 * This extension provides SGIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SGIN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SGIN: Any
  get() = object {
      /** DeviceSpec(manufacturer=SGIN, code=A10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SGIN, code=A10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SGIN, code=C10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SGIN, code=C10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val C10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SGIN, code=C8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SGIN, code=C8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val C8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SGIN, code=E10P, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SGIN, code=E10P, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E10P = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SGIN, code=SGIN_E10M, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SGIN, code=SGIN_E10M, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val SGIN_E10M = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SGIN, code=SGIN_X10, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SGIN, code=SGIN_X10, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val SGIN_X10 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SGIN, code=T10S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SGIN, code=T10S, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SGIN, code=T12S, width=1200, height=2000, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SGIN, code=T12S, width=1200,
      height=2000, dpi=213, isGoogleDevice=false).code */
      val T12S = "spec:width=1200,height=2000,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SGIN, code=T12S_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SGIN, code=T12S_EEA, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T12S_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SGIN, code=T12S_ROW, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SGIN, code=T12S_ROW, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T12S_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SGIN, code=T12_EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SGIN, code=T12_EEA, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T12_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SGIN, code=T12_ROW, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SGIN, code=T12_ROW, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T12_ROW = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
