package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WeTap device specifications for Android Compose previews.
 *
 * This extension provides WeTap device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WeTap.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WeTap: Any
  get() = object {
      /** DeviceSpec(manufacturer=WeTap, code=WeTap_Y10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WeTap, code=WeTap_Y10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val WETAP_Y10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
