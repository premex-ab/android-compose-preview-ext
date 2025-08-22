package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIKUSHA device specifications for Android Compose previews.
 *
 * This extension provides VIKUSHA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VIKUSHA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VIKUSHA: Any
  get() = object {
      /** DeviceSpec(manufacturer=VIKUSHA, code=VZ-1, width=600, height=1024, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIKUSHA, code=VZ-1, width=600,
      height=1024, dpi=200, isGoogleDevice=false).code */
      val VZ_1 = "spec:width=600,height=1024,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=VIKUSHA, code=VZ-30, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIKUSHA, code=VZ-30, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VZ_30 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VIKUSHA, code=VZ-30Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIKUSHA, code=VZ-30Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VZ_30PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VIKUSHA, code=V-E5, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIKUSHA, code=V-E5, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val V_E5 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VIKUSHA, code=V-N5, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIKUSHA, code=V-N5, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val V_N5 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VIKUSHA, code=V-Z40, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIKUSHA, code=V-Z40, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val V_Z40 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VIKUSHA, code=V-Z40Pro, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIKUSHA, code=V-Z40Pro, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val V_Z40PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VIKUSHA, code=V-Z70, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIKUSHA, code=V-Z70, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val V_Z70 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VIKUSHA, code=V-Z80Plus, width=1200, height=2000, dpi=252,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIKUSHA, code=V-Z80Plus,
      width=1200, height=2000, dpi=252, isGoogleDevice=false).code */
      val V_Z80PLUS = "spec:width=1200,height=2000,unit=px,dpi=252"

  }
