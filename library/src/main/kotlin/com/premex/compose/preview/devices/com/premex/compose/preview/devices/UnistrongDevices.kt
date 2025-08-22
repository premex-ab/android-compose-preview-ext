package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Unistrong device specifications for Android Compose previews.
 *
 * This extension provides Unistrong device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unistrong.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unistrong: Any
  get() = object {
      /** DeviceSpec(manufacturer=Unistrong, code=UT12P, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unistrong, code=UT12P, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val UT12P = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Unistrong, code=UT32, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unistrong, code=UT32, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val UT32 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Unistrong, code=UT56, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unistrong, code=UT56, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val UT56 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
