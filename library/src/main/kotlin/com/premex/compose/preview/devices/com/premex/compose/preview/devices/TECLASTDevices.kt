package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TECLAST device specifications for Android Compose previews.
 *
 * This extension provides TECLAST device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TECLAST.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TECLAST: Any
  get() = object {
      /** DeviceSpec(manufacturer=TECLAST, code=M40_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECLAST, code=M40_EEA, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val M40_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECLAST, code=M40_ROW, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECLAST, code=M40_ROW, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val M40_ROW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECLAST, code=P30_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECLAST, code=P30_ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P30_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

  }
