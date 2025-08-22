package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JUEDUR device specifications for Android Compose previews.
 *
 * This extension provides JUEDUR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JUEDUR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JUEDUR: Any
  get() = object {
      /** DeviceSpec(manufacturer=JUEDUR, code=R500_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUEDUR, code=R500_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val R500_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUEDUR, code=R500_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUEDUR, code=R500_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val R500_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUEDUR, code=R700_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUEDUR, code=R700_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val R700_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUEDUR, code=R700_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUEDUR, code=R700_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val R700_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUEDUR, code=R800_U_EEA, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUEDUR, code=R800_U_EEA, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val R800_U_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=JUEDUR, code=R900_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUEDUR, code=R900_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R900_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JUEDUR, code=R900_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUEDUR, code=R900_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R900_US = "spec:width=800,height=1280,unit=px,dpi=213"

  }
