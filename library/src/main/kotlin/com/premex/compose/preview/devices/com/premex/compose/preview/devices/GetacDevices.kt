package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Getac device specifications for Android Compose previews.
 *
 * This extension provides Getac device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Getac.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Getac: Any
  get() = object {
      /** DeviceSpec(manufacturer=Getac, code=zx10, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Getac, code=zx10, width=1200,
      height=1920, dpi=260, isGoogleDevice=false).code */
      val ZX10 = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Getac, code=zx70, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Getac, code=zx70, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ZX70 = "spec:width=720,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Getac, code=zx70g2, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Getac, code=zx70g2, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val ZX70G2 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Getac, code=zx80, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Getac, code=zx80, width=1200,
      height=1920, dpi=260, isGoogleDevice=false).code */
      val ZX80 = "spec:width=1200,height=1920,unit=px,dpi=260"

  }
