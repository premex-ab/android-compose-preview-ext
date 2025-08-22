package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Fastway device specifications for Android Compose previews.
 *
 * This extension provides Fastway device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fastway.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fastway: Any
  get() = object {
      /** Fastway DV8545-C-KIF */
      val DV8545_C_KIF = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
