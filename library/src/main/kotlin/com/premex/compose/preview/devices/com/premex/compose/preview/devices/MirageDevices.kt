package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mirage device specifications for Android Compose previews.
 *
 * This extension provides Mirage device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mirage.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mirage: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mirage, code=MI-CH-82S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mirage, code=MI-CH-82S, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MI_CH_82S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mirage, code=62S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mirage, code=62S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val _62S = "spec:width=480,height=854,unit=px,dpi=240"

  }
