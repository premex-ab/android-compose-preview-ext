package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Torex device specifications for Android Compose previews.
 *
 * This extension provides Torex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Torex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Torex: Any
  get() = object {
      /** Torex Torex8plus */
      val TOREX8PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
