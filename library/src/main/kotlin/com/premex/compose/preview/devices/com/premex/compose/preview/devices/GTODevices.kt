package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GTO device specifications for Android Compose previews.
 *
 * This extension provides GTO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTO: Any
  get() = object {
      /** DeviceSpec(manufacturer=GTO, code=M1092R, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GTO, code=M1092R, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M1092R = "spec:width=800,height=1280,unit=px,dpi=160"

  }
