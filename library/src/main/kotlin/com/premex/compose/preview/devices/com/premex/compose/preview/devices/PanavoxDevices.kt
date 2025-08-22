package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Panavox device specifications for Android Compose previews.
 *
 * This extension provides Panavox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Panavox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Panavox: Any
  get() = object {
      /** DeviceSpec(manufacturer=Panavox, code=hamamatsucho, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panavox, code=hamamatsucho,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Panavox, code=lushan, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panavox, code=lushan, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val LUSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panavox, code=songshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panavox, code=songshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panavox, code=xiaoyushan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panavox, code=xiaoyushan,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val XIAOYUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
