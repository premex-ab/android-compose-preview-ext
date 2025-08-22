package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUAAT device specifications for Android Compose previews.
 *
 * This extension provides SUAAT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUAAT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUAAT: Any
  get() = object {
      /** DeviceSpec(manufacturer=SUAAT, code=S10_U_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUAAT, code=S10_U_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S10_U_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SUAAT, code=S10_U_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUAAT, code=S10_U_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S10_U_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SUAAT, code=S3_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUAAT, code=S3_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SUAAT, code=S3_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUAAT, code=S3_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S3_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SUAAT, code=S6_EEA, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUAAT, code=S6_EEA, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val S6_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SUAAT, code=S6_US, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUAAT, code=S6_US, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val S6_US = "spec:width=800,height=1280,unit=px,dpi=200"

  }
