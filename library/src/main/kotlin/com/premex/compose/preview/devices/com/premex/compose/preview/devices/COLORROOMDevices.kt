package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COLORROOM device specifications for Android Compose previews.
 *
 * This extension provides COLORROOM device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COLORROOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COLORROOM: Any
  get() = object {
      /** DeviceSpec(manufacturer=COLORROOM, code=A30_Plus, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=A30_Plus,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val A30_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=A5, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=A5, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A5 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=C1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=C1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=C10_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=C10_ROW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C10_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=C2, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=C2, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val C2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=COLORROOM, code=C20, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=C20, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val C20 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=COLORROOM, code=C30_Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=C30_Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C30_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=C3_Pro_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=C3_Pro_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val C3_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=C3_Pro_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=C3_Pro_ROW,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val C3_PRO_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=C3_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=C3_ROW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C3_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=C5, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=C5, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C5 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=C5_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=C5_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C5_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=C5_Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=C5_Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C5_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=E07, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=E07, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val E07 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=COLORROOM, code=E20, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=E20, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val E20 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=COLORROOM, code=E20_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=E20_ROW,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val E20_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=COLORROOM, code=E30_Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=E30_Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val E30_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=E5, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=E5, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val E5 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=K07-pro_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=K07-pro_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val K07_PRO_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=COLORROOM, code=K10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=K10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=K10C, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=K10C, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K10C = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=K12, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=K12, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val K12 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=COLORROOM, code=K12E, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=K12E, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K12E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=COLORROOM, code=K12E_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=K12E_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val K12E_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=COLORROOM, code=K12E_ROW, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=K12E_ROW,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val K12E_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=COLORROOM, code=K12-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=K12-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K12_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COLORROOM, code=T30E, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COLORROOM, code=T30E, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T30E = "spec:width=800,height=1280,unit=px,dpi=213"

  }
