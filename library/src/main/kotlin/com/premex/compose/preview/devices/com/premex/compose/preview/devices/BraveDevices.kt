package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Brave device specifications for Android Compose previews.
 *
 * This extension provides Brave device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brave.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brave: Any
  get() = object {
      /** DeviceSpec(manufacturer=Brave, code=T2lite, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brave, code=T2lite, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T2LITE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Brave, code=T2Max, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brave, code=T2Max, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val T2MAX = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Brave, code=T2Pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brave, code=T2Pro, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T2PRO = "spec:width=800,height=1280,unit=px,dpi=160"

  }
