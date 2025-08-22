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
 * @Preview(device = Devices.Tts.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tts: Any
  get() = object {
      /** TTS IT10268 */
      val IT10268 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
