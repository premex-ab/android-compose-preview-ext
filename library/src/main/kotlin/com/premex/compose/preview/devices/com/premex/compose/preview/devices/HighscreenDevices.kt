package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Highscreen device specifications for Android Compose previews.
 *
 * This extension provides Highscreen device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Highscreen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Highscreen: Any
  get() = object {
      /** DeviceSpec(manufacturer=Highscreen, code=Max3, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Highscreen, code=Max3, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val MAX3 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Highscreen, code=PowerFiveMax2, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Highscreen, code=PowerFiveMax2,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val POWERFIVEMAX2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Highscreen, code=PowerIceEvo, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Highscreen, code=PowerIceEvo,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val POWERICEEVO = "spec:width=720,height=1280,unit=px,dpi=320"

  }
