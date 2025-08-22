package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tanoshi device specifications for Android Compose previews.
 *
 * This extension provides Tanoshi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tanoshi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tanoshi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tanoshi, code=TTBKB10-01, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tanoshi, code=TTBKB10-01,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TTBKB10_01 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
