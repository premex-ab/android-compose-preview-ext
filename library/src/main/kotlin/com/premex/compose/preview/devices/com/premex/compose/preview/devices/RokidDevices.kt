package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Rokid device specifications for Android Compose previews.
 *
 * This extension provides Rokid device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rokid.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rokid: Any
  get() = object {
      /** DeviceSpec(manufacturer=Rokid, code=Station, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rokid, code=Station, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val STATION = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Rokid, code=station2, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rokid, code=station2, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val STATION2 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
