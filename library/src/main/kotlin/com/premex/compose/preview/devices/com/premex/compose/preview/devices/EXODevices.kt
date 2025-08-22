package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EXO device specifications for Android Compose previews.
 *
 * This extension provides EXO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EXO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EXO: Any
  get() = object {
      /** DeviceSpec(manufacturer=EXO, code=EXO_Wave_i716, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXO, code=EXO_Wave_i716, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val EXO_WAVE_I716 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EXO, code=EXO_Wave_i726, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXO, code=EXO_Wave_i726, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val EXO_WAVE_I726 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EXO, code=Wave_i007Kids, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXO, code=Wave_i007Kids, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val WAVE_I007KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EXO, code=Wave_i007T, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXO, code=Wave_i007T, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val WAVE_I007T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EXO, code=Wave_i101G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXO, code=Wave_i101G, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val WAVE_I101G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EXO, code=Wave_i101MC, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXO, code=Wave_i101MC, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val WAVE_I101MC = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=EXO, code=Wave_i101T4, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXO, code=Wave_i101T4, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val WAVE_I101T4 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EXO, code=Wave_i101u, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXO, code=Wave_i101u, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val WAVE_I101U = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
