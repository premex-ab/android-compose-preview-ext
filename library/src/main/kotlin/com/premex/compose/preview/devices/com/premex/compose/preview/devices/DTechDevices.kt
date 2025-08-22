package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * D-Tech device specifications for Android Compose previews.
 *
 * This extension provides D-Tech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DTech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DTech: Any
  get() = object {
      /** DeviceSpec(manufacturer=D-Tech, code=D5L, width=720, height=1440, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=D-Tech, code=D5L, width=720,
      height=1440, dpi=300, isGoogleDevice=false).code */
      val D5L = "spec:width=720,height=1440,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=D-Tech, code=D5S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=D-Tech, code=D5S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val D5S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=D-Tech, code=LM_01, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=D-Tech, code=LM_01, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val LM_01 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
