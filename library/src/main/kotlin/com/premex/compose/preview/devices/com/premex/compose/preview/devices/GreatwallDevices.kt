package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Greatwall device specifications for Android Compose previews.
 *
 * This extension provides Greatwall device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Greatwall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Greatwall: Any
  get() = object {
      /** DeviceSpec(manufacturer=Greatwall, code=GWPad-S11, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Greatwall, code=GWPad-S11,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val GWPAD_S11 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Greatwall, code=GWPad-S11-1, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Greatwall, code=GWPad-S11-1,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val GWPAD_S11_1 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
