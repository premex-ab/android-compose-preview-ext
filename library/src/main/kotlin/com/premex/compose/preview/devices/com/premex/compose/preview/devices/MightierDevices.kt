package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mightier device specifications for Android Compose previews.
 *
 * This extension provides Mightier device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mightier.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mightier: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mightier, code=MT003-19, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mightier, code=MT003-19, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MT003_19 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mightier, code=MT003-20, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mightier, code=MT003-20, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MT003_20 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mightier, code=MT003-21, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mightier, code=MT003-21, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MT003_21 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mightier, code=MT004_20, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mightier, code=MT004_20, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MT004_20 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
