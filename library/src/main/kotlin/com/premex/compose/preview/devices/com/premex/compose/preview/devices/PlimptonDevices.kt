package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Plimpton device specifications for Android Compose previews.
 *
 * This extension provides Plimpton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Plimpton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Plimpton: Any
  get() = object {
      /** DeviceSpec(manufacturer=Plimpton, code=Kids20, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=Kids20, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KIDS20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=Kids20A14, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=Kids20A14,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KIDS20A14 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=Kids20A14_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=Kids20A14_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KIDS20A14_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=Kids20A15, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=Kids20A15,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val KIDS20A15 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Plimpton, code=Kids_10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=Kids_10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KIDS_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Plimpton, code=Kids_10_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=Kids_10_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KIDS_10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=Kids_10_ver13, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=Kids_10_ver13,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KIDS_10_VER13 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=Kids_10_ver14, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=Kids_10_ver14,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KIDS_10_VER14 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=Kids_10_ver14_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=Kids_10_ver14_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KIDS_10_VER14_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=Kids_8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=Kids_8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KIDS_8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=P2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=P2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Plimpton, code=P60Plus, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=P60Plus, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P60PLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Plimpton, code=P60Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=P60Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P60PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=P70_14, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=P70_14, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P70_14 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=P8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=P8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=P8Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=P8Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P8PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=P8ProA14, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=P8ProA14, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P8PROA14 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=P8ProA14_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=P8ProA14_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val P8PROA14_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Plimpton, code=PlimPad_P3, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=PlimPad_P3,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PLIMPAD_P3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Plimpton, code=PlimPad_P3_Pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=PlimPad_P3_Pro,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PLIMPAD_P3_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Plimpton, code=PlimPad_P60, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=PlimPad_P60,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val PLIMPAD_P60 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Plimpton, code=X100, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Plimpton, code=X100, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val X100 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
