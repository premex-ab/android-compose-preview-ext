package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BENEVE device specifications for Android Compose previews.
 *
 * This extension provides BENEVE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BENEVE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BENEVE: Any
  get() = object {
      /** DeviceSpec(manufacturer=BENEVE, code=M1036, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BENEVE, code=M1036, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M1036 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BENEVE, code=M1038_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BENEVE, code=M1038_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M1038_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BENEVE, code=M51S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BENEVE, code=M51S, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M51S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BENEVE, code=M51S_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BENEVE, code=M51S_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M51S_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BENEVE, code=M53, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BENEVE, code=M53, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val M53 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BENEVE, code=M53_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BENEVE, code=M53_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M53_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BENEVE, code=M55_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BENEVE, code=M55_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M55_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BENEVE, code=M7152, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BENEVE, code=M7152, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M7152 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BENEVE, code=M7152D1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BENEVE, code=M7152D1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M7152D1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BENEVE, code=M7152D1_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BENEVE, code=M7152D1_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M7152D1_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BENEVE, code=M7152P_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BENEVE, code=M7152P_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M7152P_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
