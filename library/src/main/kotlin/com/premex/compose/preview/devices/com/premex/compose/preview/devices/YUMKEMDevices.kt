package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YUMKEM device specifications for Android Compose previews.
 *
 * This extension provides YUMKEM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YUMKEM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YUMKEM: Any
  get() = object {
      /** DeviceSpec(manufacturer=YUMKEM, code=N10-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YUMKEM, code=N10-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val N10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YUMKEM, code=U221, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YUMKEM, code=U221, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val U221 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=YUMKEM, code=U221-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YUMKEM, code=U221-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val U221_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=YUMKEM, code=U320, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YUMKEM, code=U320, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val U320 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=YUMKEM, code=U320-EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YUMKEM, code=U320-EEA, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val U320_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
