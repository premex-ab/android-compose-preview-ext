package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZIOVO device specifications for Android Compose previews.
 *
 * This extension provides ZIOVO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZIOVO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZIOVO: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZIOVO, code=Z118-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z118-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z118_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z118-US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z118-US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z118_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z118-U-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z118-U-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z118_U_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z118-U-US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z118-U-US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z118_U_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z128_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z128_EEA, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val Z128_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z128_T_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z128_T_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z128_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z128_T_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z128_T_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z128_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z128_US, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z128_US, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val Z128_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z138_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z138_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z138_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z138_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z138_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z138_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z168_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z168_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Z168_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z168_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z168_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Z168_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z168_U_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z168_U_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z168_U_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZIOVO, code=Z168_U_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZIOVO, code=Z168_U_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z168_U_US = "spec:width=800,height=1280,unit=px,dpi=160"

  }
