package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MediaTek device specifications for Android Compose previews.
 *
 * This extension provides MediaTek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MediaTek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MediaTek: Any
  get() = object {
      /** DeviceSpec(manufacturer=MediaTek, code=m7332_eu, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MediaTek, code=m7332_eu,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val M7332_EU = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MediaTek, code=mt5862_512m, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MediaTek, code=mt5862_512m,
      width=720, height=1280, dpi=160, isGoogleDevice=false).code */
      val MT5862_512M = "spec:width=720,height=1280,unit=px,dpi=160"

  }
