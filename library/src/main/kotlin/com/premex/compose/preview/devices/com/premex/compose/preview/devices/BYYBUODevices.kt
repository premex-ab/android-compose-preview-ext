package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BYYBUO device specifications for Android Compose previews.
 *
 * This extension provides BYYBUO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BYYBUO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BYYBUO: Any
  get() = object {
      /** DeviceSpec(manufacturer=BYYBUO, code=BYYBUO_SmartPad_A10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BYYBUO, code=BYYBUO_SmartPad_A10,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BYYBUO_SMARTPAD_A10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BYYBUO, code=BYYBUO_SmartPad_T10, width=1200, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BYYBUO,
      code=BYYBUO_SmartPad_T10, width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val BYYBUO_SMARTPAD_T10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BYYBUO, code=SmartPad_T10_EU, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BYYBUO, code=SmartPad_T10_EU,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val SMARTPAD_T10_EU = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
