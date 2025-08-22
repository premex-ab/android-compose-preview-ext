package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DMOAO device specifications for Android Compose previews.
 *
 * This extension provides DMOAO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DMOAO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DMOAO: Any
  get() = object {
      /** DeviceSpec(manufacturer=DMOAO, code=D11_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DMOAO, code=D11_EEA, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val D11_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DMOAO, code=D3_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DMOAO, code=D3_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val D3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DMOAO, code=D3_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DMOAO, code=D3_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val D3_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DMOAO, code=D5_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DMOAO, code=D5_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val D5_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DMOAO, code=D5-T-EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DMOAO, code=D5-T-EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val D5_T_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=DMOAO, code=D5-T-US, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DMOAO, code=D5-T-US, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val D5_T_US = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=DMOAO, code=D5_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DMOAO, code=D5_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val D5_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DMOAO, code=D6_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DMOAO, code=D6_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val D6_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DMOAO, code=D6_US, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DMOAO, code=D6_US, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val D6_US = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DMOAO, code=DMOAO_D2_EEA, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DMOAO, code=DMOAO_D2_EEA,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val DMOAO_D2_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=DMOAO, code=DMOAO_D2_US, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DMOAO, code=DMOAO_D2_US, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val DMOAO_D2_US = "spec:width=800,height=1280,unit=px,dpi=200"

  }
