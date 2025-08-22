package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * swisstone device specifications for Android Compose previews.
 *
 * This extension provides swisstone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Swisstone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Swisstone: Any
  get() = object {
      /** DeviceSpec(manufacturer=swisstone, code=SD5103G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=swisstone, code=SD5103G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SD5103G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=swisstone, code=SD5304G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=swisstone, code=SD5304G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SD5304G = "spec:width=720,height=1280,unit=px,dpi=320"

  }
