package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TELEFUNKEN device specifications for Android Compose previews.
 *
 * This extension provides TELEFUNKEN device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TELEFUNKEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TELEFUNKEN: Any
  get() = object {
      /** DeviceSpec(manufacturer=TELEFUNKEN, code=SW4H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELEFUNKEN, code=SW4H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TELEFUNKEN, code=TEL-1013GIQA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELEFUNKEN, code=TEL-1013GIQA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TEL_1013GIQA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TELEFUNKEN, code=TEL-1014GIQ, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELEFUNKEN, code=TEL-1014GIQ,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TEL_1014GIQ = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TELEFUNKEN, code=TEL-1014GIQA, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELEFUNKEN, code=TEL-1014GIQA,
      width=800, height=1280, dpi=220, isGoogleDevice=false).code */
      val TEL_1014GIQA = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=TELEFUNKEN, code=TEL-73GIQA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELEFUNKEN, code=TEL-73GIQA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TEL_73GIQA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TELEFUNKEN, code=TEL-73GIQA11, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELEFUNKEN, code=TEL-73GIQA11,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TEL_73GIQA11 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TELEFUNKEN, code=TEL-74GIQA, width=600, height=1024, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELEFUNKEN, code=TEL-74GIQA,
      width=600, height=1024, dpi=180, isGoogleDevice=false).code */
      val TEL_74GIQA = "spec:width=600,height=1024,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=TELEFUNKEN, code=TF501_EC, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELEFUNKEN, code=TF501_EC,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TF501_EC = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TELEFUNKEN, code=TF600, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELEFUNKEN, code=TF600, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TF600 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
