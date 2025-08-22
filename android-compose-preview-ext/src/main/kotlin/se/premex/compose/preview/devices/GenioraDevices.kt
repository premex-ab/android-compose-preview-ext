package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Geniora device specifications for Android Compose previews.
 *
 * This extension provides Geniora device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Geniora.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Geniora: Any
  get() = object {
      /** Geniora GEN1 */
      val GEN1 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
