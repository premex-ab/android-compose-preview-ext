package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Sunbrite device specifications for Android Compose previews.
 *
 * This extension provides Sunbrite device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sunbrite.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sunbrite: Any
  get() = object {
      /** Sunbrite huangshan */
      val HUANGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
