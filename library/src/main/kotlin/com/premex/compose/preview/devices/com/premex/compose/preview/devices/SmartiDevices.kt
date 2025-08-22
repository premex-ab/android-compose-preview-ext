package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Smarti device specifications for Android Compose previews.
 *
 * This extension provides Smarti device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smarti.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smarti: Any
  get() = object {
      /** DeviceSpec(manufacturer=Smarti, code=Smarti_Gen_1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smarti, code=Smarti_Gen_1,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SMARTI_GEN_1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Smarti, code=Smarti_Gen_2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smarti, code=Smarti_Gen_2,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val SMARTI_GEN_2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Smarti, code=Smarti_T2_plus, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smarti, code=Smarti_T2_plus,
      width=800, height=1280, dpi=220, isGoogleDevice=false).code */
      val SMARTI_T2_PLUS = "spec:width=800,height=1280,unit=px,dpi=220"

  }
