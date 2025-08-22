package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mode1 device specifications for Android Compose previews.
 *
 * This extension provides Mode1 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mode1.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mode1: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mode1, code=MD06P, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mode1, code=MD06P, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MD06P = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mode1, code=MD-03P, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mode1, code=MD-03P, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MD_03P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mode1, code=MD-04P, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mode1, code=MD-04P, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val MD_04P = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
