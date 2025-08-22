package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AoGo device specifications for Android Compose previews.
 *
 * This extension provides AoGo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AoGo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AoGo: Any
  get() = object {
      /** DeviceSpec(manufacturer=AoGo, code=AoGo1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AoGo, code=AoGo1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AOGO1 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
