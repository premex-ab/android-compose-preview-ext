package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SSA device specifications for Android Compose previews.
 *
 * This extension provides SSA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SSA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SSA: Any
  get() = object {
      /** DeviceSpec(manufacturer=SSA, code=MID-1015T, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSA, code=MID-1015T, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MID_1015T = "spec:width=800,height=1280,unit=px,dpi=160"

  }
