package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CellAllure device specifications for Android Compose previews.
 *
 * This extension provides CellAllure device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CellAllure.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CellAllure: Any
  get() = object {
      /** DeviceSpec(manufacturer=CellAllure, code=BIENESTAR_SMART, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CellAllure, code=BIENESTAR_SMART,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BIENESTAR_SMART = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CellAllure, code=Fashion_C, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CellAllure, code=Fashion_C,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val FASHION_C = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CellAllure, code=Miracle_Y, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CellAllure, code=Miracle_Y,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val MIRACLE_Y = "spec:width=720,height=1520,unit=px,dpi=320"

  }
