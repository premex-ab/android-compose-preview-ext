package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAGCH device specifications for Android Compose previews.
 *
 * This extension provides MAGCH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAGCH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAGCH: Any
  get() = object {
      /** DeviceSpec(manufacturer=MAGCH, code=M210, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAGCH, code=M210, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val M210 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MAGCH, code=M321, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAGCH, code=M321, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M321 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MAGCH, code=M321-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAGCH, code=M321-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M321_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MAGCH, code=M610, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAGCH, code=M610, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M610 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MAGCH, code=M610-EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAGCH, code=M610-EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M610_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MAGCH, code=M820, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAGCH, code=M820, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M820 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MAGCH, code=M820-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAGCH, code=M820-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M820_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MAGCH, code=M821, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAGCH, code=M821, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M821 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MAGCH, code=M821-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAGCH, code=M821-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M821_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MAGCH, code=T7_Pro, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAGCH, code=T7_Pro, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T7_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

  }
