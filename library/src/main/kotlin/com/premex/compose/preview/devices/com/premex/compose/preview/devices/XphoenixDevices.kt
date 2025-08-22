package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Xphoenix device specifications for Android Compose previews.
 *
 * This extension provides Xphoenix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xphoenix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xphoenix: Any
  get() = object {
      /** DeviceSpec(manufacturer=Xphoenix, code=OneTabPro2, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xphoenix, code=OneTabPro2,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val ONETABPRO2 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Xphoenix, code=OneTabProMate, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xphoenix, code=OneTabProMate,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val ONETABPROMATE = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
