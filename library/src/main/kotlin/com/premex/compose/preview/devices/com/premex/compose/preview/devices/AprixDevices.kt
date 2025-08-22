package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Aprix device specifications for Android Compose previews.
 *
 * This extension provides Aprix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aprix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aprix: Any
  get() = object {
      /** DeviceSpec(manufacturer=Aprix, code=Tab1066, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aprix, code=Tab1066, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB1066 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Aprix, code=TabX4, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aprix, code=TabX4, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TABX4 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Aprix, code=Tab_X2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aprix, code=Tab_X2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_X2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
