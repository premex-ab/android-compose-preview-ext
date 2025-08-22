package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Winnovo device specifications for Android Compose previews.
 *
 * This extension provides Winnovo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Winnovo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Winnovo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Winnovo, code=M8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Winnovo, code=M8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Winnovo, code=P20-Tab, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Winnovo, code=P20-Tab, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P20_TAB = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Winnovo, code=T10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Winnovo, code=T10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Winnovo, code=T7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Winnovo, code=T7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Winnovo, code=T8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Winnovo, code=T8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Winnovo, code=WinnovoT5, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Winnovo, code=WinnovoT5,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val WINNOVOT5 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
