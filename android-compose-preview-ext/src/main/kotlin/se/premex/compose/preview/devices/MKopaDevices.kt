package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * M-KOPA device specifications for Android Compose previews.
 *
 * This extension provides M-KOPA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MKopa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MKopa: Any
  get() = object {
      /** M-KOPA S34 */
      val S34 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
