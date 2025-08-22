package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IDC device specifications for Android Compose previews.
 *
 * This extension provides IDC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IDC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IDC: Any
  get() = object {
      /** DeviceSpec(manufacturer=IDC, code=EVO_G4, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IDC, code=EVO_G4, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val EVO_G4 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
