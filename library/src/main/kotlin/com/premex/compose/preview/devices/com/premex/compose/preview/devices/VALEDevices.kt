package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VALE device specifications for Android Compose previews.
 *
 * This extension provides VALE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VALE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VALE: Any
  get() = object {
      /** DeviceSpec(manufacturer=VALE, code=V10A-4128, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VALE, code=V10A-4128, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val V10A_4128 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VALE, code=V10E-LTE, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VALE, code=V10E-LTE, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val V10E_LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VALE, code=V11E_LTE_4128, width=1200, height=1920, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VALE, code=V11E_LTE_4128,
      width=1200, height=1920, dpi=200, isGoogleDevice=false).code */
      val V11E_LTE_4128 = "spec:width=1200,height=1920,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=VALE, code=V12E-LTE, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VALE, code=V12E-LTE, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val V12E_LTE = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VALE, code=V12E_LTE_8128, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VALE, code=V12E_LTE_8128,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val V12E_LTE_8128 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
