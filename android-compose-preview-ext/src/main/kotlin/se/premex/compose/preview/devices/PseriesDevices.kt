package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Pseries device specifications for Android Compose previews.
 *
 * This extension provides Pseries device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pseries.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pseries: Any
  get() = object {
      /** Pseries lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

  }
