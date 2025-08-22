package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GOODTEL device specifications for Android Compose previews.
 *
 * This extension provides GOODTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GOODTEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GOODTEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=GOODTEL, code=G10_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G10_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val G10_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=GOODTEL, code=G10_T_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G10_T_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val G10_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GOODTEL, code=G10_T_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G10_T_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val G10_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GOODTEL, code=G10_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G10_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val G10_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GOODTEL, code=G2_A_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G2_A_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val G2_A_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GOODTEL, code=G2_T_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G2_T_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val G2_T_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GOODTEL, code=G2_T_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G2_T_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val G2_T_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GOODTEL, code=G3, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G3, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val G3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GOODTEL, code=G3_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G3_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val G3_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GOODTEL, code=G7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val G7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GOODTEL, code=G7_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G7_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val G7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GOODTEL, code=G7_EEA_T, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G7_EEA_T, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val G7_EEA_T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GOODTEL, code=G7_T, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G7_T, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val G7_T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GOODTEL, code=G9_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G9_EEA, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val G9_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GOODTEL, code=G9_US, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOODTEL, code=G9_US, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val G9_US = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
