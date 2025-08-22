package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IZZI device specifications for Android Compose previews.
 *
 * This extension provides IZZI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IZZI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IZZI: Any
  get() = object {
      /** DeviceSpec(manufacturer=IZZI, code=B820C-A15_ZTE, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IZZI, code=B820C-A15_ZTE,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val B820C_A15_ZTE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IZZI, code=B866V2Fi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IZZI, code=B866V2Fi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val B866V2FI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
