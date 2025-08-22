package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Kozen device specifications for Android Compose previews.
 *
 * This extension provides Kozen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kozen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kozen: Any
  get() = object {
      /** Kozen D1 */
      val D1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Kozen T05 */
      val T05 = "spec:width=480,height=800,unit=px,dpi=240"

  }
