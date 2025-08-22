package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Benten device specifications for Android Compose previews.
 *
 * This extension provides Benten device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Benten.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Benten: Any
  get() = object {
      /** DeviceSpec(manufacturer=Benten, code=Benten_T10, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Benten, code=Benten_T10, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val BENTEN_T10 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Benten, code=Benten_T20, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Benten, code=Benten_T20, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BENTEN_T20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Benten, code=Benten_T30, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Benten, code=Benten_T30, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val BENTEN_T30 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Benten, code=T8, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Benten, code=T8, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val T8 = "spec:width=800,height=1280,unit=px,dpi=320"

  }
