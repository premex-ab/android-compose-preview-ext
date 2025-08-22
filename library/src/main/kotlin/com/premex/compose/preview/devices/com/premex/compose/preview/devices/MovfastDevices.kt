package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Movfast device specifications for Android Compose previews.
 *
 * This extension provides Movfast device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Movfast.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Movfast: Any
  get() = object {
      /** DeviceSpec(manufacturer=Movfast, code=MFT1522, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Movfast, code=MFT1522, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val MFT1522 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Movfast, code=MFT1621, width=480, height=800, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Movfast, code=MFT1621, width=480,
      height=800, dpi=220, isGoogleDevice=false).code */
      val MFT1621 = "spec:width=480,height=800,unit=px,dpi=220"

  }
