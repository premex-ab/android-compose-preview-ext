package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Specktron device specifications for Android Compose previews.
 *
 * This extension provides Specktron device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Specktron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Specktron: Any
  get() = object {
      /** Specktron CDX */
      val CDX = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
