package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BeLeno device specifications for Android Compose previews.
 *
 * This extension provides BeLeno device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BeLeno.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BeLeno: Any
  get() = object {
      /** DeviceSpec(manufacturer=BeLeno, code=BeLeno_Neod_8, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BeLeno, code=BeLeno_Neod_8,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val BELENO_NEOD_8 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BeLeno, code=BeLeno_Turbo_101, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BeLeno, code=BeLeno_Turbo_101,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val BELENO_TURBO_101 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
