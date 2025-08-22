package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Proline device specifications for Android Compose previews.
 *
 * This extension provides Proline device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Proline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Proline: Any
  get() = object {
      /** DeviceSpec(manufacturer=Proline, code=H1010, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Proline, code=H1010, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val H1010 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Proline, code=H10888M, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Proline, code=H10888M, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val H10888M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Proline, code=Proline_FalconXL, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Proline, code=Proline_FalconXL,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val PROLINE_FALCONXL = "spec:width=720,height=1440,unit=px,dpi=320"

  }
