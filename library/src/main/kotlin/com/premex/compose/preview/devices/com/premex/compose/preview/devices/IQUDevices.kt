package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IQU device specifications for Android Compose previews.
 *
 * This extension provides IQU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IQU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IQU: Any
  get() = object {
      /** DeviceSpec(manufacturer=IQU, code=IQUSMARTEASYT10W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IQU, code=IQUSMARTEASYT10W,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val IQUSMARTEASYT10W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IQU, code=IQUSMARTEASYT8W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IQU, code=IQUSMARTEASYT8W,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val IQUSMARTEASYT8W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IQU, code=SMARTEasy_Q50, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IQU, code=SMARTEasy_Q50, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SMARTEASY_Q50 = "spec:width=480,height=960,unit=px,dpi=240"

  }
