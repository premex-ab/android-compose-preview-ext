package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FOLG device specifications for Android Compose previews.
 *
 * This extension provides FOLG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FOLG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FOLG: Any
  get() = object {
      /** DeviceSpec(manufacturer=FOLG, code=FOLG_GT_10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOLG, code=FOLG_GT_10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val FOLG_GT_10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FOLG, code=FOLG_TAB_10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOLG, code=FOLG_TAB_10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val FOLG_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FOLG, code=FOLG_Tab_10s, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOLG, code=FOLG_Tab_10s, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val FOLG_TAB_10S = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=FOLG, code=FT01, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOLG, code=FT01, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val FT01 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FOLG, code=FT02, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOLG, code=FT02, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val FT02 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FOLG, code=KS20, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOLG, code=KS20, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KS20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FOLG, code=S18, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOLG, code=S18, width=1200,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val S18 = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=FOLG, code=S19, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOLG, code=S19, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val S19 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=FOLG, code=S30, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOLG, code=S30, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val S30 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
