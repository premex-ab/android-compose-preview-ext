package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Compaq device specifications for Android Compose previews.
 *
 * This extension provides Compaq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Compaq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Compaq: Any
  get() = object {
      /** DeviceSpec(manufacturer=Compaq, code=fireball, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Compaq, code=fireball, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val FIREBALL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Compaq, code=Q6, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Compaq, code=Q6, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val Q6 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Compaq, code=QT10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Compaq, code=QT10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val QT10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Compaq, code=QTAB, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Compaq, code=QTAB, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val QTAB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Compaq, code=Qtab, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Compaq, code=Qtab, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val QTAB = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Compaq, code=Qtab10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Compaq, code=Qtab10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val QTAB10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Compaq, code=Qtab10Plus, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Compaq, code=Qtab10Plus,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val QTAB10PLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Compaq, code=QTab10_LTE, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Compaq, code=QTab10_LTE, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val QTAB10_LTE = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Compaq, code=QTab8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Compaq, code=QTab8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val QTAB8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Compaq, code=QTab8_LTE, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Compaq, code=QTab8_LTE, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val QTAB8_LTE = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Compaq, code=QTAB_NOTE, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Compaq, code=QTAB_NOTE, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val QTAB_NOTE = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
