package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Essentielb device specifications for Android Compose previews.
 *
 * This extension provides Essentielb device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Essentielb.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Essentielb: Any
  get() = object {
      /** DeviceSpec(manufacturer=Essentielb, code=M16Q1A, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Essentielb, code=M16Q1A,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val M16Q1A = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Essentielb, code=M16Q1C, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Essentielb, code=M16Q1C, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M16Q1C = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Essentielb, code=SmartTAB1007, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Essentielb, code=SmartTAB1007,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SMARTTAB1007 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Essentielb, code=SmartTAB1008, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Essentielb, code=SmartTAB1008,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val SMARTTAB1008 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Essentielb, code=SmartTab_1004_XS, width=1200, height=1920,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Essentielb,
      code=SmartTab_1004_XS, width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val SMARTTAB_1004_XS = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Essentielb, code=Wooze_L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Essentielb, code=Wooze_L,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val WOOZE_L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Essentielb, code=Wooze_XL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Essentielb, code=Wooze_XL,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val WOOZE_XL = "spec:width=720,height=1280,unit=px,dpi=320"

  }
