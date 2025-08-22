package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Panodic device specifications for Android Compose previews.
 *
 * This extension provides Panodic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Panodic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Panodic: Any
  get() = object {
      /** Panodic IPHDCK16H */
      val IPHDCK16H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
