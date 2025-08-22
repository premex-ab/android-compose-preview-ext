package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PANORAMA device specifications for Android Compose previews.
 *
 * This extension provides PANORAMA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Panorama.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Panorama: Any
  get() = object {
      /** PANORAMA kualakai */
      val KUALAKAI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
