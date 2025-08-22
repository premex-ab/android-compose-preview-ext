package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Yestel device specifications for Android Compose previews.
 *
 * This extension provides Yestel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yestel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yestel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Yestel, code=T13_T_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yestel, code=T13_T_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T13_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Yestel, code=T5_0, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yestel, code=T5_0, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T5_0 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Yestel, code=T5_EEA_0, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yestel, code=T5_EEA_0, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T5_EEA_0 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Yestel, code=X2_T_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yestel, code=X2_T_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val X2_T_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Yestel, code=X2_T_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yestel, code=X2_T_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val X2_T_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Yestel, code=X7_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yestel, code=X7_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val X7_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
