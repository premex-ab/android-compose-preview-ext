package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * XPPen device specifications for Android Compose previews.
 *
 * This extension provides XPPen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xppen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xppen: Any
  get() = object {
      /** XPPen Titan_XPPen */
      val TITAN_XPPEN = "spec:width=1440,height=2160,unit=px,dpi=320"

  }
