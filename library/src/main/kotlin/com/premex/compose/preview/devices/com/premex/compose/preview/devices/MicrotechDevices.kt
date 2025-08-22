package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Microtech device specifications for Android Compose previews.
 *
 * This extension provides Microtech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Microtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Microtech: Any
  get() = object {
      /** DeviceSpec(manufacturer=Microtech, code=etab_LTE, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Microtech, code=etab_LTE,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val ETAB_LTE = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Microtech, code=ETL101A_EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Microtech, code=ETL101A_EEA,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val ETL101A_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Microtech, code=ETW101GT_C_EEA, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Microtech, code=ETW101GT_C_EEA,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val ETW101GT_C_EEA = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Microtech, code=ETW101GT_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Microtech, code=ETW101GT_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ETW101GT_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
