package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VANKYO device specifications for Android Compose previews.
 *
 * This extension provides VANKYO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VANKYO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VANKYO: Any
  get() = object {
      /** DeviceSpec(manufacturer=VANKYO, code=MatrixPad-X36, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=MatrixPad-X36,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MATRIXPAD_X36 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VANKYO, code=P10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=P10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VANKYO, code=P31, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=P31, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P31 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VANKYO, code=P31-E_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=P31-E_EEA, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P31_E_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VANKYO, code=S10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VANKYO, code=S10_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S10_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val S10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VANKYO, code=S10_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S10_ROW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val S10_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VANKYO, code=S20, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S20, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val S20 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=VANKYO, code=S20_2020, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S20_2020, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val S20_2020 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=VANKYO, code=S20_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S20_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val S20_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=VANKYO, code=S20_EEA_2020, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S20_EEA_2020,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val S20_EEA_2020 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=VANKYO, code=S21, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S21, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S21 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VANKYO, code=S30, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S30, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val S30 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VANKYO, code=S30_2020, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S30_2020, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val S30_2020 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VANKYO, code=S30_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S30_EEA, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val S30_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VANKYO, code=S30_EEA_2020, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S30_EEA_2020,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val S30_EEA_2020 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VANKYO, code=S7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val S7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VANKYO, code=S7_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S7_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val S7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VANKYO, code=S8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val S8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VANKYO, code=S8_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=S8_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val S8_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VANKYO, code=Vankyo_S10, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=Vankyo_S10, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val VANKYO_S10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=VANKYO, code=Vankyo_S10_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=Vankyo_S10_EEA,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val VANKYO_S10_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=VANKYO, code=VANKYO_S7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=VANKYO_S7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VANKYO_S7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VANKYO, code=VANKYO_S7_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=VANKYO_S7_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val VANKYO_S7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VANKYO, code=VANKYO_S8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=VANKYO_S8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VANKYO_S8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VANKYO, code=VANKYO_S8_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=VANKYO_S8_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VANKYO_S8_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VANKYO, code=Z1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=Z1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Z1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VANKYO, code=Z1_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=Z1_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Z1_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VANKYO, code=Z4, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=Z4, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z4 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VANKYO, code=Z4_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VANKYO, code=Z4_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z4_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
