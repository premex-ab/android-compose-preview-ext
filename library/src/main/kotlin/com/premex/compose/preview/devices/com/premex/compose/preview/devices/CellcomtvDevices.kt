package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cellcomtv device specifications for Android Compose previews.
 *
 * This extension provides Cellcomtv device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cellcomtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cellcomtv: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cellcomtv, code=SEI800CC, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellcomtv, code=SEI800CC,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI800CC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cellcomtv, code=tai, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellcomtv, code=tai, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TAI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
