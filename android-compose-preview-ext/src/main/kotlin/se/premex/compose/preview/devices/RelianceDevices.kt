package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Reliance device specifications for Android Compose previews.
 *
 * This extension provides Reliance device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Reliance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Reliance: Any
  get() = object {
      /** Reliance RC500L */
      val RC500L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Reliance RC501L */
      val RC501L = "spec:width=720,height=1280,unit=px,dpi=320"

  }
