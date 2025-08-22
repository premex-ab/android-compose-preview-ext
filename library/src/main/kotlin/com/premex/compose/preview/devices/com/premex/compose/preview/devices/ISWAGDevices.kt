package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ISWAG device specifications for Android Compose previews.
 *
 * This extension provides ISWAG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ISWAG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ISWAG: Any
  get() = object {
      /** DeviceSpec(manufacturer=ISWAG, code=Alpha, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ISWAG, code=Alpha, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ALPHA = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ISWAG, code=ISWAG_KRONOSX, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ISWAG, code=ISWAG_KRONOSX,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ISWAG_KRONOSX = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ISWAG, code=ISWAG_MATRIX, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ISWAG, code=ISWAG_MATRIX,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val ISWAG_MATRIX = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ISWAG, code=ISWAG_NEO, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ISWAG, code=ISWAG_NEO, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val ISWAG_NEO = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=ISWAG, code=ISWAG_VIPER, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ISWAG, code=ISWAG_VIPER, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ISWAG_VIPER = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ISWAG, code=STREAM7, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ISWAG, code=STREAM7, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val STREAM7 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
