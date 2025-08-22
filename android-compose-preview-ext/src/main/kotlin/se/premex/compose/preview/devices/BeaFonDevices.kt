package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Bea-fon device specifications for Android Compose previews.
 *
 * This extension provides Bea-fon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BeaFon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BeaFon: Any
  get() = object {
      /** Bea-fon MX1 */
      val MX1 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
