package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Beko device specifications for Android Compose previews.
 *
 * This extension provides Beko device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Beko.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Beko: Any
  get() = object {
      /** DeviceSpec(manufacturer=Beko, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Beko, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Beko, code=shinagawa, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Beko, code=shinagawa, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
