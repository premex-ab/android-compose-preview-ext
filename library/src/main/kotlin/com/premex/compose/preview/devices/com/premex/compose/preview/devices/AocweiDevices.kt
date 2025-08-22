package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Aocwei device specifications for Android Compose previews.
 *
 * This extension provides Aocwei device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aocwei.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aocwei: Any
  get() = object {
      /** DeviceSpec(manufacturer=Aocwei, code=X300, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aocwei, code=X300, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val X300 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Aocwei, code=X300_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aocwei, code=X300_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val X300_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Aocwei, code=X300_EEA_T, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aocwei, code=X300_EEA_T, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val X300_EEA_T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Aocwei, code=X500_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aocwei, code=X500_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X500_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Aocwei, code=X500_T_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aocwei, code=X500_T_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X500_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Aocwei, code=X500_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aocwei, code=X500_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X500_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Aocwei, code=X700_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aocwei, code=X700_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val X700_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Aocwei, code=X900_EEA, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aocwei, code=X900_EEA, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val X900_EEA = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=Aocwei, code=X900-US, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aocwei, code=X900-US, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val X900_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Aocwei, code=X900_US, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aocwei, code=X900_US, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val X900_US = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
