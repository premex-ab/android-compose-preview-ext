package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Maxon device specifications for Android Compose previews.
 *
 * This extension provides Maxon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maxon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maxon: Any
  get() = object {
      /** Maxon Maxon_MX50 */
      val MAXON_MX50 = "spec:width=480,height=960,unit=px,dpi=240"

  }
