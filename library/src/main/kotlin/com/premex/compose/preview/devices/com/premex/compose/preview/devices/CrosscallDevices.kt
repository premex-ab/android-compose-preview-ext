package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Crosscall device specifications for Android Compose previews.
 *
 * This extension provides Crosscall device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Crosscall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Crosscall: Any
  get() = object {
      /** DeviceSpec(manufacturer=Crosscall, code=HS8909QC, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crosscall, code=HS8909QC,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val HS8909QC = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Crosscall, code=HS8916QC, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crosscall, code=HS8916QC,
      width=540, height=960, dpi=240, isGoogleDevice=false).code */
      val HS8916QC = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Crosscall, code=L751, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crosscall, code=L751, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val L751 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Crosscall, code=L751_02, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crosscall, code=L751_02, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val L751_02 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Crosscall, code=L752, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crosscall, code=L752, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val L752 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Crosscall, code=L762, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crosscall, code=L762, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val L762 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Crosscall, code=L768, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crosscall, code=L768, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val L768 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Crosscall, code=L771, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crosscall, code=L771, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val L771 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Crosscall, code=L780, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crosscall, code=L780, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val L780 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Crosscall, code=L790, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crosscall, code=L790, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val L790 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Crosscall, code=L810, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crosscall, code=L810, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L810 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Crosscall, code=L820, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Crosscall, code=L820, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val L820 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
