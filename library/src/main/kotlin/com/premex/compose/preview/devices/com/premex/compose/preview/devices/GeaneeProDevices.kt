package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * geaneePro device specifications for Android Compose previews.
 *
 * This extension provides geaneePro device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GeaneePro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GeaneePro: Any
  get() = object {
      /** DeviceSpec(manufacturer=geaneePro, code=JT07-X, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=geaneePro, code=JT07-X, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val JT07_X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=geaneePro, code=JT08-X1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=geaneePro, code=JT08-X1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val JT08_X1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=geaneePro, code=JT10LTE-X1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=geaneePro, code=JT10LTE-X1,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val JT10LTE_X1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=geaneePro, code=JT10LTE-X1S, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=geaneePro, code=JT10LTE-X1S,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val JT10LTE_X1S = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=geaneePro, code=JT10-X, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=geaneePro, code=JT10-X, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val JT10_X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=geaneePro, code=JT10-X1, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=geaneePro, code=JT10-X1,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val JT10_X1 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
