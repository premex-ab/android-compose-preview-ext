package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EXCEED device specifications for Android Compose previews.
 *
 * This extension provides EXCEED device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EXCEED.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EXCEED: Any
  get() = object {
      /** DeviceSpec(manufacturer=EXCEED, code=E10G22, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXCEED, code=E10G22, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val E10G22 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EXCEED, code=E10W10, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXCEED, code=E10W10, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val E10W10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=EXCEED, code=EX10S10, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXCEED, code=EX10S10, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val EX10S10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EXCEED, code=EX10S4, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXCEED, code=EX10S4, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EX10S4 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EXCEED, code=EX7S4, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXCEED, code=EX7S4, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val EX7S4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EXCEED, code=EX7SL4, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXCEED, code=EX7SL4, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val EX7SL4 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EXCEED, code=EX7W1S, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXCEED, code=EX7W1S, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val EX7W1S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EXCEED, code=EX7W4, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXCEED, code=EX7W4, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val EX7W4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EXCEED, code=EX7X4, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXCEED, code=EX7X4, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val EX7X4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EXCEED, code=EX8S1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EXCEED, code=EX8S1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EX8S1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
