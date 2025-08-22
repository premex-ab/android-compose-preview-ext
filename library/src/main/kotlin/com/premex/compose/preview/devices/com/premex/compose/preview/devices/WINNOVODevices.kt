package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WINNOVO device specifications for Android Compose previews.
 *
 * This extension provides WINNOVO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WINNOVO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WINNOVO: Any
  get() = object {
      /** DeviceSpec(manufacturer=WINNOVO, code=H10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINNOVO, code=H10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val H10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WINNOVO, code=H10_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINNOVO, code=H10_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val H10_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WINNOVO, code=H7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINNOVO, code=H7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val H7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WINNOVO, code=H7_US, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINNOVO, code=H7_US, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val H7_US = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WINNOVO, code=H8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINNOVO, code=H8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val H8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WINNOVO, code=H8_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINNOVO, code=H8_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val H8_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WINNOVO, code=T10LTE, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINNOVO, code=T10LTE, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T10LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WINNOVO, code=TS10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINNOVO, code=TS10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TS10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WINNOVO, code=TS10_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINNOVO, code=TS10_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TS10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WINNOVO, code=TS7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINNOVO, code=TS7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WINNOVO, code=TS7_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINNOVO, code=TS7_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
