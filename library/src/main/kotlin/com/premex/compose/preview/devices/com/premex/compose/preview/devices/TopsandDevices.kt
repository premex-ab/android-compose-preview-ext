package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Topsand device specifications for Android Compose previews.
 *
 * This extension provides Topsand device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Topsand.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Topsand: Any
  get() = object {
      /** DeviceSpec(manufacturer=Topsand, code=N10_T, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Topsand, code=N10_T, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val N10_T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Topsand, code=N8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Topsand, code=N8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val N8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
