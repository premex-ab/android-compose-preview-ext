package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TECHcomputer device specifications for Android Compose previews.
 *
 * This extension provides TECHcomputer device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TECHcomputer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TECHcomputer: Any
  get() = object {
      /** DeviceSpec(manufacturer=TECHcomputer, code=F102-T610-EEA, width=1200, height=1920,
      dpi=280, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECHcomputer,
      code=F102-T610-EEA, width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val F102_T610_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=TECHcomputer, code=F102-T610-EEA-GG5, width=1200, height=1920,
      dpi=280, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECHcomputer,
      code=F102-T610-EEA-GG5, width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val F102_T610_EEA_GG5 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=TECHcomputer, code=F102-T618-EEA, width=1200, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECHcomputer,
      code=F102-T618-EEA, width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val F102_T618_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
