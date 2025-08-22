package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Iris device specifications for Android Compose previews.
 *
 * This extension provides Iris device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iris.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iris: Any
  get() = object {
      /** DeviceSpec(manufacturer=Iris, code=shinagawa, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Iris, code=shinagawa, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
