package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ceibal device specifications for Android Compose previews.
 *
 * This extension provides Ceibal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ceibal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ceibal: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ceibal, code=A102, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ceibal, code=A102, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A102 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Ceibal, code=ACRUX, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ceibal, code=ACRUX, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ACRUX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Ceibal, code=Alfard, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ceibal, code=Alfard, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ALFARD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Ceibal, code=CEIBAL_HFP_LT, width=2160, height=3840, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ceibal, code=CEIBAL_HFP_LT,
      width=2160, height=3840, dpi=420, isGoogleDevice=false).code */
      val CEIBAL_HFP_LT = "spec:width=2160,height=3840,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Ceibal, code=TC80RA1_3, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ceibal, code=TC80RA1_3, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TC80RA1_3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Ceibal, code=TC80RA6_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ceibal, code=TC80RA6_1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TC80RA6_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Ceibal, code=U800B, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ceibal, code=U800B, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val U800B = "spec:width=800,height=1280,unit=px,dpi=213"

  }
