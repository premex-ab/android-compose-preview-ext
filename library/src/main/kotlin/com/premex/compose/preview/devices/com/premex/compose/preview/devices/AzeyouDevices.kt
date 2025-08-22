package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Azeyou device specifications for Android Compose previews.
 *
 * This extension provides Azeyou device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Azeyou.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Azeyou: Any
  get() = object {
      /** DeviceSpec(manufacturer=Azeyou, code=AT1002J, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=AT1002J, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AT1002J = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Azeyou, code=AT1011E, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=AT1011E, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AT1011E = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Azeyou, code=AT1011U, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=AT1011U, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AT1011U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Azeyou, code=AT1012E, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=AT1012E, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AT1012E = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Azeyou, code=AT1012U, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=AT1012U, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AT1012U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Azeyou, code=AT1014, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=AT1014, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AT1014 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Azeyou, code=AT1014U, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=AT1014U, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AT1014U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Azeyou, code=AT1016BBK, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=AT1016BBK, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AT1016BBK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Azeyou, code=AT1016E, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=AT1016E, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AT1016E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Azeyou, code=AT1016U, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=AT1016U, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AT1016U = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Azeyou, code=AT1101, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=AT1101, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val AT1101 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Azeyou, code=AT1202J, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=AT1202J, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val AT1202J = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Azeyou, code=M17QF27A, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azeyou, code=M17QF27A, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val M17QF27A = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
