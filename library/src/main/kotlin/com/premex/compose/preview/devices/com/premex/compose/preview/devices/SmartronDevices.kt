package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Smartron device specifications for Android Compose previews.
 *
 * This extension provides Smartron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smartron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smartron: Any
  get() = object {
      /** DeviceSpec(manufacturer=Smartron, code=P840F12, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartron, code=P840F12, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P840F12 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Smartron, code=rimo01a, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartron, code=rimo01a, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val RIMO01A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Smartron, code=rimo02a, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartron, code=rimo02a, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val RIMO02A = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
