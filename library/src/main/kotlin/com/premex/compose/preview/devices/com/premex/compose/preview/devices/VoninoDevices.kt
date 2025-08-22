package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vonino device specifications for Android Compose previews.
 *
 * This extension provides Vonino device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vonino.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vonino: Any
  get() = object {
      /** DeviceSpec(manufacturer=Vonino, code=Epic_E8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vonino, code=Epic_E8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EPIC_E8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vonino, code=iMart_Pro, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vonino, code=iMart_Pro, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val IMART_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vonino, code=Magnet_G30, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vonino, code=Magnet_G30, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MAGNET_G30 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vonino, code=Magnet_G50, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vonino, code=Magnet_G50, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MAGNET_G50 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vonino, code=Magnet_M10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vonino, code=Magnet_M10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MAGNET_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vonino, code=Magnet_M10_2020, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vonino, code=Magnet_M10_2020,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MAGNET_M10_2020 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vonino, code=Magnet_M1_A7, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vonino, code=Magnet_M1_A7,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MAGNET_M1_A7 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vonino, code=Pluri_M7_2020, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vonino, code=Pluri_M7_2020,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PLURI_M7_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vonino, code=Pluri_M8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vonino, code=Pluri_M8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PLURI_M8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vonino, code=Pluri_M8_2020, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vonino, code=Pluri_M8_2020,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PLURI_M8_2020 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vonino, code=Pluri_M8_2020_A10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vonino, code=Pluri_M8_2020_A10,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PLURI_M8_2020_A10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vonino, code=Xavy_T7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vonino, code=Xavy_T7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val XAVY_T7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
