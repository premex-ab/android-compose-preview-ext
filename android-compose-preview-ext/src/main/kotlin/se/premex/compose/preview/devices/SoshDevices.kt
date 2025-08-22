package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Sosh device specifications for Android Compose previews.
 *
 * This extension provides Sosh device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sosh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sosh: Any
  get() = object {
      /** Sosh SoshPhone */
      val SOSHPHONE = "spec:width=480,height=960,unit=px,dpi=240"

  }
