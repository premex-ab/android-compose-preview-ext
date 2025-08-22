package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Globe device specifications for Android Compose previews.
 *
 * This extension provides Globe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Globe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Globe: Any
  get() = object {
      /** DeviceSpec(manufacturer=Globe, code=SEI120G, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Globe, code=SEI120G, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SEI120G = "spec:width=720,height=1280,unit=px,dpi=213"

  }
