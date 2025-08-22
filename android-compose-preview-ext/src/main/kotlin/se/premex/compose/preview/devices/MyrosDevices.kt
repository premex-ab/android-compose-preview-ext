package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Myros device specifications for Android Compose previews.
 *
 * This extension provides Myros device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Myros.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Myros: Any
  get() = object {
      /** Myros E70_Ultra */
      val E70_ULTRA = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
