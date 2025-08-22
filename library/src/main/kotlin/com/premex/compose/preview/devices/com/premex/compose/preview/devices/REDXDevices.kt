package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RED-X device specifications for Android Compose previews.
 *
 * This extension provides RED-X device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.REDX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.REDX: Any
  get() = object {
      /** DeviceSpec(manufacturer=RED-X, code=RED-X_RX4505, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RED-X, code=RED-X_RX4505,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val RED_X_RX4505 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RED-X, code=RED-X_RX4559, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RED-X, code=RED-X_RX4559,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val RED_X_RX4559 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RED-X, code=RX4618, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RED-X, code=RX4618, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val RX4618 = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RED-X, code=RX4802, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RED-X, code=RX4802, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val RX4802 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
