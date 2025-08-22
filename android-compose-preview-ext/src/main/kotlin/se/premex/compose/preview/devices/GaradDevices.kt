package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GARAD device specifications for Android Compose previews.
 *
 * This extension provides GARAD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Garad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Garad: Any
  get() = object {
      /** GARAD GARAD_fire */
      val GARAD_FIRE = "spec:width=480,height=960,unit=px,dpi=240"

  }
