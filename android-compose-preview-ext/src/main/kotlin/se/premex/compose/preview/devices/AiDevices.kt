package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AI device specifications for Android Compose previews.
 *
 * This extension provides AI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ai: Any
  get() = object {
      /** AI Ai-ES1059 */
      val AI_ES1059 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
