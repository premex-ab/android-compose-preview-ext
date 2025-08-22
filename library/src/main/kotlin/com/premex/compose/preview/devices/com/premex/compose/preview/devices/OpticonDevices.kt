package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Opticon device specifications for Android Compose previews.
 *
 * This extension provides Opticon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Opticon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Opticon: Any
  get() = object {
      /** DeviceSpec(manufacturer=Opticon, code=h31, width=1080, height=1920, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opticon, code=h31, width=1080,
      height=1920, dpi=440, isGoogleDevice=false).code */
      val H31 = "spec:width=1080,height=1920,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Opticon, code=h33, width=1080, height=1920, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opticon, code=h33, width=1080,
      height=1920, dpi=440, isGoogleDevice=false).code */
      val H33 = "spec:width=1080,height=1920,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Opticon, code=H-35, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opticon, code=H-35, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val H_35 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
