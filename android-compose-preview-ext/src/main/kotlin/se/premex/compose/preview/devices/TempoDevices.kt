package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Tempo device specifications for Android Compose previews.
 *
 * This extension provides Tempo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tempo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tempo: Any
  get() = object {
      /** Tempo hanyang */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
