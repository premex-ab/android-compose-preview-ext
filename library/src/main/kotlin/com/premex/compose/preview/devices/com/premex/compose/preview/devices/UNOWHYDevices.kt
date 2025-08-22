package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNOWHY device specifications for Android Compose previews.
 *
 * This extension provides UNOWHY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UNOWHY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UNOWHY: Any
  get() = object {
      /** DeviceSpec(manufacturer=UNOWHY, code=S10G001S4M_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNOWHY, code=S10G001S4M_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val S10G001S4M_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UNOWHY, code=Y10G001S4M, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNOWHY, code=Y10G001S4M, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Y10G001S4M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UNOWHY, code=Y10G007S4MI_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNOWHY, code=Y10G007S4MI_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val Y10G007S4MI_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UNOWHY, code=Y10G007S4M_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNOWHY, code=Y10G007S4M_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val Y10G007S4M_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UNOWHY, code=Y10_Premium, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNOWHY, code=Y10_Premium,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val Y10_PREMIUM = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
