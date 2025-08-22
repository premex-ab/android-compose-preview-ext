package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mengdash device specifications for Android Compose previews.
 *
 * This extension provides Mengdash device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mengdash.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mengdash: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mengdash, code=M_Q58, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mengdash, code=M_Q58, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M_Q58 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
