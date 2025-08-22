package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KENBO device specifications for Android Compose previews.
 *
 * This extension provides KENBO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KENBO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KENBO: Any
  get() = object {
      /** DeviceSpec(manufacturer=KENBO, code=B19, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENBO, code=B19, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val B19 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENBO, code=K6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENBO, code=K6, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val K6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KENBO, code=K7, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENBO, code=K7, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val K7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KENBO, code=O51, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENBO, code=O51, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val O51 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENBO, code=O61, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENBO, code=O61, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val O61 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENBO, code=O71, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENBO, code=O71, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val O71 = "spec:width=600,height=1280,unit=px,dpi=240"

  }
