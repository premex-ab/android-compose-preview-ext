package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DEERTiME device specifications for Android Compose previews.
 *
 * This extension provides DEERTiME device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DEERTiME.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DEERTiME: Any
  get() = object {
      /** DeviceSpec(manufacturer=DEERTiME, code=E10_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEERTiME, code=E10_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val E10_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEERTiME, code=E15_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEERTiME, code=E15_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E15_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEERTiME, code=E15_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEERTiME, code=E15_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E15_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEERTiME, code=E6_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEERTiME, code=E6_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E6_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEERTiME, code=E6_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEERTiME, code=E6_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E6_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEERTiME, code=E9_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEERTiME, code=E9_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E9_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEERTiME, code=E9_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEERTiME, code=E9_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E9_US = "spec:width=800,height=1280,unit=px,dpi=160"

  }
