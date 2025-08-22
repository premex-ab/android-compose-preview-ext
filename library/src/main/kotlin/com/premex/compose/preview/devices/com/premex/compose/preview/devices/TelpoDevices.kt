package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Telpo device specifications for Android Compose previews.
 *
 * This extension provides Telpo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telpo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telpo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Telpo, code=M10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telpo, code=M10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Telpo, code=M1K, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telpo, code=M1K, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M1K = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Telpo, code=M8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telpo, code=M8, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M8 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
