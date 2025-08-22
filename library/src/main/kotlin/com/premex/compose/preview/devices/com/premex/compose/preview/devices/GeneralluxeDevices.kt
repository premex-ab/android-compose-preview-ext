package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * General_luxe device specifications for Android Compose previews.
 *
 * This extension provides General_luxe device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Generalluxe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Generalluxe: Any
  get() = object {
      /** DeviceSpec(manufacturer=General_luxe, code=Shahin_III, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=General_luxe, code=Shahin_III,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val SHAHIN_III = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
