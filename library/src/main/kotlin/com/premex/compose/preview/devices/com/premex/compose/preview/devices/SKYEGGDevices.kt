package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKYEGG device specifications for Android Compose previews.
 *
 * This extension provides SKYEGG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SKYEGG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SKYEGG: Any
  get() = object {
      /** DeviceSpec(manufacturer=SKYEGG, code=K11_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKYEGG, code=K11_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K11_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SKYEGG, code=K11_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKYEGG, code=K11_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K11_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SKYEGG, code=K13_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKYEGG, code=K13_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K13_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SKYEGG, code=K13_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKYEGG, code=K13_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K13_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SKYEGG, code=K15_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKYEGG, code=K15_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K15_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SKYEGG, code=K15_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKYEGG, code=K15_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K15_US = "spec:width=800,height=1280,unit=px,dpi=160"

  }
