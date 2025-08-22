package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WOZIFAN device specifications for Android Compose previews.
 *
 * This extension provides WOZIFAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WOZIFAN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WOZIFAN: Any
  get() = object {
      /** DeviceSpec(manufacturer=WOZIFAN, code=W10_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOZIFAN, code=W10_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val W10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WOZIFAN, code=W10_T_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOZIFAN, code=W10_T_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val W10_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WOZIFAN, code=W10_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOZIFAN, code=W10_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val W10_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WOZIFAN, code=W3_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOZIFAN, code=W3_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val W3_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WOZIFAN, code=W3_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOZIFAN, code=W3_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val W3_US = "spec:width=800,height=1280,unit=px,dpi=213"

  }
