package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TTS device specifications for Android Compose previews.
 *
 * This extension provides TTS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TTS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TTS: Any
  get() = object {
      /** DeviceSpec(manufacturer=TTS, code=IT10268, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TTS, code=IT10268, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IT10268 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
