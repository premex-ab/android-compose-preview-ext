package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HAOVM device specifications for Android Compose previews.
 *
 * This extension provides HAOVM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HAOVM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HAOVM: Any
  get() = object {
      /** DeviceSpec(manufacturer=HAOVM, code=HP10, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAOVM, code=HP10, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val HP10 = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=HAOVM, code=HP10_EEA, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAOVM, code=HP10_EEA, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val HP10_EEA = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=HAOVM, code=HP20, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAOVM, code=HP20, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val HP20 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HAOVM, code=P10_2024, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAOVM, code=P10_2024, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P10_2024 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HAOVM, code=P10_Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAOVM, code=P10_Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HAOVM, code=P20, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAOVM, code=P20, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P20 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HAOVM, code=P9, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAOVM, code=P9, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P9 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HAOVM, code=P9_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAOVM, code=P9_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P9_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HAOVM, code=PS30, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAOVM, code=PS30, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val PS30 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HAOVM, code=T2000, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAOVM, code=T2000, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T2000 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
