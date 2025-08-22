package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SQOOL device specifications for Android Compose previews.
 *
 * This extension provides SQOOL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SQOOL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SQOOL: Any
  get() = object {
      /** DeviceSpec(manufacturer=SQOOL, code=SQOOL-V4, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SQOOL, code=SQOOL-V4, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SQOOL_V4 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SQOOL, code=SQOOL-V41, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SQOOL, code=SQOOL-V41, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SQOOL_V41 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
