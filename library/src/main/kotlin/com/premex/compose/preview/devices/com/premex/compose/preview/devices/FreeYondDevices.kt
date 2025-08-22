package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FreeYond device specifications for Android Compose previews.
 *
 * This extension provides FreeYond device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FreeYond.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FreeYond: Any
  get() = object {
      /** DeviceSpec(manufacturer=FreeYond, code=F9, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FreeYond, code=F9, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val F9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FreeYond, code=F9S, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FreeYond, code=F9S, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val F9S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FreeYond, code=F9S_EEA, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FreeYond, code=F9S_EEA, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val F9S_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FreeYond, code=FreeYondA5, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FreeYond, code=FreeYondA5,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val FREEYONDA5 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=FreeYond, code=FreeYondP6, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FreeYond, code=FreeYondP6,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val FREEYONDP6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FreeYond, code=M5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FreeYond, code=M5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val M5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FreeYond, code=M5A, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FreeYond, code=M5A, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val M5A = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FreeYond, code=M6, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FreeYond, code=M6, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val M6 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
