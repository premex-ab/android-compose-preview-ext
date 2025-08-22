package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Horion device specifications for Android Compose previews.
 *
 * This extension provides Horion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Horion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Horion: Any
  get() = object {
      /** DeviceSpec(manufacturer=Horion, code=M6APro, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Horion, code=M6APro, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val M6APRO = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
