package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fplus device specifications for Android Compose previews.
 *
 * This extension provides Fplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fplus: Any
  get() = object {
      /** DeviceSpec(manufacturer=Fplus, code=H166, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fplus, code=H166, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val H166 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Fplus, code=lifetabplus, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fplus, code=lifetabplus,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val LIFETABPLUS = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Fplus, code=P670, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fplus, code=P670, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P670 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Fplus, code=SA70, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fplus, code=SA70, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val SA70 = "spec:width=480,height=960,unit=px,dpi=200"

  }
