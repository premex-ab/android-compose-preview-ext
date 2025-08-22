package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VORCOM device specifications for Android Compose previews.
 *
 * This extension provides VORCOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VORCOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VORCOM: Any
  get() = object {
      /** DeviceSpec(manufacturer=VORCOM, code=AVALON, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORCOM, code=AVALON, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val AVALON = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VORCOM, code=QuartzLITE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORCOM, code=QuartzLITE, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val QUARTZLITE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VORCOM, code=QuartzPRO, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORCOM, code=QuartzPRO, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val QUARTZPRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VORCOM, code=S12_classic, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORCOM, code=S12_classic,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val S12_CLASSIC = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VORCOM, code=S7-classic, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORCOM, code=S7-classic, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val S7_CLASSIC = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VORCOM, code=S7-classic-10, width=600, height=1022, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORCOM, code=S7-classic-10,
      width=600, height=1022, dpi=160, isGoogleDevice=false).code */
      val S7_CLASSIC_10 = "spec:width=600,height=1022,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VORCOM, code=S8Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORCOM, code=S8Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val S8PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VORCOM, code=SXPRO_classic, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORCOM, code=SXPRO_classic,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SXPRO_CLASSIC = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VORCOM, code=ULTRAPAD, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORCOM, code=ULTRAPAD, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val ULTRAPAD = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
