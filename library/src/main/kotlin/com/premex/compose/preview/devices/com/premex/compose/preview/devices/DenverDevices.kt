package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * denver device specifications for Android Compose previews.
 *
 * This extension provides denver device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Denver.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Denver: Any
  get() = object {
      /** DeviceSpec(manufacturer=denver, code=TIO_80, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=denver, code=TIO_80, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TIO_80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=denver, code=TIQ-1044, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=denver, code=TIQ-1044, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TIQ_1044 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=denver, code=TIQ-1049, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=denver, code=TIQ-1049, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TIQ_1049 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=denver, code=TIQ-70, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=denver, code=TIQ-70, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TIQ_70 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
