package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZONKO device specifications for Android Compose previews.
 *
 * This extension provides ZONKO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZONKO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZONKO: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZONKO, code=D105, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=D105, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val D105 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZONKO, code=D106, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=D106, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val D106 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=ZONKO, code=D110, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=D110, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val D110 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=ZONKO, code=D115, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=D115, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val D115 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZONKO, code=D118, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=D118, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val D118 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=ZONKO, code=K101, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=K101, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZONKO, code=K101_EEA, width=1200, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=K101_EEA, width=1200,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val K101_EEA = "spec:width=1200,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZONKO, code=K105, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=K105, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K105 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZONKO, code=K105_EEA, width=1440, height=2960, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=K105_EEA, width=1440,
      height=2960, dpi=560, isGoogleDevice=false).code */
      val K105_EEA = "spec:width=1440,height=2960,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=ZONKO, code=K106, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=K106, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val K106 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZONKO, code=K110, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=K110, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K110 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZONKO, code=K113, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=K113, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K113 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZONKO, code=K116_M, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=K116_M, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K116_M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZONKO, code=K118, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=K118, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K118 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZONKO, code=K150, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=K150, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val K150 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=ZONKO, code=K710, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=K710, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K710 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZONKO, code=K711, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONKO, code=K711, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K711 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
