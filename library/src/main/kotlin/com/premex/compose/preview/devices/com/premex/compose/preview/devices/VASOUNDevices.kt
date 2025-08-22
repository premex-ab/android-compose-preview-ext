package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VASOUN device specifications for Android Compose previews.
 *
 * This extension provides VASOUN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VASOUN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VASOUN: Any
  get() = object {
      /** DeviceSpec(manufacturer=VASOUN, code=L10_A01, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_A01, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L10_A01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_A01_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_A01_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val L10_A01_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_A02, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_A02, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L10_A02 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_A03, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_A03, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val L10_A03 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_A03_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_A03_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val L10_A03_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_A05, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_A05, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val L10_A05 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_A05_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_A05_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val L10_A05_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VASOUN, code=L10-T02, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10-T02, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val L10_T02 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VASOUN, code=L10-T02-EEA, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10-T02-EEA,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val L10_T02_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_T05, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_T05, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val L10_T05 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_T05_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_T05_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val L10_T05_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_T06, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_T06, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val L10_T06 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_T06_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_T06_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val L10_T06_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_T08, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_T08, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val L10_T08 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_T08_EEA, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_T08_EEA,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val L10_T08_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_T10, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_T10, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val L10_T10 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VASOUN, code=L10_T10_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10_T10_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val L10_T10_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VASOUN, code=L10-T11, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10-T11, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val L10_T11 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=VASOUN, code=L10-T11-EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=L10-T11-EEA,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val L10_T11_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=VASOUN, code=M7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=M7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VASOUN, code=M7_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=M7_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VASOUN, code=TAB12, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=TAB12, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val TAB12 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=VASOUN, code=TAB12_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VASOUN, code=TAB12_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val TAB12_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

  }
