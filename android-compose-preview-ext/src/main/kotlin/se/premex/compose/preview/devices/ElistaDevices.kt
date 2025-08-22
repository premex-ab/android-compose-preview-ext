package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Elista device specifications for Android Compose previews.
 *
 * This extension provides Elista device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elista.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elista: Any
  get() = object {
      /** Elista lakeside */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
