package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mediacom device specifications for Android Compose previews.
 *
 * This extension provides Mediacom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mediacom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mediacom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mediacom, code=M-PPxS5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mediacom, code=M-PPxS5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M_PPXS5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mediacom, code=M-PPxS7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mediacom, code=M-PPxS7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M_PPXS7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mediacom, code=M-SP10HXxH, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mediacom, code=M-SP10HXxH,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M_SP10HXXH = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mediacom, code=M-SP10MXHL, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mediacom, code=M-SP10MXHL,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M_SP10MXHL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mediacom, code=M-SP1AGO3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mediacom, code=M-SP1AGO3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M_SP1AGO3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mediacom, code=M-SP7HXAH, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mediacom, code=M-SP7HXAH,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M_SP7HXAH = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mediacom, code=M-SP7xGO3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mediacom, code=M-SP7xGO3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val M_SP7XGO3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mediacom, code=SmartPad, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mediacom, code=SmartPad, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SMARTPAD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mediacom, code=10edge, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mediacom, code=10edge, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val _10EDGE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mediacom, code=1EY4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mediacom, code=1EY4G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _1EY4G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
