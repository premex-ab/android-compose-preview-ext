package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * THOMSON device specifications for Android Compose previews.
 *
 * This extension provides THOMSON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.THOMSON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.THOMSON: Any
  get() = object {
      /** DeviceSpec(manufacturer=THOMSON, code=Delight_TH201, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=Delight_TH201,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val DELIGHT_TH201 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=THOMSON, code=Friendly_TH101, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=Friendly_TH101,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val FRIENDLY_TH101 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=THOMSON, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=ikebukuro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=THOMSON, code=L35_A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=L35_A, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L35_A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=THOMSON, code=R1, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=R1, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=THOMSON, code=R2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=R2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=THOMSON, code=R3, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=R3, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=THOMSON, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=THOMSON, code=redwood, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=redwood, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=THOMSON, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=samseong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=THOMSON, code=SNA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=SNA, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SNA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=THOMSON, code=TEO10, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=TEO10, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TEO10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=THOMSON, code=TEO104G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=TEO104G, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val TEO104G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=THOMSON, code=TEO10A2BK32P_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=TEO10A2BK32P_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TEO10A2BK32P_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=THOMSON, code=TEO10A4BK64P_EEA, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=TEO10A4BK64P_EEA,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val TEO10A4BK64P_EEA = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=THOMSON, code=TEO10S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=TEO10S, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TEO10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=THOMSON, code=TEO10-KID2BL32, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=TEO10-KID2BL32,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TEO10_KID2BL32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=THOMSON, code=TEO13P, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=TEO13P, width=1080,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val TEO13P = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=THOMSON, code=TEO84G332, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=TEO84G332, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val TEO84G332 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=THOMSON, code=TEO8M2BK32LTE, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=TEO8M2BK32LTE,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val TEO8M2BK32LTE = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=THOMSON, code=TEOX10-MT8SL128LTE, width=1200, height=1920,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON,
      code=TEOX10-MT8SL128LTE, width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TEOX10_MT8SL128LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=THOMSON, code=YXQ, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=YXQ, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YXQ = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=THOMSON, code=YZF, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THOMSON, code=YZF, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YZF = "spec:width=720,height=1280,unit=px,dpi=320"

  }
