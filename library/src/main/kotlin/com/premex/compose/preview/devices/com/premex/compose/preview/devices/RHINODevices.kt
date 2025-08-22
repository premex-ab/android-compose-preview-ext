package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RHINO device specifications for Android Compose previews.
 *
 * This extension provides RHINO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RHINO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RHINO: Any
  get() = object {
      /** DeviceSpec(manufacturer=RHINO, code=novax, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RHINO, code=novax, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val NOVAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RHINO, code=scoutx, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RHINO, code=scoutx, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SCOUTX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RHINO, code=stratos, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RHINO, code=stratos, width=1200,
      height=1920, dpi=260, isGoogleDevice=false).code */
      val STRATOS = "spec:width=1200,height=1920,unit=px,dpi=260"

  }
