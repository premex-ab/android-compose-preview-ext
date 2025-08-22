package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Ecopower device specifications for Android Compose previews.
 *
 * This extension provides Ecopower device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ecopower.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ecopower: Any
  get() = object {
      /** Ecopower EP-A100 */
      val EP_A100 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
