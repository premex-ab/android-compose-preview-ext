package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Haoqin device specifications for Android Compose previews.
 *
 * This extension provides Haoqin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Haoqin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Haoqin: Any
  get() = object {
      /** DeviceSpec(manufacturer=Haoqin, code=SpaceTab_H20, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haoqin, code=SpaceTab_H20,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val SPACETAB_H20 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Haoqin, code=SpaceTab_H20_EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haoqin, code=SpaceTab_H20_EEA,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val SPACETAB_H20_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
