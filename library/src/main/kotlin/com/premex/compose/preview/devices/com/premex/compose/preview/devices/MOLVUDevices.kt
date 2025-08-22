package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MOLVU device specifications for Android Compose previews.
 *
 * This extension provides MOLVU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MOLVU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MOLVU: Any
  get() = object {
      /** DeviceSpec(manufacturer=MOLVU, code=M10PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOLVU, code=M10PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MOLVU, code=V7S, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOLVU, code=V7S, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val V7S = "spec:width=600,height=1024,unit=px,dpi=160"

  }
