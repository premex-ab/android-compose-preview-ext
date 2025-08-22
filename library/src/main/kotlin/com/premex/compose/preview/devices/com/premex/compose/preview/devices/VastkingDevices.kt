package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vastking device specifications for Android Compose previews.
 *
 * This extension provides Vastking device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vastking.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vastking: Any
  get() = object {
      /** DeviceSpec(manufacturer=Vastking, code=KindPad_SA8_EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vastking, code=KindPad_SA8_EEA,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val KINDPAD_SA8_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vastking, code=KingPad_K10, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vastking, code=KingPad_K10,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val KINGPAD_K10 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Vastking, code=KingPad_K10Pro, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vastking, code=KingPad_K10Pro,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val KINGPAD_K10PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Vastking, code=KingPad_K10Pro_EEA, width=1200, height=1920,
      dpi=280, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vastking,
      code=KingPad_K10Pro_EEA, width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val KINGPAD_K10PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Vastking, code=KingPad_K10_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vastking, code=KingPad_K10_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val KINGPAD_K10_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Vastking, code=KingPad_M10, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vastking, code=KingPad_M10,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val KINGPAD_M10 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Vastking, code=KingPad_M10_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vastking, code=KingPad_M10_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val KINGPAD_M10_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Vastking, code=KingPad_SA10, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vastking, code=KingPad_SA10,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val KINGPAD_SA10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vastking, code=KingPad_SA10_EEA, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vastking, code=KingPad_SA10_EEA,
      width=720, height=1280, dpi=240, isGoogleDevice=false).code */
      val KINGPAD_SA10_EEA = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vastking, code=KingPad_SA8, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vastking, code=KingPad_SA8,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val KINGPAD_SA8 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vastking, code=KingPad_Z10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vastking, code=KingPad_Z10,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KINGPAD_Z10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vastking, code=KingPad_Z10_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vastking, code=KingPad_Z10_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KINGPAD_Z10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
