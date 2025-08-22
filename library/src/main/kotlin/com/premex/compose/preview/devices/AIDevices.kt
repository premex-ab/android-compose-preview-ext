package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AI device specifications for Android Compose previews.
 *
 * This extension provides AI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AI: Any
  get() = object {
      /** AI Ai-ES1059 */
      val AI_ES1059 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
