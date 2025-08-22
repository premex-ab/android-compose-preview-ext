package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fivahiva device specifications for Android Compose previews.
 *
 * This extension provides Fivahiva device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fivahiva.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fivahiva: Any
  get() = object {
      /** DeviceSpec(manufacturer=Fivahiva, code=F10A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fivahiva, code=F10A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F10A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Fivahiva, code=FF10A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fivahiva, code=FF10A, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val FF10A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Fivahiva, code=FF-35, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fivahiva, code=FF-35, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val FF_35 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Fivahiva, code=F-764, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fivahiva, code=F-764, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val F_764 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Fivahiva, code=MM-P30, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fivahiva, code=MM-P30, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MM_P30 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
