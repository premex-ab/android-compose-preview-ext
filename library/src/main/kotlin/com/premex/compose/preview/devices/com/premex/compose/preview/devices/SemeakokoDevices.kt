package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Semeakoko device specifications for Android Compose previews.
 *
 * This extension provides Semeakoko device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Semeakoko.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Semeakoko: Any
  get() = object {
      /** DeviceSpec(manufacturer=Semeakoko, code=M_766, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Semeakoko, code=M_766, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M_766 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Semeakoko, code=S10A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Semeakoko, code=S10A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S10A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Semeakoko, code=SS10A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Semeakoko, code=SS10A, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SS10A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Semeakoko, code=SS10A_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Semeakoko, code=SS10A_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SS10A_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Semeakoko, code=SS-35, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Semeakoko, code=SS-35, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SS_35 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Semeakoko, code=SS-35_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Semeakoko, code=SS-35_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SS_35_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Semeakoko, code=SS-P30, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Semeakoko, code=SS-P30, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SS_P30 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Semeakoko, code=SS-P30_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Semeakoko, code=SS-P30_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SS_P30_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Semeakoko, code=S-764, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Semeakoko, code=S-764, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val S_764 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Semeakoko, code=S-764-EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Semeakoko, code=S-764-EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val S_764_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
