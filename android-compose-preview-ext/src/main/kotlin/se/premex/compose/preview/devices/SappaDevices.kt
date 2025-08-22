package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Sappa device specifications for Android Compose previews.
 *
 * This extension provides Sappa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sappa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sappa: Any
  get() = object {
      /** Sappa SEI904SAP */
      val SEI904SAP = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
