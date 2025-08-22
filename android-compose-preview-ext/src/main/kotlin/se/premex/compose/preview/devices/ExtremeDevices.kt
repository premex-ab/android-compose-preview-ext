package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Extreme device specifications for Android Compose previews.
 *
 * This extension provides Extreme device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Extreme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Extreme: Any
  get() = object {
      /** Extreme Infinity */
      val INFINITY = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
