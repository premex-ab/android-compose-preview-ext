package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VESTEL device specifications for Android Compose previews.
 *
 * This extension provides VESTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VESTEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VESTEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=VESTEL, code=VTABZ1A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VESTEL, code=VTABZ1A, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VTABZ1A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VESTEL, code=V_TAB_1050, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VESTEL, code=V_TAB_1050, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val V_TAB_1050 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VESTEL, code=V_TAB_7020A, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VESTEL, code=V_TAB_7020A,
      width=720, height=1280, dpi=240, isGoogleDevice=false).code */
      val V_TAB_7020A = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VESTEL, code=V_TAB_7810, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VESTEL, code=V_TAB_7810, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val V_TAB_7810 = "spec:width=768,height=1024,unit=px,dpi=160"

  }
