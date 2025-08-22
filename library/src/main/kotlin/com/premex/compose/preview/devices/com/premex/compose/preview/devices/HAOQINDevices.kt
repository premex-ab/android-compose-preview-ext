package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HAOQIN device specifications for Android Compose previews.
 *
 * This extension provides HAOQIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HAOQIN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HAOQIN: Any
  get() = object {
      /** DeviceSpec(manufacturer=HAOQIN, code=H10Pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAOQIN, code=H10Pro, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val H10PRO = "spec:width=800,height=1280,unit=px,dpi=160"

  }
