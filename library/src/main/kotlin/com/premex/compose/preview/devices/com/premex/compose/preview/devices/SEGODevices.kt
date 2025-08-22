package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SEGO device specifications for Android Compose previews.
 *
 * This extension provides SEGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SEGO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SEGO: Any
  get() = object {
      /** DeviceSpec(manufacturer=SEGO, code=S24, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEGO, code=S24, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S24 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SEGO, code=S25_Neo, width=720, height=1600, dpi=272,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEGO, code=S25_Neo, width=720,
      height=1600, dpi=272, isGoogleDevice=false).code */
      val S25_NEO = "spec:width=720,height=1600,unit=px,dpi=272"

      /** DeviceSpec(manufacturer=SEGO, code=S_PAD, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEGO, code=S_PAD, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val S_PAD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SEGO, code=ZERO_50, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEGO, code=ZERO_50, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ZERO_50 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
