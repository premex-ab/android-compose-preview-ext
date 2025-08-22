package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Swissvoice device specifications for Android Compose previews.
 *
 * This extension provides Swissvoice device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Swissvoice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Swissvoice: Any
  get() = object {
      /** DeviceSpec(manufacturer=Swissvoice, code=G50, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Swissvoice, code=G50, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G50 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
