package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Imin device specifications for Android Compose previews.
 *
 * This extension provides Imin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Imin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Imin: Any
  get() = object {
      /** DeviceSpec(manufacturer=Imin, code=Swan1Pro, width=1080, height=1920, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Imin, code=Swan1Pro, width=1080,
      height=1920, dpi=220, isGoogleDevice=false).code */
      val SWAN1PRO = "spec:width=1080,height=1920,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Imin, code=Swift2Pro, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Imin, code=Swift2Pro, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val SWIFT2PRO = "spec:width=720,height=1600,unit=px,dpi=280"

  }
